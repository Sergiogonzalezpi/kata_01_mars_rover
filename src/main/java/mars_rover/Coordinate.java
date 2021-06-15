package mars_rover;

public class Coordinate {
    private int x;
    private int y;

    public Coordinate(){
        this.x = 0;
        this.y = 0;
    }

    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

    // getters & setters

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

    @Override
    public boolean equals(Object c) {
        if (getClass() != c.getClass()) return false;
        Coordinate coordinate = (Coordinate) c;
        return y == coordinate.y && x == coordinate.x;
    }

    @Override
    public String toString(){
        return "Coordinate: [x:" + this.x + ", y:" + this.y + "]";
    }
}
