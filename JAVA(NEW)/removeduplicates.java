public class removeduplicates {
    public static void removeduplicatesfromstring(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            String  c =""+str.charAt(i);
            if(result.contains(c)){
                continue;
            }
            result+=c;
        }
        System.out.println(result);
        
    }
    public static void main(String[] args){
        String str="Samruddhi";
        removeduplicatesfromstring(str);
    }
}
