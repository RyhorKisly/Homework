package Homework_from_Roman.hw5_solution;

public class Box {
    private final int x;
    private final int y;
    private final int z;

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getVolume() {
        return this.x * this.y * this.z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }


    @Override
    public String toString() {
        return String.format(
                "Box{%s %s %s volume: %s}",
                x,
                y,
                z,
                getVolume()
        );
    }
}

