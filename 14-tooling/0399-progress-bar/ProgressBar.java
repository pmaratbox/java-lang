public class ProgressBar {
    public static void main(String[] args) {
        int width = 10;
        double pct = 0.4;
        int filled = (int) Math.round(width * pct);
        StringBuilder sb = new StringBuilder("[");
        sb.append("#".repeat(filled));
        sb.append("-".repeat(width - filled));
        sb.append("]");
        System.out.println(sb);
    }
}
