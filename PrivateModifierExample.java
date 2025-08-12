class Student {
  // rollNumber only accessible within the student class since it's private
  private String rollNumber;
  int age;
  // printDetails() is a private method, it can't be accessed outside the class
  private void printDetails() {
    System.out.println(rollNumber);
  }

}
public class PrivateModifierExample {
  public static void main(String[] args) {
    Student s1 = new Student();
    System.out.println(s1.rollNumber); // error since
    s1.printDetails(); // error
  } 
}