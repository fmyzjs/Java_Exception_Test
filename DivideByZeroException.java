public class DivideByZeroException extends ArithmeticException{ 
     public DivideByZeroException() {      
         super("Attempted to divide by zero");       
     } 
     public DivideByZeroException(String exp) {      
         super(exp);       
     } 
 }
