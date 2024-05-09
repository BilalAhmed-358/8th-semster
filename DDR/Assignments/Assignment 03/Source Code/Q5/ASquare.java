// ASquare.java
public class ASquare extends AShape {
    protected float side;

    public ASquare(float ptX, float ptY, float side) {
        this.ptX = ptX;
        this.ptY = ptY;
        this.side = side;
    }

    public float area() {
        return side * side;
    }

    public float perimeter() {
        return 4 * side;
    }

    public boolean holds(float x, float y) {
        return x >= ptX - side / 2 && x <= ptX + side / 2 && y >= ptY - side / 2 && y <= ptY + side / 2;
    }

    public boolean holds(AShape shape) {
        // Implementation for holds method specific to square
        return true;
    }

    public boolean covers(AShape shape) {
        // Implementation for covers method specific to square
        return true;
    }
}
