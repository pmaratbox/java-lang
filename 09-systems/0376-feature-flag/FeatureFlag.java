static String evaluate(boolean flag) {
    return flag ? "enabled" : "disabled";
}

void main() {
    System.out.println(evaluate(true) + " " + evaluate(false));
}
