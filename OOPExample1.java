class Square {
  // instance variables (attribute / property)
  int side;
  int area;
  int perimeter;

  // instance methods
  void calculateArea() {
    area = side * side;
  }
  void calculatePerimeter() {
    perimeter = 4 * side;
  }
}
class OOPExample1 {
  // working as runnable class
  public static void main(String[] args) {
    // Create an object of Square class
    // ClassName obj_name = new ClassName();
    Square s1 = new Square();
    s1.side = 10; // populating side varible with a value 10
    System.out.println(s1.area); // area before calculation
    s1.calculateArea(); //  calculating area
    System.out.println(s1.area); // area after calcuation
    s1.calculatePerimeter(); // calculating perimeter
    System.out.println(s1.perimeter);
    Square s2 = new Square();
    s2.side = 20;
    System.out.println(s1.side);
    s2.calculateArea();
    System.out.println(s2.area);
    
  }
}