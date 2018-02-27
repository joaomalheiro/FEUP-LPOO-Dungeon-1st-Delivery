package logic;

public class GameObject {

    public int x;
    public int y;

    GameObject() {
    }

    GameObject(int xcoord, int ycoord) {
        x = xcoord;
        y = ycoord;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    void setX(int xcoord) {
        x = xcoord;
    }

    void setY(int ycoord) {
        y = ycoord;
    }

}