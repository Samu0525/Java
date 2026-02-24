import java.util.*;
class ReverseLL {
     ReverseLL head;
     ReverseLL next;
    public  void reversell(){
       
         ReverseLL prevNode=head;
         ReverseLL currNode=head.next;
         if(head==null||head.next==null){
            return;
         }
         while(currNode.next!=null){
           ReverseLL nextNode=currNode.next;
           currNode.next=prevNode;
           //update
           prevNode=currNode;
           currNode=nextNode;
         }
         head.next=null;
         head=prevNode;


       

        

    }
    public static void main(String[] args) {
        LinkedList<Integer> LL=new LinkedList<Integer>();
        LL.add(1);
        LL.add(2);
        LL.add(3);
        System.out.println(LL);
       

    }
    
}
