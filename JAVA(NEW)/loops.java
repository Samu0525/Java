import java.util.Scanner;

public class loops {
    
    public static void main(String[] args){
       /*  for(int i=0;i<3;i++){
            System.out.println("Hello World!");
        }*/
        int i=0;
       /*  while(i<=11){
            System.out.println(i);
            i++;
        }*/
        /*do{
            System.out.println(i);
            i++;
        }while(i<11);

    }*/
    Scanner sc=new Scanner(System.in);
    /*int n=sc.nextInt();
    int sum=0;
    for(int a=1;a<=n;a++){
        sum=sum+a;
    }
    System.out.println(sum);
    */
    int m=sc.nextInt();
    int mul=0;
    for(int b=0;b<=10;b++){
        mul=(b)*m;
        System.out.println("2*"+b+"="+mul);
    }
    
        
    }
}

