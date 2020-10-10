package practiceTaskOOP;

public class Point {
    private int x;
    private int y;
    private int z;

    //5
    public Point(int x, int y, int z) {
        this(x, y);
//        this.x = x;
//        this.y = y;
        this.z = z;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //4
    Point() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
