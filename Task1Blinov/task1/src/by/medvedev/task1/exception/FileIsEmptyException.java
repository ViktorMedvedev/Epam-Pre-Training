package by.medvedev.task1.exception;

import java.io.IOException;

public class FileIsEmptyException extends IOException {
    public FileIsEmptyException() {
    }

    public FileIsEmptyException(String message) {
        super(message);
    }

    public FileIsEmptyException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileIsEmptyException(Throwable cause) {
        super(cause);
    }


}
