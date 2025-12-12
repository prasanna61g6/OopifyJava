// If a class extends an abstarct class, it is forced to give implementation for all abstract methods present
//   in the paret class. If the child class fails to do so, then it also must be tagged as abstract

abstract class Animal {
    String speciesType; // instance variable
    Animal(String speciesType) {  // constructor
        this.speciesType = speciesType;
    }
    abstract void makeSound();
}
class Dog extends Animal {
    String breed;
    Dog(String breed, String speciesType) {
        super(speciesType);
        this.breed = breed;
    }
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}
class Cat extends Animal {
    String name;
    Cat(String name, String speciesType) {
        super(speciesType);
        this.name = name;
    }
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}
public class ConstructorInAbstract {
    public static void main(String[] args) {
        Cat c1 = new Cat("Alfred","Carnivore");
        System.out.println(c1.name);
        System.out.println(c1.speciesType);
        c1.makeSound();
        Dog d1 = new Dog("Lab","Carnivore");
        System.out.println(d1.breed);
        System.out.println(d1.speciesType);
        d1.makeSound();
    }
}
