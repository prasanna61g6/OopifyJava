class Person {
  // instance variables
  String name;
  int age;
  char gender;
  // A no-parametric constructor
  Person() 
  {
    
  }
  // A parametric constructor
  Person(String name, int age, char gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }
  // methods
  void showPersonDetails() {
    System.out.println("Name is: " + name);
    System.out.println("Age is: " + age);
    System.out.println("Gender is: " + gender);
  }
}
class Employee extends Person {
    // Using super class constructor
    int empId;
    double salary;
    String org;
    Employee(String name, int age, char gender, int empId, double salary, String org) {
      // You can only call super class constructor from sub-class constructor
      super(name, age, gender);
      this.empId = empId;
      this.salary = salary;
      this.org = org;
    }
    void showEmployeeDetails() {
      showPersonDetails();
      System.out.println("Employee id: " + empId);
      System.out.println("Salary is: " + salary);
      System.out.println("Ogranization is: " + org);
    }
}
class Student extends Person {
  String rollNumber;
  String branch;
  double cgpa;
  Student(String name, int age, char gender, String rollNumber, String branch, double cgpa) {
    super(name, age, gender);
    this.rollNumber = rollNumber;
    this.branch = branch;
    this.cgpa = cgpa;
  }
  void showStudentDetails() {
    showPersonDetails();
    System.out.println("Roll Number is: " + rollNumber);
    System.out.println("Branch is: " + branch);
    System.out.println("CGPA is: " + cgpa);
  }
}
public class ConstructorsInInheritance {
  public static void main(String[] args) {
    Employee e1 = new Employee("Alice", 20, 'F', 123, 50000, "Google");
    e1.showEmployeeDetails();
    Student s1 = new Student("Bob", 15, 'M', "24P31Axxxx", "CSE", 7.8);
    s1.showStudentDetails();
    Person p1 = new Person("Charlie", 45, 'M');
    p1.showPersonDetails();
  }
}
