import java.util.*;
public class LinearSearch2{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n =sc.nextInt();
        int arr[]= new int[20];
        for (int i=0;i<n;i++){
            System.out.print("\t Enter element "+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to Search:-  ");
        int a=0;
        int s=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==s){
                System.out.println("Element was found !!! at Index:--"+i);
            }
            a=a+1;
        }   
        if(a==n){
            System.out.print("Element was not found");
        }     
    }
}