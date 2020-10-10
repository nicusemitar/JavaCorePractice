package practiceTaskOOP;

// 1)
class Square extends GraphicObject {
    protected double sideLength;

    Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }

    double perimeter() {
        return 4.0 * sideLength;
    }
}

//2)
class Circle extends GraphicObject {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2.0 * Math.PI * radius;
    }
}

public class ThirstAndSecondTask {
    public static void main(String[] args) {

        //1.
        Square square = new Square(7);
        System.out.println(square.area());
        System.out.println(square.perimeter());
        //2.
        Circle circle = new Circle(2.0);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());


    }
}
