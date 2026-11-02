static String step(String state, String event) {
    if (state.equals("locked") && event.equals("coin")) return "unlocked";
    if (state.equals("unlocked") && event.equals("push")) return "locked";
    return state;
}

void main() {
    String[] events = {"coin", "push", "push"};
    var state = "locked";
    var sb = new StringBuilder();
    for (var ev : events) {
        state = step(state, ev);
        if (sb.length() > 0) sb.append(' ');
        sb.append(state);
    }
    IO.println(sb.toString());
}
