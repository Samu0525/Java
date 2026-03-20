import java.util.*;
public class missingelementinarray {
    public static int missing(int[] arr){
        
        int n=arr.length+1;
        int expected=n*(n+1)/2;
        int accepted=0;
        for(int i:arr){
            accepted+=i;
        }
        int missing=expected-accepted;
        return missing;
    }
    public static void main(String[] args){
        int[] arr={1,2,4,5,6};
        System.out.print("The missing number is:"+missing(arr));
    }
}
