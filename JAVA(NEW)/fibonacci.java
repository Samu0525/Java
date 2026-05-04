public class fibonacci {
public static void fs(int a ,int b,int num ){
  System.out.println(a+" "+b+" ");
  for(int i=0;i<=num;i++){
    int c=a+b;
    System.out.println(c);
    a=b;
    b=c;
  }
 
}
    public static void main(String[] args){
        int a=0, b=1;
        int num=8;
        fs(a,b,num);
        fibonacci f=new fibonacci();
        f.fs(a, b, num);

    }
}
