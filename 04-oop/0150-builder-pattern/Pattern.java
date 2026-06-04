import java.util.ArrayList;
import java.util.List;

public class Pattern {
    static class Pizza {
        private final String size;
        private final List<String> toppings;

        Pizza(String size, List<String> toppings) {
            this.size = size;
            this.toppings = toppings;
        }

        @Override
        public String toString() {
            return "Pizza(" + size + ", " + String.join(", ", toppings) + ")";
        }
    }

    static class PizzaBuilder {
        private String size;
        private final List<String> toppings = new ArrayList<>();

        PizzaBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        PizzaBuilder addTopping(String topping) {
            toppings.add(topping);
            return this;
        }

        Pizza build() {
            return new Pizza(size, toppings);
        }
    }

    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder().setSize("M").addTopping("cheese").build();
        System.out.println(pizza);
    }
}
