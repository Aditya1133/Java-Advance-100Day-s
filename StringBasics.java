import java.util.*;
public class StringBasics{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        //Declaring and initializing a string variable
        System.out.print("Enter the String:- ");
        String str = sc.nextLine();
        //To find the length of the string 
        int len=str.length();
        System.out.println("The original value of the string is: "+str);
        //To See all the character of the String
        for (int i = 0;i<len;++i){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
        //To create a substring we use
        String sub=str.substring(3,7);
        System.out.println("The Substring is :- "+sub);
        //To replace some characters in our string with other ones using ReplaceAll method
        String oldStr="12a45bddd6ca";
        String newStr=oldStr.replaceAll("\\d","#");//This will replaces any digit present
        System.out.println("After repaceing all the D the new String is:- "+newStr);
    }
}