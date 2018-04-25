package by.medvedev.task1.exception;

public class WrongPathException extends Exception {
    public WrongPathException() {
    }

    public WrongPathException(String message) {
        super(message);
    }

    public WrongPathException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongPathException(Throwable cause) {
        super(cause);
    }

    public WrongPathException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
