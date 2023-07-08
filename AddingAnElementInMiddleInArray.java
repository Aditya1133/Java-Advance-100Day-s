import java.util.*;
public class AddingAnElementInMiddleInArray{
    public static void AddingElement(int arr[],int n){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the position to add the element:- ");
        int pos=sc.nextInt()-1; //converting 1-based indexing into zero
        if ((pos>=0) && (pos<=arr.length)){
            System.out.print("Enter value you want to insert: -");
            int val=sc.nextInt();
            for (int j=n-1;j>=pos;j--){
                arr[j+1]=arr[j];
            }
            arr[pos]=val;
        }
        for(int i=0;i<=n;i++){
            System.out.println(arr[i]+" ");
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
        AddingElement(arr,n);
    }
}