class BaseError extends Exception {
    BaseError(String message) {
        super(message);
    }
}

class SpecificError extends BaseError {
    SpecificError(String message) {
        super(message);
    }
}

public class ExceptionHierarchy {
    void main() {
        try {
            throw new SpecificError("boom");
        } catch (BaseError e) {
            System.out.println("caught base");
        }
    }
}
