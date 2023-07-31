import java.util.*;
public class ClassFinder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the IP address:--");
        String ip=sc.nextLine();
        int n=ip.indexOf('.');
        String host=ip.substring(0,n);
        int q=Integer.valueOf(host);
        if(q>=0&&q<=127){
            System.out.println("The Ip is from the class A");
        }
        else if(q>=128 &&q<=191){
            System.out.println("The Ip is from the class B");
        }
        else if(q>=192&&q<=223){
            System.out.println("The Ip is from the class C");
        }
        else if(q>=224&&q<=239){
            System.out.println("The Ip is from the class D");
        }
        else{
            System.out.println("The Ip is from the class E");

        }

    }
}