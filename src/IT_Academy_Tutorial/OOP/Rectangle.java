package IT_Academy_Tutorial.OOP;

public class Rectangle extends Fig {
    private float h;
    private float w;

    public Rectangle() {
        x = 1;
        y = 1;
        w = 1;
        h = 1;
    }

    public float calcArea() {
        return h * w;
    }

    public String getType() {
        return "Прямоугольник";
    }

}