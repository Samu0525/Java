import java.util.*;
public class  Hashmap {
    public static void main(String[] args){
        //country(key),population(value)
        HashMap<String,Integer> map=new HashMap<>();

        //Insertion
        map.put("India",120);
        map.put("US",200);
        map.put("China",234);
        System.out.println(map);
        map.put("China",240);
        System.out.println(map); 
        if(map.containsKey("India")){
            System.out.println("Key is present in the map");
        }else{
            System.out.println("Key is not present in map");
        }

        int arr[]={1,2,3};
        //case1 :
        for(int i=0;i<arr.length;i++){
            System.out.print(i+" ");
        }
        System.out.println();


        //case2 otjer type of for loop -> here the value prints the original value at that index instead of printing the index
        for(int val:arr){
            System.out.print(val+" ");
        } 
        System.out.println();

        //case3: loop in hashmap
        for(Map.Entry<String, Integer> e:map.entrySet()){
            System.out.print(e.getKey()+" :");
            System.out.println(e.getValue());
        }
System.out.println();
        //second way to get the keys
        Set<String> keys=map.keySet();
        for(String key:keys){
            System.out.println(key+" "+map.get(key));
        }

        //to delete key
        map.remove("China");
        System.out.println(map);

    }
}
