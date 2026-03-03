import java.util.Arrays;

class binarysearch {
    public int binarysearchh(int arr[],int left,int right,int key){
       

    if (left > right) {
        return -1;   // Base condition (STOP recursion)
    }
        int mid=left+(right-left)/2;
        
            if(key==arr[mid]){
                return mid;
            }
            else if(arr[mid]<key){
                return binarysearchh(arr, mid+1, right, key);
            }
            else{
                return binarysearchh(arr, left, mid-1, key);
            }
        
       
    }
   public static void main(String[] args){
    int arr[]={1,2,3,4,5,6,7,8,9};
    binarysearch b=new binarysearch();
   System.err.println( b.binarysearchh(arr, 0, arr.length-1, 9));
    
   } 
}
