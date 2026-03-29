public class missingelementinarrayusingXOR {
    public static int A(int[] arr){
        int XOR=0;
        int XOR2=0;
        for(int i=1;i<=arr.length+1;i++){// see heer we are taking normal numbers from 1to n not from any array or anything. So started with1;
            XOR^=i;
        }
        for(int ar:arr){
            XOR2^=ar;
        }
        return XOR^XOR2;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,5,6,7};
        A(arr);
        System.out.println(A(arr));
    }
}
