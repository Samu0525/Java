class LL{
    Node head;
    private int size;
    LL(){
        this.size=0;
    }
    class Node{
    int data;
    Node next;

    Node(int data,int next){
        this.data=data;
        this.next-next;
        size++;
    }
}

}
public static void addFirst(String data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
    
}
