class Student {
    String name;
    int age;
    double cgpa;

    Student(String name, int age, double cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }
    
}


public class useOfThisKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("xyz",19,8.59);
        System.out.println(s1);
    }
}
