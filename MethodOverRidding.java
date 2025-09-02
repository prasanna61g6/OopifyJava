// Thumb rules for overridding method
// 1. The overrinding method in the child class should contain exactly the same signature as of parent's
// 2. Otherwise the method won't be considered as overridden method
// 3. The overridding method (method from child class) should not have a weaker access than the method 
//     in it's parent (overridden method)
//     weaker --> private
//     if the method is default in parent class then we can use public in child class but not private
//      but cannot use default in child class when the parent class is public
// 4. Only instance methods can be overridden
// 5. Overridding will not be applicable for static methods

class Animal {
    void makeSound() {
        System.out.println("Animal is making Sound");
    }
}

class Cat extends Animal {
    @Override   // --> Annotation
    void makeSound() {
        System.out.println("Meow...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bhow Bhow..");
    }
}

public class MethodOverRidding {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.makeSound();
        Cat c1 = new Cat();
        c1.makeSound();
        Dog d1 = new Dog();
        d1.makeSound();
    }
}


// Annotations in java
// 1. Annotations in java are meta data
// 2. They don't change the way code gets executed rather they convey specific things to compiler
// 3. Annotations starts with an @ symbol
//    @Override
