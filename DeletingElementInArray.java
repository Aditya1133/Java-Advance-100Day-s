import java.util.*;
public class DeletingElementInArray{
    public static void DeleteElement(int arr[], int n){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Postioj you want to delete:- ");
        int pos=sc.nextInt()-1;
        for(int i=pos;i<n;i++){
            arr[i]=arr[i+1];
        }
        System.out.println("The array afterdeletion :---");
        for(int j=0;j<n-1;j++){
        System.out.print(arr[j]+" ");
        }
    }
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.print("Enter the size of array: ");
        n =sc.nextInt();
        int arr[]= new int[20]; //declaring an integer type 1D Array
        for ( i=0 ; i<n ; i++ ) {
            System.out.println("\n Enter element "+(i+1)+":");
            arr[i]=sc.nextInt();   //inputting elements in the array using scanner object
            }
        DeleteElement(arr,n);
    }
}