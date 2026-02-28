//Function only 
import java.util.*;
class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        //kadanes algorithm: it tells that sum of subarrayis negative make it  zero.
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
      
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            maxsum=Math.max(currsum,maxsum);
             if(currsum<=0){
            currsum=0;
             }
        }
        
       return maxsum;
    }
}

