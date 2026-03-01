import java.util.*;

class trapingrainwater {
    public static void trapingrainwater(int[] arr){
        int area=0;
        int i=0;
        int j=0;
        int k=i+1;

        for(i=0;i<arr.length;i++){
            int leftmax=0;
            int rightmax=0;

            for(j=0;j<i;j++){
                leftmax=Math.max(leftmax,arr[j]);
            }
            for( k=i+1;k<arr.length;k++){
                rightmax=Math.max(rightmax,arr[k]);
            }
             int water_at_i=Math.min(leftmax,rightmax)-arr[i];
             if(water_at_i>0){
                area+=water_at_i;
             }
        }
        System.out.print("area of trapped water:"+area);
    }
    public static void main(String[] args){
        int[] arr={4,2,0,6,3,2,5};
        trapingrainwater(arr);

    }
}
