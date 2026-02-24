import java.util.*;
public class sandglass {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=i;s++){
                System.out.print("-");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for(int k=0;k<=n-i;k++){System.out.print("*");}
            System.out.println();
            
            }
            
            int m=3;
            for(int i=1;i<=m;i++){
                for(int j=0;j<=m-i;j++){
                    System.out.print("-");
                }
                for(int k=1;k<=i;k++){System.out.print("*");}
                for(int l=0;l<=i;l++){System.out.print("*");}
                System.out.println();
            }
            
            
        }
    }
