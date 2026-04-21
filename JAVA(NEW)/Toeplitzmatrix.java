import java.util.*;
public class Toeplitzmatrix {
    public static void Toplitzmatrixx(int[][] mat){
        int n=mat.length;
        int m=mat[0].length;
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(mat[i][j]==mat[i-1][j-1]){
                    System.out.println("True: ITs a toplitz");
                    break;
                }else{
                    System.out.println("Not a toplitz");
                    break;
                }
            }
        }
    }
    public static void main(String[] args){
        
        Toeplitzmatrix t=new Toeplitzmatrix();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] mat=new int[n][m]; 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            mat[i][j]=sc.nextInt();            }
        }
        t.Toplitzmatrixx(mat);


    }
}
