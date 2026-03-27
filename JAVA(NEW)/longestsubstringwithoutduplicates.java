import java.util.HashSet;
import java.util.Set;

public class longestsubstringwithoutduplicates {
    public static int A(String str){
       int left=0;
       int max=0;
        HashSet<Character> set = new HashSet<>();
       for(int right=0;right<str.length();right++){
        char ch=str.charAt(right);
        while(set.contains(ch)){
            set.remove(str.charAt(left));
            left++;

        }
        set.add(ch);
        max=Math.max(max,right-left+1);
       }
       System.out.println(max);
       
return max;
    }
    public static void main(String[] args){
        String str="abcabbca";
        A(str);
    }
}
