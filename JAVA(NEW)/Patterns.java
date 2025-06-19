import java.util.*;
public class Patterns {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        /* ---Solid Rectangle---
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*------Hollow Rectangle--- 
        for (int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||i==n ||j==1|j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
               
                
            }
            System.out.println();

        }*/
        /*-----Half Pyramid----- 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
            */
        /*----Inverted half pyramid---- 
         for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
         }
            */
            /* ------half pyramid with spaces-----
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }*/
    /*------Half pyramid with number------- 
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
*/
         
 /*for(int i=1;i<=n;i++){
    for(int j=1;j<n-i+1;j++){
        System.out.print(j);
    }
    System.out.println();
 }
    */

   /*  int number=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
        System.out.print(number+" ");
        number++;
        }
        System.out.println();
    }
    */

   /*  for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            int sum=i+j;
            if(sum%2==0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
        System.out.println();

    }*/

    //------------ADVANCED PATTERNS---------------
      /* ----Butterfly Pattern--
      //upper part
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.err.print("*");
        }
        int spaces=2*(n-i);
        for(int j=1;j<=spaces;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
        System.out.print("*");
        }
        System.out.println();
      }
      //lower part
      for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.err.print("*");
        }
        int spaces=2*(n-i);
        for(int j=1;j<=spaces;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
        System.out.print("*");
        }
        System.out.println();
      }*/
/*--------Solid Rhombus------

      for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=m;j++){
            System.out.print("*");
        }
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        System.out.println();
      }*/
    /*-------Number Pyramid------ 
      for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        //numbers->this loopprint row number, row number times
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
      }*/
 /*------------Paliindromic Pattern-------- 
    for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }*/

    /*-------Diamond pattern----- 
    //upper part
    for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
       
        //stars
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }  
        System.out.println();
    }
    //lower part
    for(int i=n;i>=1;i--){
         for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
         for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }  
       
        System.out.println();
    }*/

        }
        
    }

