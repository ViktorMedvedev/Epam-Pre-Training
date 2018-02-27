package by.epam.preTraining.task6.exception;

public class EmptyContainerException extends TechnicalException {
    public EmptyContainerException() {
    }

    public EmptyContainerException(String message) {
        super(message);
    }

    public EmptyContainerException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyContainerException(Throwable cause) {
        super(cause);
    }

    public EmptyContainerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
