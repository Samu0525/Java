public class LongestIncreasingSequence {

    public static int LIS(int[] arr){
        int[] result = new int[arr.length];

        // Step 1: initialize all to 1
        for(int i = 0; i < arr.length; i++){
            result[i] = 1;
        }

        // Step 2: main logic
        for(int i = 1; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                if(arr[i] > arr[j]){
                    result[i] = Math.max(result[i], result[j] + 1);
                }
            }
        }

        // Step 3: find max
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(result[i] > max){
                max = result[i];
            }
        }

        return max;
    }

    public static void main(String[] args){
        int[] arr = {2,4,3,6,1,7};
        System.out.println(LIS(arr));
    }
}