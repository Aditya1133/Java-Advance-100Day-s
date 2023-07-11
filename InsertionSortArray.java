import java.util.*;
public class InsertionSortArray{
    public static void Sort(int arr[],int n){
        for(int i=1;i<n;i++){
            int keyvalue=arr[i];
            int j=i-1;
            while(j>=0 &&arr[j]>keyvalue){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=keyvalue;
        }
        System.out.println("The array after sort:-");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
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
        Sort(arr,n);
    }
}