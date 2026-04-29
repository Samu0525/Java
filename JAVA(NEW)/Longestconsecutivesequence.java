import java.util.HashSet;

public class Longestconsecutivesequence {
    public static void main(String args[]){
        int[] arr={100,4,200,1,3,2};
        int ans=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i]-1)){
                int count=1;
                int num=arr[i];
                while(set.contains(num+1)){
                    num=num+1;
                    count++;

                }
                System.out.println(count);
                
            }
            else{
                continue;
                
            }
        }
    }
}
