class Widget {
    static int count = 0;

    Widget() {
        count++;
    }
}

public class InstanceCounter {
    public static void main(String[] args) {
        new Widget();
        new Widget();
        new Widget();
        System.out.println(Widget.count);
    }
}
