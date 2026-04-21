public class armstrong {
    public static int armstong(int num){
         //num=123;
         int sum=0;
         while(num>0){
            int digit=num%10;
            sum +=digit*digit*digit;
            num=num/10;
         }
         return sum;
    }
    public static void main(String[] args){
        int num=123;
        System.out.print(armstong(num));
    }
}
