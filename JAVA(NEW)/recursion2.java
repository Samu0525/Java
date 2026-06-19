public class recursion{
    public static void fibonnacci(int a,int b,int count){
        if (count==0){
            return;
        }
        int c=a+b;
        System.out.print(count);
        fibonnacci(b,c,count-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in());
        int a=0;
        int b=1;
       System.out.print(a+" "+b);
        fibonnacci(0,1,10);
    }
}