public class concattwoarrays{public static void main(String[] args){
    int a[]={2,4,3,5,6};
    int b[]={9,7,8,0};
 int[] result=new int[a.length+b.length];
     for(int i=0;i<a.length;i++){
        result[i]=a[i];
    }
    for(int i=0;i<b.length;i++){
        result[a.length+i]=b[i];
    }
    for(int i=0;i<result.length;i++){
        System.out.print(result[i]);
    }

}}