// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    static class Sales{
        public static int[] buynsell(int[] arr){
            int profit=0;
            int maxprofit=0;
            int minvalue=arr[0];
            int bp=arr[0];
            int sp=arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i]<minvalue){
                    minvalue=arr[i];
                }
                profit=arr[i]-minvalue;
                if(profit>maxprofit){
                    maxprofit=profit;
                    bp=minvalue;
                    sp=arr[i];
                }
            }
            return new int[]{bp,sp};
        }
        
        public static void movezeros(int[] arr){
            System.out.println();
            int i=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]!=0){
                    arr[i]=arr[j];
                    i++;
                }
                
            }
            while(i<arr.length){
                arr[i]=0;
                i++;
               
            }
            
            
        }
    }
    public static void main(String[] args) {
        Sales sc=new Sales();
        int[] arr={0,7,1,0,5,3,6,0,4};
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
        }
        int[] r=sc.buynsell(arr);
        System.out.println();
        System.out.print(r[0]+",");
        System.out.print(r[1]);
        
        sc.movezeros(arr);
        for(int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
        
        
    }
}