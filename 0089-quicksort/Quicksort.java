import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Quicksort {
    static List<Integer> quicksort(List<Integer> items) {
        if (items.size() <= 1) return items;
        int pivot = items.get(0);
        List<Integer> less = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        for (int i = 1; i < items.size(); i++) {
            if (items.get(i) < pivot) less.add(items.get(i));
            else greater.add(items.get(i));
        }
        List<Integer> result = new ArrayList<>(quicksort(less));
        result.add(pivot);
        result.addAll(quicksort(greater));
        return result;
    }

    public static void main(String[] args) {
        List<Integer> data = List.of(3, 1, 4, 1, 5, 2);
        StringJoiner out = new StringJoiner(" ");
        for (int x : quicksort(data)) out.add(String.valueOf(x));
        System.out.println(out);
    }
}
