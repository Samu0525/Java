import java.util.*;
public class GCDGreatestCommonFactor{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        for(int i=1;i<Math.min(a,b);i++){// we took this i<Math.min(a,b) bcoz GCD Because GCD can never be greater than the smaller number.GCD of 12 and 18 cannot be more than 12.
            if(a%i==0 && b%i==0 ){
             c=i;
            }

        }
         System.out.print(c);
    }
}