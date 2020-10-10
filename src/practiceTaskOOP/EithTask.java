package practiceTaskOOP;

//8
class Rectangle extends Square {
    private double height;

    public Rectangle(double length, double height) {
        super(length);
        this.height = height;
    }

    @Override
    public double area() {
        return sideLength * height;
    }

    @Override
    public double perimeter() {
        return 2.0 * (sideLength + height);
    }
}

public class EithTask {
    public static void main(String[] args) {

        GraphicObject c1 = new Circle(3.5);
        GraphicObject r1 = new Rectangle(7.0, 4.0);
        System.out.println("Area = " + c1.area());
        System.out.println("Area = " + r1.area());
    }
}
