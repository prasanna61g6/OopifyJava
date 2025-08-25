class Person {
    String name;
    int age;
    char gender;
    void walk() {
        System.out.println("Walking...");
    }
    void read() {
        System.out.println("Reading...");
    }
}
class Employee extends Person {
    int empId;
    double salary;
    void applyALeave() {
        System.out.println("Applying for a leave...");
    }
    void getPromoted() {
        System.out.println("You are promoted...");
    }
}
class Student extends Person {
    String rollNumber;
    String branch;
    double cgpa;
    double fee;
    void takeExam() {
        System.out.println("Writing an exam...");
    }
}

public class InheritanceEx1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Alice";
        e1.age =  17;
        e1.gender = 'F';
        e1.empId = 123;
        e1.salary = 60000.0;
        System.out.println(e1.age);
        e1.walk();
        e1.read();

        Student s1 = new Student();
        s1.takeExam();
        s1.walk();
        s1.read();
    }
}
