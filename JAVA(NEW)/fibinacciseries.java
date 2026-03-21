public class fibinacciseries {
    public static void fibonnaci(int f1,int f2,int n){
       System.out.println(f1+" "+f2+" ");
        for(int i=2;i<n;i++){
             int temp=f1+f2;
             f1=f2;
             f2=temp;
             System.out.print(" "+temp);
        }
        

    }
    public static void main(String[] args){
        int f1=0;
        int f2=1;
        int n=8;
        fibonnaci(f1, f2, n);
    }
}
