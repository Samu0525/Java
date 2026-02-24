public class subarrays {
    ///TC->O(n^3):worst . But this is basic way
    public static void Subarrays(int nums[]) {
        int total = 0;
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {

                    System.out.print("(" + nums[k] + ")" + " ");
                    sum += nums[k];

                    if (sum < 0) {
                        sum = 0;
                    }

                }

                System.out.print("Sum for thhe given subarray is" + sum);
                total++;
                // System.out.println();
                if (sum > maximum) {
                    maximum = sum;
                }

                /*
                 * if (sum < minimum) {//kadanes way
                 * minimum = sum;
                 * }
                 */
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Maximum subarray sum is" + maximum);
        System.out.println("Minimum subarray sum is" + minimum);
        System.out.println("Total subarrays are:" + total);

    }

    // kadanes method->O(n)
    public static void kadanes(int nums[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < nums.length; i++) {
            cs = cs + nums[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("---------Kadanes way:---------- ");
        System.out.println("our max subarray sum is:" + ms);
        System.out.println("Hence kadanes way is more effective and easy rto solve with best case TC of O(n)");
    }

    public static void main(String[] args) {
        int nums[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        Subarrays(nums);
        kadanes(nums);
    }
}
