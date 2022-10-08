package Training;

public class Box {

    private int x;
    private  int y;
    private int z;
    final String NAME = "Box";
    Box(int x1, int x2, int x3){
        this.x = x1;
        this.y = x2;
        this.z = x3;
    }

    public int getX() {
        return this.x;
    }
    public void setX() {
        this.x = x;
    }
    void printVolume() {
        System.out.println(x * y * z);
    }

}
