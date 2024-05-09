// Client.java
public class Client {
    public static void main(String[] args) {
        // Create instances of different shapes
        AShape rect = new ARectangle(1.5f, 1.5f, 5.5f, 4.9f);
        AShape square = new ASquare(2.0f, 2.0f, 4.0f);
        AShape circle = new ACircle(3.0f, 3.0f, 2.5f);

        // Display properties of each shape
        System.out.println("Rectangle Area: " + rect.area());
        System.out.println("Rectangle Perimeter: " + rect.perimeter());
        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        // Check if each shape holds a point
        float x = 2.5f;
        float y = 2.5f;
        System.out.println("Point (" + x + ", " + y + ") in Rectangle: " + rect.holds(x, y));
        System.out.println("Point (" + x + ", " + y + ") in Square: " + square.holds(x, y));
        System.out.println("Point (" + x + ", " + y + ") in Circle: " + circle.holds(x, y));

        // Check if one shape holds another
        System.out.println("Rectangle holds Square: " + rect.holds(square));
        System.out.println("Square holds Circle: " + square.holds(circle));

        // Check if one shape covers another
        System.out.println("Rectangle covers Square: " + rect.covers(square));
        System.out.println("Circle covers Square: " + circle.covers(square));
    }
}
