import java.util.*;
public class QueueY {
    static class Queue{
         int arr[];
         int size;
         int rear=-1; //and front is alwats defined beacuse it is queue using arrays so front always 0
        Queue(int n){
            arr=new int[n];
            this.size=n;

        }
        public  boolean isEmpty(){
            return rear==-1;
        }
        //Enqueue function
        public  void enqueue(int data){
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        //Dequeue function
        public  int Dequeue(){
        if(isEmpty()){
            return -1;
        }
        int front=arr[0];
        for(int i=0;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return front;


    }
    //peek function
    public  int peek(){
         if(isEmpty()){
            return -1;
        }
        return arr[0];

    }

    }


    //Circular Queue using Array-->more suitable
    //as TC of all cases is O()

    static class QueueC{
         int arr[];
         int size;
         int rear=-1; 
         int front=-1;

        QueueC(int n){
            arr=new int[n];
            this.size=n;

        }
        public  boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public  boolean isFull(){
            return (rear+1)%size==front;
        }
        //Enqueue function->O(1)
        public void enqueue(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            //first element add
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;;
            arr[rear]=data;
        }


        //Dequeue function->O(1)
        public int Dequeue(){
        if(isEmpty()){
            return -1;
        }
        int result=arr[front];
        if(rear==front){
            rear=front=-1;
        }
        else{
            front=(front+1)%size;
        }
        return result;


    }
    //peek function
    public  int peek(){
         if(isEmpty()){
            System.out.println("Circular queue is empty");
            return -1;
        }
        return arr[front];

    }

    }

    //Queue using Linked List
    
        static class QueueL{
         static class Node{
            int data;
            Node next;
            int size;
            Node(int data){
                
                this.data=data;
                next=null;
                
            }}
        

            Node head=null;
            Node tail=null;
         

      
        public  boolean isEmpty(){
            return head==null &&tail==null;
        }
       
        //Enqueue function->O(1)
        public void enqueue(int data){
             Node newNode=new Node(data);
            if(tail==null){
                head=tail=newNode;
                return;
            }
          
           tail.next=newNode;
           tail=newNode;

        }


        //Dequeue function->O(1)
        public int Dequeue(){
        if(isEmpty()){
            return -1;
        }
        int front =head.data;
        if(head==tail){
           head=tail=null;
           return front;
        }
        head=head.next;
        return front;

        


    }
    //peek function
    public  int peek(){
         if(isEmpty()){
            System.out.println("Circular queue is empty");
            return -1;
        }
        return head.data;

    }

    }
        


    public static void main(String[] args){
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.Dequeue();

        }
        System.out.println("Circular Queue");
        QueueC qc=new QueueC(5);
        qc.enqueue(1);
        qc.enqueue(2);
        qc.enqueue(3);
        qc.enqueue(4);
        qc.enqueue(5);
        System.out.println("Removed:"+qc.Dequeue());
        qc.enqueue(6);
        System.out.println("Removed:"+qc.Dequeue());
        qc.enqueue(7);
        while(!qc.isEmpty()){
           System.out.println(qc.peek());
           qc.Dequeue();

        }

        System.out.println("Queue using LinkedList");
        QueueL ql=new QueueL();
        ql.enqueue(1);
        ql.enqueue(2);
        ql.enqueue(3);
        ql.enqueue(4);
        ql.enqueue(5);
        while(!ql.isEmpty()){
            System.out.println(ql.peek());
            ql.Dequeue();
        }



        


    }}


