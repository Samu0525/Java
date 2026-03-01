import java.util.*;
public class OOP {
    static class pen{
        int cost;
        String color;
        public void work(){
            System.out.println(this.color+"Pen is of "+this.cost+"rs");
        }
        public void work(int cost){
            System.out.println(cost+"rs is litlle high");
        }
        public void work(String color){
            System.out.println(color+" but colr of peb is nice");
        }
    }
     static class pencil{
        int cost;
        String type;
        //parameterized constructor
        pencil(int cost,String type){
            this.cost=cost;
            this.type=type;
        }
        //copy constructor
        pencil(pencil p3){
            this.cost=p3.cost;
            this.type=p3.type;
        }
        public void work(){
            System.out.println(type+"Pencil is of "+cost+"rs");
        }

    }
    public static class school{
        int studentscounts;
        
        public static void task(int studentscounts){
            System.out.print(studentscounts+"Students are toppers");
        }
        
    }
    public static class college extends school{
        
        public static void task(int staffcount){
            System.out.print(staffcount+"staff work hard");
        }
    }
    public static class university extends school{
        public static void task(int studentscounts,int staffcount){
            System.out.print(studentscounts+","+ staffcount+"Students and staff are present");
        }
    }

    public static void main(String[] args){
        pen p1=new pen();
        p1.color="blue";
        p1.cost=20;
        p1.work();
        p1.work(50);
        p1.work("lavender");
        pencil p2=new pencil(20,"ledpencil");
        p2.work();

        pencil p3=new pencil(p2);
         p3.work();

        school sc=new college();
        sc.task(50);

        
    }
}
