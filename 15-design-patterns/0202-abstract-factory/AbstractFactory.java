public class AbstractFactory {
    interface Button { String label(); }
    interface Checkbox { String label(); }

    static class DarkButton implements Button {
        public String label() { return "dark-button"; }
    }

    static class DarkCheckbox implements Checkbox {
        public String label() { return "dark-checkbox"; }
    }

    interface ThemeFactory {
        Button button();
        Checkbox checkbox();
    }

    static class DarkFactory implements ThemeFactory {
        public Button button() { return new DarkButton(); }
        public Checkbox checkbox() { return new DarkCheckbox(); }
    }

    public static void main(String[] args) {
        ThemeFactory f = new DarkFactory();
        System.out.println(f.button().label() + " " + f.checkbox().label());
    }
}
