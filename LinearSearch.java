import java.util.*;
public class LinearSearch{
    public static void SearchArray(int arr[],int n,int s){
        boolean found = false;
        int i=0;
        for(i=0;i<=n-1 &&!found;++i){
        if(arr[i]==s)//if we find a match then set flag true and break
        found=true;
        }
        if(!found)
        System.out.println("Element not present.");//else print that no such number is there
        else
        System.out.println("The index at which Element was Found :"+i);//returning
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int arr[]= new int[20]; //declaring an integer type 1D Array
        for ( int i=0 ; i<n ; i++ ) {
            System.out.println("\n Enter element "+(i+1)+":");
            arr[i]=sc.nextInt();   //inputting elements in the array using scanner object
        }
        System.out.println("Enter the element to search:- ");
        int s=sc.nextInt();
        SearchArray(arr,n,s);
    }
}