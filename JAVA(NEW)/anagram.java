public class anagram {
public static void Anagram(String s1,String s2 ){
    if(s1.length()!=s2.length()){
        System.out.println("Not a anagram");
        return;
    }
    int[] frequency=new int[26];
    for(int i=0;i<s1.length();i++){
        frequency[s1.charAt(i)-'a']++;
    }
    for(int i=0;i<s2.length();i++){
        frequency[s2.charAt(i)-'a']--;
    }
    for(int i=0;i<26;i++){
        if (frequency[i]!=0){
            System.out.println("not anagramm");
            return;
        }
        else{
            System.out.println("yes a anagram");
            return;
        }
    }
}
    public static void main(String[] args){
        String s1="listen";
        String s2="silent";
        Anagram(s1, s2);
    }
}
