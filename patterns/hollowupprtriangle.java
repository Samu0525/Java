public class hollowupprtriangle {
    
}
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
// ---*
// --*-*
// -*-*-*
// *-----*
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){System.out.print("-");}
            System.out.print("*");
            if(i>1){
            for(int k=1;k<=2*i-3;k++){System.out.print("-");}
             System.out.print("*");
            }
            System.out.println();
        }
    }
}