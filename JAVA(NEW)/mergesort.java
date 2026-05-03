public class mergesort {//works on divide and conquer method
    //TC:O(nlogn)
    public static void Divide(int[] arr,int si,int ei){
        if(si>=ei){
            return;
        }int mid=si+(ei-si)/2;
        Divide(arr,si,mid);
        Divide(arr,mid+1,ei);
        Conquer(arr,si,mid,ei);
    } 
    public static void Conquer(int[] arr, int si, int mid,int ei){
        int merged[]=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                merged[x++]=arr[idx1++];
            }else{
                merged[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        while(idx2<=ei){
            merged[x++]=arr[idx2++];
        }
        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[j]=merged[i];

        }
    }
    public static void main(String[] args){
        int[] arr={2,3,5,1,0,9};
        mergesort m=new mergesort();
        m.Divide(arr, 0, 5);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
