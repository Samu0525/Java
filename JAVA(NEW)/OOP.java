import java.util.*;
public class OOP {
    static class pen{
        int cost;
        String color;
        public void work(){
            System.out.print(this.color+"Pen is of "+this.cost+"rs");
        }
    }
     static class pencil{
        int cost;
        String type;
        pencil(int cost,String type){
            this.cost=cost;
            this.type=type;
        }
        public void work(){
            System.out.print(type+"Pencil is of "+cost+"rs");
        }

    }

    public static void main(String[] args){
        pen p1=new pen();
        p1.color="blue";
        p1.cost=20;
        p1.work();

        pencil p2=new pencil(20,"ledpencil");
        p2.work();
    }
}
