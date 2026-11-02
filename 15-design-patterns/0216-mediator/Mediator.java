static class ChatMediator {
    Colleague a;
    Colleague b;
    void send(String from, String message) {
        if (from.equals("A")) {
            b.receive(message);
        } else {
            a.receive(message);
        }
    }
}

static class Colleague {
    final String name;
    final ChatMediator mediator;
    Colleague(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
    void send(String message) { mediator.send(name, message); }
    void receive(String message) {
        System.out.println(name + " got: " + message);
    }
}

void main() {
    var mediator = new ChatMediator();
    var a = new Colleague("A", mediator);
    var b = new Colleague("B", mediator);
    mediator.a = a;
    mediator.b = b;
    a.send("hi");
}
