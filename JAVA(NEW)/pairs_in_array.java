public class pairs_in_array {
    public static void pairsinarray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                System.out.print("(" + current + "," + nums[j] + ")");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6 };
        pairsinarray(nums);
    }
}
