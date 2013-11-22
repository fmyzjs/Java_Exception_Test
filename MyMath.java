
import java.util.Scanner;
import java.io.*; 
public class MyMath{ 
    private static double division(double a, double b) throws DivideByZeroException { 
            if (b == 0)  throw new DivideByZeroException(); 
            return(a/b);
}
public static void main(String args[]) { 
        double a=0, b=0, result=0; 
        Scanner s=new Scanner(System.in);
        try { 
            System.out.println("Enter the first number:"); 
            a = s.nextDouble(); 
            System.out.println("Enter the second number:"); 
            b = s.nextDouble(); 
            result = division(a,b); 
            System.out.println(a + "/"+ b +" = " + result); 
        }  catch (DivideByZeroException e) { 
              System.out.println(e.toString()); 
        } catch (Exception e) { 
             System.out.println("Invalid digit entered!"); 
        } 
  } 
}     
