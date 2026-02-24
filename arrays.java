import java.util.*;
public class arrays {
public static void main(String args[]){
    /*int[] marks =new int[3];
    marks[0]=23;
    marks[1]=54;
    marks[2]=54;
    System.out.println(marks);//will show garbage value
    System.out.println(marks[0]);
    System.out.println(marks[1]);
     for(int i=0;i<=3;i++){
        System.out.println(marks[i]);
    }*/
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int numbers[]=new int[size];
    
    for(int i=0;i<size;i++){//loop for taking input
        numbers[i]=sc.nextInt();
    }
    System.out.print("Enter the element to find: " );
    int x=sc.nextInt();
    //loop for output
    for(int i=0;i<=size;i++){ //in java automatically 0 gets printed if val not given
        // instead of size we can also take numbers.length
        if(numbers[i]==x){
            System.out.println("x found at index: "+i);
        }
        
    }


}
    
}
