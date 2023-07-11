import java.util.*;
public class SelectionSortArray{
    public static void Sort(int arr[],int n){
        for(int i=0;i<n;i++){
            int index=i;
            for(int j=i;j<n;j++){
            if(arr[j]<arr[index]){
                index=j;
            }
        }
        //swaping elements using temporary variable
        int temp=arr[i];
        arr[i]=arr[index];
        arr[index]=temp;
    }
     System.out.println("The array after the sort:-");
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
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