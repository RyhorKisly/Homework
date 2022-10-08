package Training;

public class Point {

    private int x;
    private int y;

    public Point() {
        x = 1;
        y = 1;
    }
    public Point(int x1, int x2) {
        this.x = x1;
        this.y = x2;
    }
    Point(int x) {
        this(x,x);
    }

}
