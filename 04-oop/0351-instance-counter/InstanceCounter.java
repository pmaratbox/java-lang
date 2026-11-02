class Widget {
    static int count = 0;

    Widget() {
        count++;
    }
}

public class InstanceCounter {
    void main() {
        new Widget();
        new Widget();
        new Widget();
        IO.println(Widget.count);
    }
}
