static final int READ = 1;
static final int WRITE = 2;

void main() {
    var flags = READ | WRITE;
    var hasWrite = (flags & WRITE) != 0 ? "yes" : "no";
    System.out.println(flags + " " + hasWrite);
}
