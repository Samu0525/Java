public class BinarySearch {
    public static int BinarySearching(int nums[], int key) {
        int start = nums[0];
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == key) {
                return mid;
            }
            if (key < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, 45, 1, 90 };
        int key = 90;
        System.out.println("key is  at index:" + BinarySearching(nums, key));
    }

}
