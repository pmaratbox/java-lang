static void inc(int[] box) {
    box[0]++;
}

void main() {
    int[] box = {1};
    System.out.println("before: " + box[0]);
    inc(box);
    System.out.println("after: " + box[0]);
}
