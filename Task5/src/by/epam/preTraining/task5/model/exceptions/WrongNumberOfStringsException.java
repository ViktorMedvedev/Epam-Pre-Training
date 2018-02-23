package by.epam.preTraining.task5.model.exceptions;

public class WrongNumberOfStringsException extends LogicExeption{

    public WrongNumberOfStringsException() {
    }

    public WrongNumberOfStringsException(String message) {
        super(message);
    }

    public WrongNumberOfStringsException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongNumberOfStringsException(Throwable cause) {
        super(cause);
    }

    public WrongNumberOfStringsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
