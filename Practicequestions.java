import java.util.*;
public class Practicequestions {
    public static void average(int a,int b,int c){
        int total=0;
        total=a+b+c;
        int average=total/3;
        System.out.println("Average is :"+average);
        
    }
    public static void oddSum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
            
        }
        System.out.println("Sum of 1 to n is :"+sum);

    }
    public static int greatestnumber( int p,int q){
        
        if(p>q){
            System.out.println(p+" Is graetst");
            return p;
        }else{
            System.out.println(q+"Is graetst");
            return q;
        }
    }
    public static void GCD(int x,int y){
        while(x!=y){
            if(x>y){
                x=x-y;
            }else{
                y=y-x;
            }
        }
     System.out.println("GCD is: "+x);
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Numbers ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        average(a, b, c);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        oddSum(n);
        greatestnumber(10,100);
        System.out.println("Enter the values of xand y");
        int x=sc.nextInt();
        int y=sc.nextInt();
        GCD(x,y);

        //Fibonnacci whole code ijn main not writtten in the separate function
        
        int k=sc.nextInt();
        int s=0;
        int t=1;
        System.out.println(s+" ");
        if(k>1){
        for(int i=2;i<=k;i++){
            System.out.println(t+" ");
            int temp=t;
            t=s+t;
            s=t;
           
        }
        System.out.println();
    
    }





    }

    
}
