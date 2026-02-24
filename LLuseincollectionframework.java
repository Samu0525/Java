import java.util.*;
public class LLuseincollectionframework {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();

        list.addFirst("I am");
        list.addLast(" Sam");//if we write only add instead of addLast it will byy defautltly add at last
        list.addFirst("Hey");
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            
            System.out.print(list.get(i));
        }
        System.out.println("null");

        list.remove(2);
        System.out.println();
    }
}
