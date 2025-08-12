class Employee {
    String name, department;
    int age;
    double salary;
    char gender;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    Employee(String name, String department, int age) {
        this(name, department);
        this.age = age;
    }

    Employee(String name, String department, int age, double salary) {
        this(name, department, age);
        this.salary = salary;
    }

    Employee(String name, String department, int age, double salary, char gender) {
        this(name, department, age, salary);
        this.gender = gender;
    }

    
}

public class ChainingOfConstrucotsUsingThisKeyword {
    public static void main(String[] args) {
        
    }
}
