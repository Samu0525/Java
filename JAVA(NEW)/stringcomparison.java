public class stringcomparison {
    public static void main(String[]args){
        String s1="SAM";
        String s2="sam";
        System.out.println(s1.equals(s2));//false as .equals() is case sensitive
        System.out.println(s1.compareTo(s2));//compareTo() compares two strings lexicographically and returns 0, positive, or negative based on their order.
//It compares character by character from left to right:
// "cat" vs "car"
// 👉 compare:
// 'c' = 'c'
// 'a' = 'a'
// 't' > 'r'
// ✔ so "cat" is greater

    }
}
