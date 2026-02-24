import java.util.HashSet;
import java.util.Iterator;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
       
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println("Size od set is "+set.size());//here it donot take the 4th element because it is a  duplicate of 1
        //print all elements of a set
        System.out.println(set);

        //Iteraror in set
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //check if element present or not(searching)
        if(set.add(1)){
            System.out.println("Element 1 present");
        }
         if(!set.add(1)){
            System.out.println("Element 1 not present");
        }
        //delete element
        set.remove(2);
        if(!set.contains(2)){
            System.out.println("We deleted 2");
        }
        if(set.contains(3)){
            System.out.println("3 is present in set");
        }
        
    }
    
}
