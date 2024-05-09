// ACircle.java
public class ACircle extends AShape {
    protected float radius;

    public ACircle(float ptX, float ptY, float radius) {
        this.ptX = ptX;
        this.ptY = ptY;
        this.radius = radius;
    }

    public float area() {
        return (float) (Math.PI * radius * radius);
    }

    public float perimeter() {
        return (float) (2 * Math.PI * radius);
    }

    public boolean holds(float x, float y) {
        return Math.sqrt(Math.pow(x - ptX, 2) + Math.pow(y - ptY, 2)) <= radius;
    }

    public boolean holds(AShape shape) {
        // Implementation for holds method specific to circle
        return true;
    }

    public boolean covers(AShape shape) {
        // Implementation for covers method specific to circle
        return true;
    }
}
