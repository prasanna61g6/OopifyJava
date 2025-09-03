class Point {
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "Point(" + x + "," + y +")";
    }
}
class StraightLine {
    Point p1;
    Point p2;

    StraightLine(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    double getLength() {
        return Math.sqrt(Math.pow(p2.x-p1.x,2) + Math.pow(p2.y - p1.y, 2));
    }
    
}
public class CompositionTask {
    public static void main(String[] args) {
        StraightLine l1 = new StraightLine(new Point(2,8), new Point(3,7));
        System.out.println(l1.getLength());
    }
}
