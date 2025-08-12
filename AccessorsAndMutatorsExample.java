// get() --> Accessor
// set() --> Mutator

class Employee {
  // Private instance variables to enhance safety
  private String name;
  private int age;
  private double salary;

  // Constructor
  Employee(String name, int age, double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  // Mutator (Setter) for name
  public void setName(String name) {
    this.name = name;
  }

  // Mutator (Setter) for name
  public void setAge(int age) {
    if (age >= 0)
      this.age = age;
    else
      System.out.println("Age can't be negative");
  }

  // Accessor(Getter) for name
  public String getName() {
    return name;
  }

  // Accessor(Getter) for age
  public int getAge() {
    return age;
  }

  // Mutator(Setter) for salary
  public void setSalary(double salary) {
    if (salary >= 0)
      this.salary = salary;
    else
      System.out.println("Salary cannot be negative");
  }

  // Accessor (Getter) for salary
  public double getSalary() {
    return this.salary;
  }
}
public class AccessorsAndMutatorsExample {
  public static void main(String[] args) {
    Employee e1 = new Employee("Alice", 17, 50000.00);

    System.out.println(e1.getName());
    System.out.println(e1.getAge());
    System.out.println(e1.getSalary());
    
    // Using setters to change the details
    e1.setAge(e1.getAge() + 1); // changing the age by 1
    e1.setName("Bob");
    e1.setSalary(e1.getSalary() + 5000.00); // adding 5000 to salary
    
    System.out.println(e1.getName());
    System.out.println(e1.getAge());
    System.out.println(e1.getSalary());
  }
}
