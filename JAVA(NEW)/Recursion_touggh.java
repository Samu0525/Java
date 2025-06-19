public class Recursion_touggh {
    //1. Print permutation of string--->TC=o(n!)
 /*  public static void permutation(String str,String permutation)
  {
    if(str.length()==0){
        System.out.println(permutation);
        return;
    }
    for(int i=0;i<str.length();i++){
        char currchar=str.charAt(i);
        String newstr=str.substring(0,i)+str.substring(i+1);
        permutation(newstr,permutation+currchar);
    }

//2. Count total paths in a  maze to move from(0,0) to(n,m)
public static int countPaths(int i,int j,int n,int m){
    if(i==n|| j==m){
        return 0;
    }
    if(i==n-1 && j==m-1){
        return 1;
    }
    //move downwards
    int downPaths= countPaths(i+1,j,n,m);

    //move right
    int rightPaths =countPaths(i,j+1,n,m);

    return downPaths+rightPaths;

}

// 3. Place tiles of size 1xm in a floor of size nxm
 public static int placeTiles(int n, int m){
    if(n==m){
        return 2;
    }
    if(n<m){
        return 1;
    }

    //vertical placements
    int vertPlacements=placeTiles(n-m,m);

    //horizontal placements
    int horPlacements=placeTiles(n-1,m);

    return vertPlacements+horPlacements;

 }
    */

//4 ways to call n guests
public static int callguests(int n){
    if(n<=1){
        return 1;
    }

   //call single single
    int way1=callguests(n-1);

    //call in pairs
    int way2=(n-1)*callguests(n-2);

    return way1+way2;

}

   
  public static void main(String [] args){
    //String str="abc";
    //permutation(str, "");

    //2.
    //int n=3,m=3;
    //int total= countPaths(0,0,n,m);
    //System.out.println(total);

    //3. 
   // int n=4,m=2;
    //System.out.println(placeTiles(n, m));

    //4.
    int n=4;
    System.out.println(callguests(n));

  }
}

