package by.medvedev.exception;

public class NotSuitableConeException extends Exception {
    public NotSuitableConeException() {
    }

    public NotSuitableConeException(String message) {
        super(message);
    }

    public NotSuitableConeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotSuitableConeException(Throwable cause) {
        super(cause);
    }

    public NotSuitableConeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
