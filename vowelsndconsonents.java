import java.util.*;
public class vowelsndconsonents{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        int vowels=0;
        int consonents=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='o'){
                vowels++;
            }else{
                consonents++;
            }
        }
        System.out.println(vowels);
        System.out.println(consonents);


    }
}