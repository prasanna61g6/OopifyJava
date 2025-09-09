// A method that contains declaration but not definition
// It's a method that does not contain any body
// An abstract class is nothing but a class in java that contains at least 1 abstract method
// If you want to Write at least one abstract method in your class, you MUST MAKE THAT class as abstract class
// An abstract class 
abstract class Animal {
    abstract void makeSound();  // abstract method
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bhow Bhow");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

abstract class Bank {
    abstract double getInterestRateOnPersonalLoan();
}
class SBI extends Bank {
    @Override
    double getInterestRateOnPersonalLoan() {
        return 7.7;
    }
}

abstract class Polygon {
    abstract void printArea();
    abstract void printPerimeter();
}
class Square extends Polygon {
    int side;
    Square(int side) {
        this.side = side;
    }
    @Override
    void printArea() {
        System.out.println(side * side);
    }
    @Override
    void printPerimeter() {
        System.out.println(4 * side);
    }
}
class Rectangle extends Polygon {
    int length;
    int breadth;
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    void printArea() {
        System.out.println(length * breadth);
    }
    @Override
    void printPerimeter() {
        System.out.println(2*(length + breadth));
    }
}
class Triangle extends Polygon {
    int a,b,c;
    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    void printArea() {
        double s = (a+b+c)/2.0;
        double ans = s*(s-a)*(s-b)*(s-c);
        System.out.println(Math.sqrt(ans));
    }
    void printPerimeter() {
        System.out.println(a+b+c);
    }
}

public class AbstractEx1 {
    public static void main(String[] args) {
        SBI s1 = new SBI();
        System.out.println(s1.getInterestRateOnPersonalLoan());
        Dog d1 = new Dog();
        d1.makeSound();
        Square s2 = new Square(4);
        s2.printArea();
        s2.printPerimeter();
        Rectangle r1 = new Rectangle(6,8);
        r1.printArea();
        r1.printPerimeter();
        Triangle t1 = new Triangle(2, 3,4);
        t1.printArea();
        t1.printPerimeter();

    }
}
