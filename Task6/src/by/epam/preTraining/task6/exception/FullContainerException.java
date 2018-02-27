package by.epam.preTraining.task6.exception;

public class FullContainerException extends TechnicalException {
    public FullContainerException() {
    }

    public FullContainerException(String message) {
        super(message);
    }

    public FullContainerException(String message, Throwable cause) {
        super(message, cause);
    }

    public FullContainerException(Throwable cause) {
        super(cause);
    }

    public FullContainerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
