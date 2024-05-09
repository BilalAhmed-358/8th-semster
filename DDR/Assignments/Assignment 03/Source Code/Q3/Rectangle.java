
public class CustomRectangle implements RectangleInterface {
    private float positionX;
    private float positionY;
    private float width;
    private float height;

    // Constructors
    public CustomRectangle() {
        this.positionX = 0;
        this.positionY = 0;
        this.width = 1;
        this.height = 1;
    }

    public CustomRectangle(float positionX, float positionY, float width, float height) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.width = width;
        this.height = height;
    }

    // Getters and Setters
    public float getPositionX() {
        return positionX;
    }

    public void setPositionX(float positionX) {
        this.positionX = positionX;
    }

    public float getPositionY() {
        return positionY;
    }

    public void setPositionY(float positionY) {
        this.positionY = positionY;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    // Area and Perimeter
    public float calculateArea() {
        return width * height;
    }

    public float calculatePerimeter() {
        return 2 * (width + height);
    }

    // contains methods
    public boolean containsPoint(float x, float y) {
        return x >= positionX - width / 2 && x <= positionX + width / 2 && y >= positionY - height / 2 && y <= positionY + height / 2;
    }

    public boolean containsRectangle(CustomRectangle rectangle) {
        float xMin = positionX - width / 2;
        float xMax = positionX + width / 2;
        float yMin = positionY - height / 2;
        float yMax = positionY + height / 2;

        return rectangle.positionX - rectangle.width / 2 >= xMin && rectangle.positionX + rectangle.width / 2 <= xMax &&
                rectangle.positionY - rectangle.height / 2 >= yMin && rectangle.positionY + rectangle.height / 2 <= yMax;
    }

    // covers method
    public boolean coversRectangle(CustomRectangle rectangle) {
        return positionX - width / 2 <= rectangle.positionX + rectangle.width / 2 &&
                positionX + width / 2 >= rectangle.positionX - rectangle.width / 2 &&
                positionY - height / 2 <= rectangle.positionY + rectangle.height / 2 &&
                positionY + height / 2 >= rectangle.positionY - rectangle.height / 2;
    }
}
