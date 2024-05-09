public class ACircle implements IShape {
    private float ptX;
    private float ptY;
    private float radius;

    public ACircle(float ptX, float ptY, float radius) {
        this.ptX = ptX;
        this.ptY = ptY;
        this.radius = radius;
    }

    @Override
    public float area() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public float perimeter() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    public boolean holds(float x, float y) {
        return Math.sqrt(Math.pow(x - ptX, 2) + Math.pow(y - ptY, 2)) <= radius;
    }

    @Override
    public boolean holds(IShape shape) {
        // Implementation for holds method specific to circle
        return false;
    }

    @Override
    public boolean covers(IShape shape) {
        // Implementation for covers method specific to circle
        return false;
    }
}