public class Recursion {
    //print numbers from 1 to n
    public static void printNumbers(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }
    
    //print sum of 1st n numbers
    public static void printsum(int i,int n,int sum){
       
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
    sum+=i;
    printsum(i+1,n,sum);
    System.out.println(i);
    }

    //print factorial
    public static int calcfactorial(int n){
        if(n==1||n==0){
            return 1;
        }
        int fact_nm1=calcfactorial(n-1);
        int fact_n=n* fact_nm1;
        return fact_n;
        
    }


    //fibonacci series till nth term
     public static void printFibo(int a,int b,int nn){ //a->second last term b->last term
        if(nn==0){
        return;
        }
      int c=a+b;
      System.out.println(c);
      printFibo(b , c , nn-1);

     }


     //x^n 
     public static int calcPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
     int xPower1=calcPower(x , n-1);
     int xPown=x * xPower1;
     return xPown;
     }

     //x^ n (stack height=logn)

    public static int calcPowerr(int y, int nn){
        if(nn==0){
            return 1;
        }
        if(y==0){
            return 0;
        }

        if(nn%2==0){
          return calcPowerr(y,nn/2)*calcPowerr(y,nn/2);
        }
        else{
            return calcPowerr(y,nn/2)*calcPowerr(y,nn/2)*y;
        }
    }


   public static void main(String[] args){
    /*int n=5;
    printNumbers(n);

    printsum(0, 5, 0);

    int ans=calcfactorial(5);
    System.out.println(ans);
 */

    //facorial
   /* int a=0,b=1;
    System.out.println(a);
    System.out.println(b);
    int nn=7;

    //fibo
    printFibo(a,b,nn-2);

    //x^n
    int x=5; int n=2;
    int ans= calcPower(x,n );
     System.out.println(ans);
*/
 
     int y=2;
     int nn=5;
     int ans=calcPowerr(y,nn);
     System.out.println(ans);


   } 
}
