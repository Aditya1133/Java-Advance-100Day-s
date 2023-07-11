import java.util.*;
public class MinimumArray{
    public static void Minimum(int arr[],int n){
        int min=141748;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The minimum Value in the Array is :- "+min);
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n =sc.nextInt();
        int arr[]= new int[20];
        for (int i=0;i<n ;i++){
            System.out.println("enter element "+(i+1));
            arr[i]=sc.nextInt();
        }
        Minimum(arr,n);
    }
}