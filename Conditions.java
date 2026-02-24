import java.util.*;
public class Conditions {
public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    /*int x =sc.nextInt();
    int y=sc.nextInt();

    if(x==y){
        System.out.println("Equal");
    }
  
    else  if(x>y){
        
            System.out.println("x is big");
        }
         else{
                System.out.println(y+" i.e y is big");
            }
        
    }*/
    int button=sc.nextInt();
    
    switch (button) {
        case 1:System.out.println("namaste");
        break;
        case 2:System.out.println("Hello");
        break;
        case 3: System.out.println("Bonjour");
        break;
    
        default:System.out.println("Invalid choice");
         break;
    }
    
}
}
    

