package practiceTaskOOP;

public class UsePoint {
    public static void main(String[] args) {
        // 4)
        Point p4 = new Point();
        p4.setX(20);
        p4.setY(15);
        p4.setZ(30);
        System.out.println(p4.getX());
        System.out.println(p4.getY());
        System.out.println(p4.getZ());

        // 5)
        Point p5 = new Point(20, 15, 30);
        System.out.println(p5.getX());
        System.out.println(p5.getY());
        System.out.println(p5.getZ());

        Point p5x = new Point(23, 43);
        System.out.println(p5x.getX());
        System.out.println(p5x.getY());
        System.out.println(p5x.getZ());
    }
}
