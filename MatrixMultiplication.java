import java.util.*;
public class MatrixMultiplication{
    public static void Matrix(int arr[][],int r,int c,int arr2[][],int r2,int c2){
        int arr3[][]=new int[10][10];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr3[i][j]=0;
                for(int k=0;k<r;k++){
                    arr3[i][j]+=arr[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("the matrix after printing :-");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE DETAILS of the 1st Matrix:--");
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
        System.out.println("ENTER THE DETAILS of the 2nd Matrix:--");
        System.out.println("enter the length of the row :-- ");
        int r2=sc.nextInt();
        System.out.println("enter the length of the coloumn :-- ");
        int c2=sc.nextInt();

        int[][] arr2 = new int[10][10]; // creating a two-dimensional array ofintMatrix(arr);
        for (int i = 0; i < r ; i++) {
            for (int j = 0; j <c ; j++){
                System.out.println("Enter the element at index  "+i+"  and at index  "+j);
                arr2[i][j]=sc.nextInt();
            }
        }
        Matrix(arr,r,c,arr2,r2,c2);
    }
}