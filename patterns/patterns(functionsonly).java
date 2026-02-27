class Solution {
// 1
// 12
// 123
// 1234
    public void pattern3(int n) {
 for(int i=1;i<=n;i++){for(int j=1;j<=i;j++){
    System.out.print(j);
    }
    System.out.println();
    }
    }

    //Q2->
// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1
    public void pattern11(int n) {
        for(int i=1;i<=n;i++){
            int num;
            if(i%2==0){
                num=0;
            }
            else{
                num=1;
            }
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num=1-num;
            }System.out.println();
            }
            }

//Q3->
// 1 

// 2 3 

// 4 5 6 

// 7 8 9 10 

// 11 12 13 14 15
public void pattern13(int n) {
int count=1;
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(count+" ");
        count+=1;
    }
    System.out.println();
}
    }
    }
