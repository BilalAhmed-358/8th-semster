public class CustomRectangle {
    private float posX;
    private float posY;
    private float width;
    private float height;

    // Constructors
    public CustomRectangle() {
        this.posX = 0;
        this.posY = 0;
        this.width = 1;
        this.height = 1;
    }

    public CustomRectangle(float posX, float posY, float width, float height) {
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
    }

    // Getters and Setters
    public float getPosX() {
        return posX;
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }

    public float getPosY() {
        return posY;
    }

    public void setPosY(float posY) {
        this.posY = posY;
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
        return x >= posX - width / 2 && x <= posX + width / 2 && y >= posY - height / 2 && y <= posY + height / 2;
    }

    public boolean containsRectangle(CustomRectangle rect) {
        float xMin = posX - width / 2;
        float xMax = posX + width / 2;
        float yMin = posY - height / 2;
        float yMax = posY + height / 2;

        return rect.posX - rect.width / 2 >= xMin && rect.posX + rect.width / 2 <= xMax &&
                rect.posY - rect.height / 2 >= yMin && rect.posY + rect.height / 2 <= yMax;
    }

    // covers method
    public boolean coversRectangle(CustomRectangle rect) {
        return posX - width / 2 <= rect.posX + rect.width / 2 &&
                posX + width / 2 >= rect.posX - rect.width / 2 &&
                posY - height / 2 <= rect.posY + rect.height / 2 &&
                posY + height / 2 >= rect.posY - rect.height / 2;
    }
}