import java.util.*;
public class unionoftwoarrays {
    
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        HashSet<Integer> set=new HashSet<>();
        int n1=arr1.length;
        int n2=arr2.length;
        for(int i=0;i<n1;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<n2;i++){
            set.add(arr2[i]);
        }
        for(int ele:set){
            System.out.println(ele);
        }
    }
}
