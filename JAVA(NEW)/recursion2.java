public class recursion{
    public static void fibonnacci(int a,int b,int count){
        if (count==0){
            return;
        }
        int c=a+b;
        System.out.print(c);
        fibonnacci(b,c,count-1);
    }
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*facorial(n-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=1;
       System.out.print(a+" "+b);
        fibonnacci(0,1,10);

        int n=sc.nextInt();
        factorial(5);
    }
}