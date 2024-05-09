// IShape.java
public interface IShape {
    float area();

    float perimeter();

    boolean holds(float x, float y);

    boolean holds(IShape shape);

    boolean covers(IShape shape);
}
