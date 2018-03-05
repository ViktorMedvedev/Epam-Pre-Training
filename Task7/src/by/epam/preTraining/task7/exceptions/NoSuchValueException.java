package by.epam.preTraining.task7.exceptions;

public class NoSuchValueException extends Exception {
    public NoSuchValueException() {
    }

    public NoSuchValueException(String message) {
        super(message);
    }

    public NoSuchValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchValueException(Throwable cause) {
        super(cause);
    }

    public NoSuchValueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
