public class commandline {
    public static void main(String[] args){
        System.out.println(args[0]+args[1]);
        int a=Integer.parseInt("2");
        int b=Integer.parseInt("2");
        int c=a+b;
        int d=a-b;
        System.out.println("Sum = " + c);
        System.out.println("Sub = " +d);
    }
}
