package customException;

public class CompanyIdentifierException extends RuntimeException {
    public static final long serialVersionUID = 1L;

    public CompanyIdentifierException(String message){
        super(message);
    }
}
