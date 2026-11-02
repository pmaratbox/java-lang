interface Subject {
    String request();
}

static class RealSubject implements Subject {
    public String request() { return "loaded"; }
}

static class VirtualProxy implements Subject {
    private RealSubject real;
    public String request() {
        if (real == null) {
            real = new RealSubject();
        }
        return real.request();
    }
}

void main() {
    Subject s = new VirtualProxy();
    System.out.println(s.request());
}
