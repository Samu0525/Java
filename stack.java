import java.util.*;

public class stack {

    // Implementation using Linked List
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class MyStack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) return -1;
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) return -1;
            return head.data;
        }
    }

    // Implementation using ArrayList
    static class Stackk {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if (isEmpty()) return -1;
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek() {
            if (isEmpty()) return -1;
            return list.get(list.size() - 1);
        }
    }

    // ✅ Correct place for this method
    public static void stackpushatbottom(int data, Stack<Integer> ss) {
        if (ss.isEmpty()) {
            ss.push(data);
            return;
        }
        int top = ss.pop();
        stackpushatbottom(data, ss);
        ss.push(top);
    }

    //Reverse a stack
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        stackpushatbottom(top, s);

    }

    public static void main(String[] args) {
        // Linked list-based stack
        System.out.println("MyStack (linked list) output:");
        MyStack s = new MyStack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

        // Built-in Java Stack
        System.out.println("Java Stack output:");
        Stack<Integer> sc = new Stack<>();
        sc.push(10);
        sc.push(20);
        sc.push(30);
        sc.push(40);

        reverse(sc);
        

        while (!sc.isEmpty()) {
            System.out.println(sc.peek());
            sc.pop();
        }

        // Push at bottom using recursion
        System.out.println("Push at bottom using recursion:");
        Stack<Integer> sss = new Stack<>();
        sss.push(1);
        sss.push(2);
        sss.push(3);
        sss.push(4);
        stackpushatbottom(5, sss); // Push 5 at bottom

        while (!sss.isEmpty()) {
            System.out.println(sss.peek());
            sss.pop();
        }
    }
}
