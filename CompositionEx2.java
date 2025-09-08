class Subject {
    String name;
    String type;
    int credits;
    Subject(String name, String type, int credits) {
        this.name = name;
        this.type = type;
        this.credits = credits;
    }
    @Override
    public String toString() {
        return "Subject(" + name + ", " + type + ", " + credits + ")";
    }
}
class Branch {
    String name;
    String bhavan;
    int floor;
    String hod;
    int code;
    Branch(String name, String bhavan, int floor, String hod, int code) {
        this.name = name;
        this.bhavan = bhavan;
        this.floor = floor;
        this.hod = hod;
        this.code = code;
    }
    @Override
    public String toString() {
        return "Branch(" + name + ", " + bhavan + ", " + floor + ", " + hod + ", " + code + ")";
    }
}
class Student {
    String name;
    String rollNumber;
    int age;
    Branch branch;
    Subject[] subjects;
    Student(String name, String rollNumber, int age, Branch branch, Subject[] subjects) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.branch = branch;
        this.subjects = subjects;
    }
    void showStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("RollNumber: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
       for(Subject sub : subjects) {
        System.out.println(sub);
       }
        
    }
}
public class CompositionEx2 {
    public static void main(String[] args) {
        Branch b1 = new Branch("ECE", "Ratan Tata", 3, "XYZ",4);
        Subject[] subs = {
                            new Subject("Java", "Theorey", 3),
                            new Subject("Python", "Lab" , 1)
                        };
        Student s1 = new Student("Alice", "24P31A0426", 18, b1, subs);
        s1.showStudentDetails();
    }
}
