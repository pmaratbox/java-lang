static void inc(int[] box) {
    box[0]++;
}

void main() {
    int[] box = {1};
    IO.println("before: " + box[0]);
    inc(box);
    IO.println("after: " + box[0]);
}
