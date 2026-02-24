class  LL {
    Node head;
    // size
    private int size;
    LL(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;
       
      
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
           
        }


    }
    // add-first
    public void addFirst(String data){
         
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;

    }
    
    //add-last
    public void addLast(String data){
         Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
//delete first
public void deleteFirst(){
    if(head==null){
        System.out.println("the list is not empty");
        return;
    }
    size--;
    head=head.next;
    

}

//delette last
public void deleteLast(){
    if(head==null){
        System.out.println("The list is empty");
        return;
    }
    size--;
    if(head.next==null){
        head=null;
        return;
    }
    Node secondlast=head;
    Node lastNode=head.next;//if our head.next is null then our lastNode will become null and null.next do not exist which give error thererfore above basecase req.
    while(lastNode.next!=null){
        lastNode=lastNode.next;
        secondlast=secondlast.next;
    }
    secondlast.next=null;
}

 //print 
    public void printList(){
        if(head==null){
            System.out.println("List isempty");
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    public int sizelist(){
        return size;
    }
    
    //Reverse a linkedlist (iterative way)
      public  void reversell(){
       
         Node prevNode=head;
         Node currNode=head.next;
         if(head==null||head.next==null){
            return;
         }
         while(currNode.next!=null){
           Node nextNode=currNode.next;
           currNode.next=prevNode;
           //update
           prevNode=currNode;
           currNode=nextNode;
         }
         head.next=null;
         head=prevNode;
   

    }

    //reverse a linked list (recursive way)
    public Node reverseRecursive(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node  newHead=reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
        
    }
    

    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("a");
         list.printList();
        list.addFirst("is");
         list.printList();
        list.addLast("alphabet?");
        list.printList();
        list.addLast("h");
         list.printList();
          System.out.println(list.sizelist());
         list.deleteFirst();
         list.printList();
        list.deleteLast();
        list.printList();
          list.deleteLast();
        list.printList();
         list.deleteLast();
        list.printList();
        System.out.println(list.sizelist());
         list.addFirst("Hi");
         list.printList();
        list.addLast(" My");
         list.printList();
        list.addLast(" name is Sam");
        list.printList();
        list.addLast("h");
        list.printList();
        list.reversell();
        list.printList();
        list.head=list.reverseRecursive(list.head);
        list.printList();
        
    }
}
