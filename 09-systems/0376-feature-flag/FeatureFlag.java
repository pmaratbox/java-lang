static String evaluate(boolean flag) {
    return flag ? "enabled" : "disabled";
}

void main() {
    IO.println(evaluate(true) + " " + evaluate(false));
}
