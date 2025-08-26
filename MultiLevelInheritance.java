class Person{
    String name;
    int age;
    char gender;
    void walk() {
        System.out.println(name + " is Walking...");
    }
    void read() {
        System.out.println(name + " is Reading...");
    }
}

class Employee extends Person{
    int empId;
    String Organization;
    double salary;
    void applyALeave() {
        System.out.println(name + " applied for a leave");
    }
}

class Professor extends Employee{
    String[] subjects;
    String[] papers;
    String branch;
    void takeClass() {
        System.out.println(name + " is taking a class");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Person p2 = new Person();
        p2.age = 25;
        p2.name = "Bob";
        p2.gender = 'M';
        p2.walk();
        p2.read();

        Employee e1 = new Employee();
        e1.name = "Alice";
        e1.age = 28;
        e1.gender = 'F';
        e1.empId = 123;
        e1.Organization = "Google";
        e1.salary = 100000.0;
        e1.applyALeave();

        Professor p1 = new Professor();
        p1.name = "Professor";
        p1.age = 40;
        p1.papers = new String[3];
        p1.papers[0] = "A new view on AI";
        p1.papers[1] = "Evolving of AI";
        p1.papers[2] = "Generative AI";
        p1.subjects = new String[4];
        p1.subjects[0] = "C";
        p1.subjects[1] = "Java";
        p1.subjects[2] = "Python";
        p1.subjects[3] = "R";
        p1.branch = "AIML";
        p1.takeClass();
    }
}
