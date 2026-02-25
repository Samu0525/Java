public class diamond {
  
// ---*
// --***
// -*****
// *******
// -*****
// --***
// ---*
    public static void main(String[] args) {
        //Upper half
        int n=4;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
            System.out.print("-");
        }
        for(int j=1;j<=i;j++){System.out.print("*");}
        for(int k=2;k<=i;k++){System.out.print("*");}
            System.out.println();
        }
        int m=3;
        for(int i=1;i<=m;i++){
            for(int s=1;s<=i;s++){System.out.print("-");}
            for(int j=n-i;j>=1;j--){System.out.print("*");}
            for(int k=1;k<n-i;k++){System.out.print("*");}
            
            System.out.println();
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

