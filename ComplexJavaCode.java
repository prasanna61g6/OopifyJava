import java.util.HashSet;
import java.util.Objects;

class Point {
  int x, y;
  Point(int xValue, int yValue) {
    this.x = xValue;
    this.y = yValue;
  }
  @Override
  public String toString() {
    return "Point(" + x + ", " + y + ")";
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    Point temp = (Point)o;
    return temp.x == this.x && temp.y == this.y;
  }
  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }
}
class StraightLine {
  Point p1, p2;
  StraightLine(Point p1, Point p2) {
    this.p1 = p1;
    this.p2 = p2;
  }
  @Override
  public String toString() {
    return "StraightLine(" + p1 + ", " + p2 + ")";
  }
  @Override
  public int hashCode() {
    return Objects.hash(p1, p2);
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    StraightLine s = (StraightLine) o;
    return s.p1.equals(s.p2);
  }
}
public class ComplexJavaCode {
  public static void main(String[] args) {
    Point p1 = new Point(2, 3);
    Point p2 = new Point(4, 5);
    Point p3 = new Point(2, 3);
    HashSet<Point> set1 = new HashSet<>();
    set1.add(p1);
    set1.add(p2);
    set1.add(p3);
    System.out.println(set1.size());
    StraightLine s1 = new StraightLine(p1, p2);
    StraightLine s2 = new StraightLine(p2, p3);
    StraightLine s3 = new StraightLine(p1, p3);
    StraightLine s4 = new StraightLine(p3, new Point(2, 3));
    HashSet<StraightLine> set2 = new HashSet<>();
    set2.add(s1);
    set2.add(s2);
    set2.add(s3);
    set2.add(s4);
    System.out.println(set2.size());
  }
}
