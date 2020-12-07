package florist.exceptions;

public class WrongFlowerLengthException extends Exception{
    public WrongFlowerLengthException(String errorMessage){
        super(errorMessage);
    }
}
