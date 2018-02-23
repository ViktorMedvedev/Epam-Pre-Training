package by.epam.preTraining.task5.model.exceptions;

public class WrongCostException extends LogicExeption {

    public WrongCostException() {
    }

    public WrongCostException(String message) {
        super(message);
    }

    public WrongCostException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongCostException(Throwable cause) {
        super(cause);
    }

    public WrongCostException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
