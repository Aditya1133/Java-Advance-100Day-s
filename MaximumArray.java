import java.util.*;
public class MaximumArray{
    public static void Maximum(int arr[],int n){
        int max=-141748;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum Value in the Array is :- "+max);
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
        Maximum(arr,n);
    }
}