package com.ExceptionalHandlingAssignment;
import java.util.Scanner;
public class Unsupported {


    int a;
    int b;
     
    
    void division()  {
        try {
        int c=a/b;
        int r=a%b;
        System.out.println("Quotient= "+c);
        System.out.println("Reminder= "+r);
        }
        catch(ArithmeticException ex) {
            //System.out.println("We can't divide any number by 0");
            throw new UnsupportedOperationException("We cant divide any number by 0");
        }
    }
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        Unsupported arth=new Unsupported();
        System.out.println("Enter the value of dividend");
        arth.a = scanner.nextInt();
        System.out.println("Enter the value of Divisor");
        arth.b = scanner.nextInt();
        arth.division();
        scanner.close();
    }
    



}