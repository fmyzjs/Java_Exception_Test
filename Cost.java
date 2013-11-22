import java.util.Scanner;
import java.io.*; 
public class Cost{ 
    private static int cost(double a) throws CustomeEx1,CustomeEx2{ 
           int b=0;
            if (a < 0.0)  throw new CustomeEx1(); 
            if (a > 50.0) throw new CustomeEx2();
            if (a < 1.0) b=10;
            if (a == 0) b=0;
             if (a >= 1.0)
            {
            	int c=(int)(a);
                b=(10+5*c);
            }
             return b;
            }
public static void main(String args[]) { 
        double a=0;
        int pay=0;
        Scanner s=new Scanner(System.in);
        try { 
            System.out.println("Enter the weight:"); 
            a = s.nextDouble();      
            pay = cost(a); 
            System.out.println("Cost£º"+ pay + "£¤"); 
             
        }  catch (CustomeEx1 e) { 
              System.out.println(e.toString()); 
              
        } catch (CustomeEx1 e) { 
             System.out.println(e.toString()); 
        } catch (Exception e) { 
             System.out.println("Invalid integer entered!"); 
        } 

        } 
  }    