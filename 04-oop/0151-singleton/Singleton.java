static class Config {
    private static Config instance;

    private Config() {
    }

    static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }
}

void main() {
    var a = Config.getInstance();
    var b = Config.getInstance();
    System.out.println("same: " + (a == b ? "yes" : "no"));
}
