/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mastj
 */
import java.util.*;
public class arithmeticop {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int num1,num2,add,sub,mult;
        float div;
        System.out.println("Enter Two Numbers: ");
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        add=num1+num2;
        sub=num1-num2;
        mult=num1*num2;
        div=(float)num1/num2;
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mult);
        System.out.println("Division: " + div);
    }
}
