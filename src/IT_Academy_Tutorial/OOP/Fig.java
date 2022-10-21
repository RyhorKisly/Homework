package IT_Academy_Tutorial.OOP;

abstract class Fig {
    protected float x;
    protected float y;

    float getX() {
        return x;
    }

    float getY() {
        return y;
    }

    void move(float dx, float dy) {
        x += dx;
        y += dy;
    }
    abstract float calcArea();
    abstract String getType();
}


