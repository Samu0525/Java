import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;
import java.math.*;

public class numbers {
    public static int reverse(int n){
    //123
    int rev=0;
    while(n>0){
    int digit=n%10;
    rev=rev*10+digit;
    n=n/10;
    }
    return rev;

}
    public static int sumn(int n){
        int sumn=0;
        while(n>0){
            int digit=n%10;
            sumn=sumn+digit;
            n=n/10;
        }
       return sumn;
    }
    public static int ArmStrong(int n){
        String str=Integer.toString(n);
        int l=str.length();
        int sum=0;
        while(n!=0){
            int digit=n%10;
            //power*=digit;
             double s=Math.pow(digit,l);// as math.pw return double 
             sum+=s;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        while(true){
            System.out.println("1.reverse 2.Exit 3.sum 4.Armstong value");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Reverse of a number is:"+reverse(n));
                    break;
                case 2:
                    System.out.println("Exiting");
                    return;
                case 3:
                    System.out.println("Sum:"+sumn(n));
                    break;
                case 4:
                    System.out.println("Armstrong of Number:"+ArmStrong(n));
                    break;
                default:
                    break;
            }
        }
    }
}
