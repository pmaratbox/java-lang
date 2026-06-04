public class TurnstileFsm {
    static String step(String state, String event) {
        if (state.equals("locked") && event.equals("coin")) return "unlocked";
        if (state.equals("unlocked") && event.equals("push")) return "locked";
        return state;
    }

    public static void main(String[] args) {
        String[] events = {"coin", "push", "push"};
        String state = "locked";
        StringBuilder sb = new StringBuilder();
        for (String ev : events) {
            state = step(state, ev);
            if (sb.length() > 0) sb.append(' ');
            sb.append(state);
        }
        System.out.println(sb.toString());
    }
}
