import java.util.*;
public class LCM{
    public static void lcm(int a,int b){
        int max=(a>b)?a:b;// as LCM is always  bigger number or number grater than bigger number . It is greater than or equal to bigger number.
        while(true){
            if(max%a==0 && max%b==0){
                System.out.print(max+" ");
                break;
            }else{
                max++;
            }
        }
    }
    public static void main(String[] args){
       // System.out.println("LCM is:"+lcm(12,18));
       lcm(12,18);
    }
}