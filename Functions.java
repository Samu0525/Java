import java.util.*;
public class Functions {
    public static void printMyName(String name){
        System.out.println( "your name:"+name);
        return;
    }
    public static void add(int a,int b){
      int c=a+b;
       System.out.println("Addition of "+a+" and "+b+":"+c);
       return;
    }
    public static void factorial(int n){
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;

        }
        System.out.println("Factorial :"+factorial);
        return;
    }
    public static void main(String args[]){
        System.out.print("Enter your name: ");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        printMyName(name);//call our Function

        System.out.print("Enter the values of a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        add(a, b);
        System.out.print("Enter thr number whose factorial i sto befound: ");
        int n=sc.nextInt();
        factorial(n);


    }
}
