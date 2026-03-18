import java.util.Scanner;

public class calculator {
    public static int addition(int a,int b){
        return a+b;
    }
    public static int substraction(int a,int b){
        return a-b;
    }
    public static int multiplication(int a,int b){
        return a*b;
    }
    public static int division(int a,int b){
        return a/b;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your Number1:");
        int a=sc.nextInt();
        System.out.print("Enter Your Number2:");
        int b=sc.nextInt();

        
        while(true){
            System.out.println("1.Addistion 2.Substraction 3.Multiplication 4.Division 5. Exit");
        System.out.println("Enter your Choice:");
        int choice=sc.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Addition:"+addition(a, b));
                break;
            case 2:
                System.out.println("Substarction:"+substraction(a, b));
                break;
            case 3:
                System.out.println("Division:"+division(a, b));
                break;
            case 4:
                System.out.println("Multiplication:"+multiplication(a, b));
                break;
            case 5:
                    System.out.println("Exiting...");
                    return; // exits program
            default:
                System.out.println("THANKYOU");
                break;
        }
        
        }
    }

}
