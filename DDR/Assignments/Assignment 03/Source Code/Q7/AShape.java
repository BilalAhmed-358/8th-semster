// AShape.java
public abstract class AShape {
    protected float ptX;
    protected float ptY;

    public abstract float area();

    public abstract float perimeter();

    public abstract boolean holds(float x, float y);

    public abstract boolean holds(AShape shape);

    public abstract boolean covers(AShape shape);
}
