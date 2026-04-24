public class interfaces {
   // “Java does not support diamond problem with classes. It can occur with default methods in interfaces, and Java forces the programmer to resolve it by overriding the method.”
    interface A{
       default void draw(){
        System.out.print("Hello");
       }// implicitly public
    }
    interface C{
        default void draw(){
            System.out.println("HelloC");
        }// now this can cause diamond problem
        
    }
   public  static class B implements A,C{
    public void draw(){// hence it should also be public
        //System.out.println("She likes to draw");
         A.super.draw();// hence diamond problem caused due to default methods in interfaces are solved via super() keyword
    C.super.draw();
    }

    }
    public static void main(String[] args){

        //A a=new A();//Class not found error will come because it is a interfaces
        B b=new B();
        b.draw();
    }
}
// **********IMP POINTS TO REMEMEBER ABOUT INTERFACES****
// 1)interfaces can interher each other
//      Eg:interface A {
//     void show();
//     }

//     interface B extends A {
//     void print();
// }
// 💡 Meaning:
//     B gets everything from A
//     So B has:
//     show() (from A)
//     print() (its own)

// 2)⚙️ 2. Default Method Overriding

// Normally interfaces had only method declarations.
// But now Java allows default methods (with body).

// interface A {
//     default void show() {
//         System.out.println("A");
//     }
// }

// 3)👉 Overriding in another interface:
// interface B extends A {
//     default void show() {
//         System.out.println("B");
//     }
// }
// 👉 B is saying:
// “I don’t want A’s version, I’ll give my own.”
// 🧠 Simple meaning:
// Child interface can change behavior
// Just like classes do

//4)If multiple interfaces give the same method, Java prefers the version from the closest (child) interface.
//5)interface A {
//     default void show() { System.out.println("A"); }
// }

// interface B extends A {
//     default void show() { System.out.println("B"); }
// }

// interface C extends A { }

// class D implements B, C {
//     public static void main(String[] args) {
//         D obj = new D();
//         obj.show();
//     }
// }
// 🤔 Who wins?
// C → doesn’t override → uses A
// B → overrides → has its own
// 👉 So Java says:
// “B is more specific”
// ✅ Output:
// B

// 🔥 Super Simple Rule:
// Child interface method > Parent interface method
// 🧠 Final Memory Trick
// “Closer wins. If both are equal → you decide.”