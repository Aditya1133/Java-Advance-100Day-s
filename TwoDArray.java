import java.util.*;
public class TwoDArray{
    public static void printTwoDimensionalArray(int arr[][],int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
        }
        System.out.print("\n");
    }
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
        printTwoDimensionalArray(arr,r,c);// calling function to display matrix

    }
}