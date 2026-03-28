public class  Subarraysumeqltargetpositive{
    public static void  B(int[] arr,int target){
        int left=0;
        int sum=0;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            if(sum>target &&left<=right){
                sum-=arr[left];
                left++;
            }
            if(sum==target){
            for(int i=left;i<=right;i++){
                System.out.print(arr[i]);
            }}
        }
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int target=9;
        B(arr, target);
    }
}
