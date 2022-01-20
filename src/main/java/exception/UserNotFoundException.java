package exception;

public class UserNotFoundException extends NullPointerException{
    public UserNotFoundException() {
        super();
    }

    @Override
    public String toString() {
        return "UserNotFound{}";
    }
}
