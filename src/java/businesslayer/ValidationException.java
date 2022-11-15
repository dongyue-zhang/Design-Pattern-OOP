
package businesslayer;

/**
 * Exception for validations in StudnetBusinessLogic
 * @author dongyuezhang
 * @version 1.0
 * @since 18.0.2.1
 */
public class ValidationException extends Exception{
    /**
     * Non-argument constructor that calls non-arg constructor of superclass
     */
    public ValidationException() {
        super("Data not in valid format");
    }
    
    /**
     * Constructor with a String parameter
     * @param message a message that gives out information of the error
     */
    public ValidationException(String message){
        super(message);
    }

    /**
     * Constructor with a String and a Throwable object
     * @param message a message that gives out information of the error
     * @param throwable the cause of the error
     */
    public ValidationException(String message, Throwable throwable){
        super(message, throwable);
    }

    /**
     * Constructor with a Throwable object
     * @param throwable the cause of the error
     */
    public ValidationException(Throwable throwable){
        super(throwable);
    }
    
}
