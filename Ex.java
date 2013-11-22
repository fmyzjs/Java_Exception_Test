
public class Ex {
  public static void main(String[] args){
try {	int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            double c=a/b;
  	   System.out.println(c);
     }catch(ArrayIndexOutOfBoundsException e)  {
    	   System.out.println("Capture array subscript transcendence exception");
     }catch(NumberFormatException e)  {
    	   System.out.println("Capture data format exception");
     }catch(ArithmeticException e)  {
    	   System.out.println("Capture arithmetic exception");
     }finally  {
    	   System.out.println("Continue running other code");
     }	  	
   }	
}

