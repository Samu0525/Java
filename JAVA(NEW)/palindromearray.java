public class palindromearray {
    public static boolean ispalindromee(int arr[]){
        for(int i=0;i<arr.length/2;i++){
            if(arr[i]!=arr.length-1-i){
                return false;
            }
           
        }
         return true;
    }
    public static void reversestring(String a){
        
        for(int i=a.length()-1;i>=0;i--){
            System.out.print(a.charAt(i));
        }
    }
    public static void main(String[] args){
        String a="Samu";
        int[] arr={1,2,1,2,1};
        System.out.println("Is the given array palindrome?"+ispalindromee(arr));
        reversestring(a);

    }
}
