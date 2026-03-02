public class palindromearray {
    public static boolean ispalindromee(int arr[]){
        for(int i=0;i<arr.length/2;i++){
            if(arr[i]!=arr.length-1-i){
                return false;
            }
           
        }
         return true;
    }
    public static void main(String[] args){
        int[] arr={1,2,1,2,1};
        System.err.println("Is the given array palindrome?"+ispalindromee(arr));

    }
}
