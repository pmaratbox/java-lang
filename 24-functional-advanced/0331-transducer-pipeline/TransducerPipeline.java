import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TransducerPipeline {
    // A transducer transforms a reducing step into another reducing step.
    interface Transducer<A, B> {
        <R> BiConsumer<R, A> apply(StepAdder<R, B> step);
    }

    interface StepAdder<R, B> {
        void add(R acc, B item);
    }

    static <A> Transducer<A, A> mapping(Function<A, A> f) {
        return new Transducer<A, A>() {
            public <R> BiConsumer<R, A> apply(StepAdder<R, A> step) {
                return (acc, x) -> step.add(acc, f.apply(x));
            }
        };
    }

    static <A> Transducer<A, A> filtering(Predicate<A> p) {
        return new Transducer<A, A>() {
            public <R> BiConsumer<R, A> apply(StepAdder<R, A> step) {
                return (acc, x) -> { if (p.test(x)) step.add(acc, x); };
            }
        };
    }

    public static void main(String[] args) {
        Function<Integer, Integer> inc = x -> x + 1;
        Predicate<Integer> even = x -> x % 2 == 0;

        StepAdder<List<Integer>, Integer> collect = List::add;
        // Compose: map(+1) then filter(even). Build inner step for filter,
        // then wrap with map.
        BiConsumer<List<Integer>, Integer> filterStep =
                filtering(even).apply(collect);
        StepAdder<List<Integer>, Integer> filterAsStep = filterStep::accept;
        BiConsumer<List<Integer>, Integer> pipeline =
                mapping(inc).apply(filterAsStep);

        List<Integer> result = new ArrayList<>();
        for (int x : List.of(1, 2, 3, 4)) {
            pipeline.accept(result, x);
        }

        System.out.println(result.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}
