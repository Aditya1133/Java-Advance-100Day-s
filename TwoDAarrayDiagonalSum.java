import java.util.*;
public class TwoDAarrayDiagonalSum{
    public static void SumTwoDimensionalArray(int arr[][],int r,int c){
        int sum=0;
        for(int i=0;i<r;i++){
            int a=arr[i][i];
            sum+=a;
        }
        System.out.println("The multi of array is:- "+sum);
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the row :-- ");
        int r=sc.nextInt();
        System.out.println("enter the length of the coloumn :-- ");
        int c=sc.nextInt();

        int[][] arr = new int[10][10]; // creating a two-dimensional array ofintMatrix(arr);
        for (int i = 0; i < r ; i++) {
            for (int j = 0; j <c ; j++){
                System.out.println("Enter the element at index  "+i+"  and at index  "+j);
                arr[i][j]=sc.nextInt();
            }
        }
        SumTwoDimensionalArray(arr,r,c);// calling function to display matrix

    }
}