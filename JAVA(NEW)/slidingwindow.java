public class slidingwindow {
    public static int sum(int[] arr){
        int curr=0;
        int target =9;
        int window=3;
        for(int i=0;i<window;i++){
            curr+=arr[i];
            if(i==target){
                return i;
            }
        }

        int max=curr;
        for(int i=1;i<=arr.length-window;i++){
            curr=curr-arr[i-1]+arr[i+window-1];
             if(curr>max){
            max=curr;
        }
        if(curr==target){
            return curr;
        }
        }
       

        return max;
    }
    public static void longestsubaaray(int[] arr){
        int sum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(k+" ");
                    // sum+=arr[k];
                    // if(sum>max){
                    //     max=sum;
                    //     System.out.println("sum is:"+max);
                    // }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        System.out.println("max sum is:"+sum(arr));
        //System.out.println("Longest subarary sum is:"+longestsubaaray(arr, 9));
        longestsubaaray(arr);
    }
}
