import java.util.*;
public class Largestof3numbers{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=Math.max(a,Math.max(b,c));
        System.out.print("Max of all 3 are :"+max);
    }
}