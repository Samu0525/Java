class Sales {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online


    static class Saless{
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
    }
    public static void main(String[] args) {
        Saless sc=new Saless();
        int[] arr={7,1,5,3,6,4};
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
        }
        int[] r=sc.buynsell(arr);
        System.out.println();
        System.out.print(r[0]+",");
        System.out.print(r[1]);

    }
}

