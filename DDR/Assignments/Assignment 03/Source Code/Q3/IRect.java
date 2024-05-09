
public interface RectangleInterface {
    float calculateArea();

    float calculatePerimeter();

    boolean containsPoint(float x, float y);

    boolean containsRectangle(CustomRectangle rectangle);

    boolean coversRectangle(CustomRectangle rectangle);
}
