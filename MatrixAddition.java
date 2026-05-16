import java.util.*;
public class MatrixAddition{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] matrix1=new int[2][2];
        int[][] matrix2=new int[2][2];
        int[][] matrix3=new int[2][2];

        System.out.print("Enter first matrix elements:");
        for(int i=0;i<2.;i++){
            for(int j=0;j<2;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter second matrix elements:");
        for(int i=0;i<2.;i++){
            for(int j=0;j<2;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<2.;i++){
            for(int j=0;j<2;j++){
                matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }

        System.out.println("Displaying the output of sum of two matrix:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(matrix3[i][j]);
            }
            System.out.println();
        }
    }
}