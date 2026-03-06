public class TwoSum {
 public static void A(int arr[],int target){
    for(int i=0;i<arr.length;i++){
        int j=i+1;
        if(arr[i]+arr[j]==target){
            System.out.println(i+""+j);
            j++;
        }
    }
 }
    public static void main(String[] args){
        int[] arr={7,2,8,9,11,3};
        int target=9;
        A(arr,target);
    }
}
