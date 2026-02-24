import java.util.*;
public class Queueusingjavvacollectionsframeworks {

    //Queue using 2 stacks
    static class QueueY{
       static  Stack<Integer> s1=new Stack<>();
       static  Stack<Integer> s2=new Stack<>();

       public static boolean isEmpty(){
        return s1.isEmpty();
       }

       public static void add(int data){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
       }

       public static int remove(){
        if(isEmpty()){
            System.out.println("Que is empty");
            return -1;
        }
        return s1.pop();
       }

       public static int peek(){
        if(isEmpty()){
             System.out.println("Que is empty");
            return -1;
        }
        return s1.peek();
       }


    }
    public static void main(String[] args) {
       Queue<Integer> q=new LinkedList<>(); 
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
       }

       System.out.println("Queue using ArrayDeque");
        Queue<Integer> qa=new ArrayDeque<>(); 
       qa.add(1);
       qa.add(2);
       qa.add(3);
       qa.add(4);
       while(!qa.isEmpty()){
        System.out.println(qa.peek());
        qa.remove();
       }

       System.out.println("Queue using 2 stack");
       QueueY qy=new QueueY();
       qy.add(1);
       qy.add(2);
       qy.add(3);
       qy.add(4);
       while(!qy.isEmpty()){
        System.out.println(qy.peek());
        qy.remove();
       }

    }
    
}
