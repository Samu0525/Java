public class oop2 {
    static class Student{
        int ID;
    String name;
        Student(){
            this.ID=ID;
            this.name=name;
        }
        Student(int a,String b){
            a=ID;
            b=name;
        }
        Student(Student s1){
            s1.ID=ID;
        }
        public static void work(int ID){
            System.out.print("Department head studnet:"+ID);
        }
        public static void work(String name){
            System.out.println("Department had student name:"+name);
        }
        public void show() 
        { System.out.println("Student"); }
    }
    static class Teacher extends Student{
        int ID;
        String name;
        Teacher(){
            
            this.ID=ID;
            this.name=name;
        }
        public static void work(int ID){
            System.out.println("MAths teacher ID"+ID);
        }
        public static int getID(int ID){
            return ID;
        }
        public  void set(String name){
            System.out.println(this.name=name);
        }
        public void show() 
        { System.out.println("Teacher"); }
    }
    public static void main(String[]args){
        Teacher t=new Teacher();
        t.set("jiva");
        System.out.print(Teacher.getID(1));
        Student s = new Teacher();  // upcasting ALLOWEDD
        //s.set("Sanvi");// not work bcoz student class dodnot have set method even if inheritance present
         s.work(8);// it call student ID not teacher because work is static and static methods are not overidden. So reference type only called .
        s.show();// it will show teacher bcoz show method is not static hence object class decide hwat to run
         Teacher t1 = (Teacher) s;    // downcasting (safe only if object is actually Teacher)
    }
}
// Static methods are resolved using reference type, not object type.
//  Since s is of type Student, Student.work() will be called, not Teacher’s method.