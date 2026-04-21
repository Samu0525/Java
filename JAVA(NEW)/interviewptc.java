public class interviewptc {
    public static void A(int arr[],int to,int from){
     
        int n=arr.length;
           int temp=arr[from];
           if(from>to){
            for(int i=from;i>to;i--){
                arr[i]=arr[i-1];
            }
           }else{
        for(int i=from;i<to ;i++){
            arr[i]=arr[i+1];
        }
        
    }
    arr[to]=temp;
    
        
        for(int i=0;i<=n-1;i++){
             System.out.print(arr[i]);
        }    
    }
public static void main(String[] args){
int arr[]={1,2,3,4,5,6,7,8};
interviewptc i=new interviewptc();
i.A(arr, 3, 6);
}
}
