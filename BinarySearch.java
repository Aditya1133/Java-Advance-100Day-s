import java.util.*;
public class BinarySearch{
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
        int s=sc.nextInt();
        int l = 0, r=n-1;
        while (l <= r) {
            int m = (l +r) / 2;
 
            // Check if x is present at mid
            if (arr[m] == s){
                System.out.println("The number was found at index:- "+m);
            }
            if (arr[m] < s)
                l = m + 1;

            else
                r = m - 1;
        }
        
    }
}