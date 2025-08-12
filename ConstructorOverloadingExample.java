class Citizen
{
  // Instance variables
   String aadhar;
   String firstName;
   String lastName;
   int age;
   char gender;
   String city;
   // no parametric constructor
   Citizen(){

   }
   // constructor 2
   Citizen(String A){
    aadhar = A;
   }
   // Constructor 3
   Citizen(String fn,String ln){
      firstName = fn;
      lastName = ln;
   }
   // Constructor 4
   Citizen(String fn,String ln,int a)
   {
    firstName=fn;
    lastName=ln;
    age=a;
   }
   // Constructor 5
   Citizen(String c,char g,String ln)
   {
    lastName = ln;
    city = c;
    gender = g; 
   }
   // Constructor 6
   Citizen(char g){
    gender=g;
   }
   void displayDetails()
   {
      System.out.println("Aadhar: " + aadhar);
      System.out.println("FirstName: " + firstName);
      System.out.println("Lastname: " +lastName);
      System.out.println("city: " + city);
      System.out.println("Age: " +age);
      System.out.println("Gender: " +gender);
   }

}
class ConstructorOverloadingExample {
  public static void main(String[] args) {
    // Object 1
    Citizen c1 = new Citizen();
    c1.displayDetails();

    // Object 2
    Citizen c2 = new Citizen("4567 8453 9042");
    c2.displayDetails();
    
    // Object 3
    Citizen c3 = new Citizen("Narendra", "Modi");
    c3.displayDetails();

  }  
}