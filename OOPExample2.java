class LightBulb {
  // instance variable
  boolean isOn;
  String company;
  int capacity;

  // instance methods
  void turnOn() {
    isOn = true;
  }
  void turnOff() {
    isOn = false;
  }
  void printStatus() {
    if (isOn) {
      System.out.println("Yes. Bulb is on");
    } else {
      System.out.println("Bulb is off");
    }
  }
}
public class OOPExample2 {
  public static void main(String[] args) {
    LightBulb hallBulb = new LightBulb();
    hallBulb.company = "Crompton";
    hallBulb.capacity = 8;
    
    hallBulb.printStatus();
    hallBulb.turnOn(); // trun on the bulb
    hallBulb.printStatus();
    LightBulb kitchenBulb = new LightBulb();
    kitchenBulb.turnOn();
    kitchenBulb.printStatus();
    hallBulb.turnOff();
    kitchenBulb.turnOff();
    hallBulb.printStatus();
    kitchenBulb.printStatus();
  }
}
