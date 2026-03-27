public class find1stnonrepeatingcharacter {
    public static void A(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)!=str.charAt(j)){
                    System.out.println("found:"+str.charAt(i));
                    break;
                }
            }
        }
    }
    public static void main(String[] args){
        String str="aabbcdde";
        A(str);
    }
}
