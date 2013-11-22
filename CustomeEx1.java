public class CustomeEx1 extends Exception{ 
     public CustomeEx1(){      
         super("Weight can not be negative !");       
     } 
     public CustomeEx1(String exp){      
         super(exp);       
     } 
 }