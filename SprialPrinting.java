import java.util.*;
public class SprialPrinting{
    public static void printingTwoDimensionalArray(int arr[][],int r,int c){
        int row=0;
        int col=0;
        int count=0;
        while(count<=(r*c)){
            for(int i=col;i<c;i++){
                System.out.print(arr[row][i]+" ");
                count++;
            }
            row++;
            for(int i=row;i<r;i++){
                System.out.print(arr[i][c-1]+" ");
                count++;
            }
            c--;
            for(int i=c-1;i>=col;i--){
                System.out.print(arr[r-1][i]+" ");
                count++;
            }
            r--;
            for(int i=r-1;i>=row;i--){
                System.out.print(arr[i][col]+" ");
            }
            col++;                        
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
        System.out.println("The Sprial printing s :- ");
        printingTwoDimensionalArray(arr,r,c);// calling function to display matrix
    }
}