public class ASquare implements IShape {
    private float ptX;
    private float ptY;
    private float side;

    public ASquare(float ptX, float ptY, float side) {
        this.ptX = ptX;
        this.ptY = ptY;
        this.side = side;
    }

    @Override
    public float area() {
        return side * side;
    }

    @Override
    public float perimeter() {
        return 4 * side;
    }

    @Override
    public boolean holds(float x, float y) {
        return x >= ptX - side / 2 && x <= ptX + side / 2 && y >= ptY - side / 2 && y <= ptY + side / 2;
    }

    @Override
    public boolean holds(IShape shape) {
        // Implementation for holds method specific to square
        return false;
    }

    @Override
    public boolean covers(IShape shape) {
        // Implementation for covers method specific to square
        return false;
    }
}