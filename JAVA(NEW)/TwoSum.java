import java.util.HashMap;

public class TwoSum {
//  public static void A(int arr[],int target){
//     for(int i=0;i<arr.length;i++){
//         int j=i+1;
//         if(arr[i]+arr[j]==target){
//             System.out.println(i+""+j);
//             j++;
//         }
//     }
//  }
//Two Sum-Optimal Solution:
public static void twosum(int[] arr,int target){
    HashMap<Integer,Integer> mp=new HashMap<>();
    int n=arr.length;
    for(int i=0;i<n;i++){
        int c=target-arr[i];
        if(mp.containsKey(c)){
            System.out.println("Found at index:"+mp.get(c)+","+i);
        }
        mp.put(arr[i],i);
    }
    System.out.println("Not found");

}
    public static void main(String[] args){
        int[] arr={7,2,8,9,11,3};
        int target=9;
       // A(arr,target);
       twosum(arr, target);
    }
}
