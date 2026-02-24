import java.util.HashSet;
public class Recursion_intermediate {

  /*  // 1. Tower of Hanoi
    public static void towerOfHanoi(int n, String src, String helper, String destination) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + destination);
            return;
        }
        towerOfHanoi(n - 1, src, destination, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + destination);
        towerOfHanoi(n - 1, helper, src, destination);
    }

    // 2. Reverse a string
    public static void printReverse(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printReverse(str, idx - 1);
    }

    // 3. First and last occurrence
    public static int first = -1;
    public static int last = -1;

    public static void findOccurencee(String str2, int idx, char element) {
        if (idx == str2.length()) {
            System.out.println("First occurrence: " + first);
            System.out.println("Last occurrence: " + last);
            return;
        }

        char currchar = str2.charAt(idx);

        if (currchar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        findOccurencee(str2, idx + 1, element);
    }
//4.check an arr is sorted or not-->TC=O(n)
    public static boolean issorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        if(arr[index]<arr[index+1]){
            return issorted(arr, index+1);
        }
        else{
            return false;
        }
    }

//5. Move all "x " to the end of string----> Tc=O(n)
    public static void moveAllx(String str,int index,int count,String newString){
        if(index==str.length()){
            for(int i=0;i<count;i++){
            newString +='x';
            }
            System.out.println(newString);
            return;
        }
        char currCharr=str.charAt(index);
        if (currCharr == 'x'){
            count++;
            
        }
        else{
            newString += currCharr;
           
        }
         moveAllx(str,index+1,count,newString);
    }
         

//6. remove duplicates from a string--> TC=o(n)
     public static boolean[] map=new boolean[26];
     public static void removeDuplicates(String str,int index, String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
        char currchar=str.charAt(index);
        if(map[currchar-'a']==true){
            removeDuplicates(str, index+1, newString);
        }
        else{
            newString+=currchar;
            map[currchar-'a']=true;
            removeDuplicates(str, index+1, newString);
        }

     
///imppppppppppppppppppppppp
//7.Print all the subsequences of a string---> TC=O(2^n)
    public static void subsequences(String str,int index,String newString){
        if(index==str.length()){
            System.out.println(newString);
            return;
        }
       char currChar=str.charAt(index);

       //if the subsequence want to come
       subsequences(str, index+1, newString+currChar);

       //if it doesnot wamt to come
       subsequences(str,index+1,newString);
    }

//8. print unique subsequences
public  static void  uniqueSubsequences(String str,int index,String newString,HashSet<String> set){//hash set stores unique values of a set
    if(index==str.length()){
        if(!set.contains(newString)){
            System.out.println(newString);
            set.add(newString);
        }
        return;
    }

    char currChar=str.charAt(index);
    //if come
    uniqueSubsequences(str, index+1, newString+currChar, set);
    //if not coming
    uniqueSubsequences(str, index+1, newString, set);
}*/

// 9. print keypad combination-------> TC=o(4^n)
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printCombination(String str,int index,String combination){
        if(index==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar=str.charAt(index);
        String mapping=keypad[currChar-'0'];
        for(int i=0;i<mapping.length();i++){
            printCombination(str, index+1, combination+mapping.charAt(i));
        }

    }








    public static void main(String[] args) {
        // 1. Tower of Hanoi
        // int n = 3;
        // towerOfHanoi(n, "S", "H", "D");

        // 2. Reverse a string
        // String str = "abcd";
        // printReverse(str, str.length() - 1);

        // 3. First and last occurrence
        //String str = "abaacdeafaah";
        //findOccurencee(str, 0, 'a');

        //4.
        //int arr[]={1,2,3,4,5};
       //System.out.println( issorted(arr, 0));

       //5.
      // String str="axbdcxxd";
      // moveAllx(str,0,0,"");

      //6.
    // String str="abbbcdd";
    // removeDuplicates(str, 0, "");

    //7.
   // String str="abc";
    //subsequences(str, 0, "");

    //8.
    //String str="aaa";
    //HashSet<String> set =new HashSet<>();
    //uniqueSubsequences(str, 0, "", set);

    //9.
    String str="109";
    printCombination(str, 0, "");
    

    }
}
