import java.util.*;
public class Revision{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:- ");
        int num1 =sc.nextInt();
        System.out.print("Enter the Second number:- ");
        int num2 =sc.nextInt();
        System.out.print("Enter the operator:- ");
        String op= sc.next();
        int result=0;
        switch (op){
            case "+":
            result=(num1+num2);
            System.out.println("The result is :-  "+result);
            break;
            case "-":
            result=(num1-num2);
            System.out.println("The result is :-  "+result);
            break;
            case "*":
            result=(num1*num2);
            System.out.println("The result is :-  "+result);
            break;
            case "/":
            result=(num1/num2);
            System.out.println("The result is :-  "+result);
            break;
            default:
            System.out.println("Invalid operator");
            }
    }
}
