final class Parent {  // cannot be overriden
    final void X() {   // constant which cannot be overriden
        System.out.println("This is from parent");
    }
}
class Child extends Parent {  // if the parent class is used final keyword then it throws an errors
    void X() {
        System.out.println("This is child class");
    }
} 
public class UseOffinalKeyword {
    public static void main(String[] args) {
        final int a = 20; // constant
        a = 30;   // throws an error as a is constant
        final double PI = 3.14; // mostly use capitals for constants
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
