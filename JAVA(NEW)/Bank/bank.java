package Bank;
class Account{
    public String name;
    protected String email;
    private String pass;
    //getters and setters
    public String getpass(){
        return pass;
    }
    public void  setpass(String pass){
        this.pass=pass;
    }
}
public class bank {
    public static void main(String args[]){
        Account a=new Account();
        a.name="Sam";//as public can be accessible anywhere
        a.email="sshewale1212@gmail.com";//as procted can be accessed in same package and subclasses of other package
        //a.pass="12s";//it gives error . So private can be accessed via getters and setters.
        a.setpass("abc12");
        System.out.print(a.getpass());

    }
}
 