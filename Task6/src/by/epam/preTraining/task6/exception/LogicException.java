package by.epam.preTraining.task6.exception;

public class LogicException extends MyProjectException {
    public LogicException() {
    }

    public LogicException(String message) {
        super(message);
    }

    public LogicException(String message, Throwable cause) {
        super(message, cause);
    }

    public LogicException(Throwable cause) {
        super(cause);
    }

    public LogicException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
