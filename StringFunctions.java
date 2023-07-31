 import java.util.*;
 public class StringFunctions{
    public static void UpperCase(String str){
        char [] convert=str.toCharArray();
        for(int i=0;i<convert.length;i++){
            if(convert[i]>='a' && convert[i]<='z'){
                convert[i]=(char)((int)convert[i]-32);
            }
        }
        System.out.println("Upper case string is : ");
        // print the string array
        for (int i = 0; i < convert.length; i++) {
            System.out.print(convert[i]+" ");
        }
        System.out.println();
    }
        public static void LowerCase(String str){
            //other way to convert the String to lower case:--
            char [] convert2=str.toCharArray();
            for(int i=0;i<convert2.length;i++){
                if(convert2[i]>='A' && convert2[i]<='Z'){
                    convert2[i]=(char)((int)convert2[i]+32);
                }
            }
            System.out.println("Lower case string is : ");
            // print the string array
            for (int i = 0; i < convert2.length; i++) {
                System.out.print(convert2[i]+" ");
            }
            System.out.println();

         }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //to print the length of the string
        System.out.println("The length of the string is:- "+str.length());
        //to print each char
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.print("\n");
        //to convert the string to lowercase
        System.out.println("Enter the string to be converted in to lower case:-  ");
        String a=sc.nextLine();
        System.out.println("the string in the lower case is:-  "+a.toLowerCase());
        //to convert the string into upper case
        System.out.println("Enter the string to be converted in to upper case:-  ");
        String b=sc.nextLine();
        System.out.println("the string in the upper case is:-  "+b.toUpperCase());
        UpperCase(str);
        LowerCase(str);
        System.out.println("The concatination is:- "+a.concat(b));
        

 


    }
 }