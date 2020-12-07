package florist.exceptions;

public class EmptyFlowerNameException extends Exception {

    public EmptyFlowerNameException(String errorMessage){
        super(errorMessage);
    }
}
