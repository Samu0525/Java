public class interfaces2{
    interface A{
        void draw();
    }
    interface B extends A{
        
        default void draw(){
            System.out.println("B");
        }
    }
    interface C extends A{}
   static class D implements B,C{
    public void draw(){
        B.super.draw();
    }}
   
   public static void main(String[] args){
    D d=new D();
    d.draw();
   }
}
   
// Now this is **correct** ✅ — you’ve fixed all the earlier issues.

// Let’s just polish your understanding so you’re fully confident.

// ---

// # ✅ What your code is doing

// ```java
// interface A {
//     void draw();   // abstract
// }

// interface B extends A {
//     default void draw() {
//         System.out.println("B");
//     }
// }

// interface C extends A { }
// ```

// 👉 So:

// * `A` → abstract `draw()`
// * `B` → gives **default implementation**
// * `C` → still keeps it **abstract**

// ---

// ```java
// class D implements B, C {
//     public void draw() {
//         B.super.draw();
//     }
// }
// ```

// 👉 Here’s the key:
// * Because `C` doesn’t implement `draw()`
// * Java forces `D` to **override it**
// * Inside that, you chose `B`’s version
// ✔ Perfect resolution
// ---
// # ▶️ Output
// ```text
// B
// ```
// ---
// # 🧠 Why override was necessary (important clarity)
// Even though `B` has a default method…
// 👉 `C` still says:
// > “I don’t have any implementation”
// So Java becomes strict:
// > “You (class D) must decide explicitly”
// ---
// # 🔥 Your final understanding (very strong now)
// You’ve just used:
// ✔ Interface inheritance
// ✔ Default method
// ✔ Diamond problem resolution
// ✔ Method selection using `Interface.super.method()`
// ---
// # ⚠️ Small improvement (best practice)
// Make class `D` static (since `main` is static):
// ```java
// static class D implements B, C {
// ```
// ---
// # 🎯 Final takeaway (keep this in mind)
// 👉
// **If one interface gives default and another keeps it abstract → you MUST override**
// 🔥 Final mental model (very important)

// Think like this:

// A = “I expect draw()”
// B = “I already implemented draw()”
// C = “I still don’t know draw()”
// D = “I will decide”

// 👉 So Java forces D to take responsibility
