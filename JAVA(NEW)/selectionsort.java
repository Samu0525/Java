public class selectionsort {
    public static void B(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            int samllest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]< arr[samllest]){
                    samllest=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[samllest];
            arr[samllest]=temp;

            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args){
        int arr[]={7,4,0,2,1};
        B(arr);
    }
}
