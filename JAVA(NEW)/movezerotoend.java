public class movezerotoend {
    public static void mv(int[] arr){
        int j=0;//it is outside becausew we are not updating it everytime.
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int[] arr={0,0,8,1,0,8};
        
        mv(arr);
    }
}
