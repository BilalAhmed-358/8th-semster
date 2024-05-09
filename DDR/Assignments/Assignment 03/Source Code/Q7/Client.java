// Client.java
public class Client {
    public static void main(String[] args) {
        // Create instances of different shapes using the AShape interface
        IShape rect = new ARectangle(1.5f, 1.5f, 5.5f, 4.9f);
        IShape square = new ASquare(2.0f, 2.0f, 4.0f);
        IShape circle = new ACircle(3.0f, 3.0f, 2.5f);

        // Step 2(a): Print area of each shape
        System.out.println("Rectangle Area: " + rect.area());
        System.out.println("Square Area: " + square.area());
        System.out.println("Circle Area: " + circle.area());

        // Step 2(b): Print perimeter of each shape
        System.out.println("Rectangle Perimeter: " + rect.perimeter());
        System.out.println("Square Perimeter: " + square.perimeter());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        // Step 2(c): Check if a point is held by each shape
        float x = 2.5f;
        float y = 2.5f;
        System.out.println("Point (" + x + ", " + y + ") in Rectangle: " + rect.holds(x, y));
        System.out.println("Point (" + x + ", " + y + ") in Square: " + square.holds(x, y));
        System.out.println("Point (" + x + ", " + y + ") in Circle: " + circle.holds(x, y));

        // Step 2(d): Check if one shape holds another
        System.out.println("Rectangle holds Square: " + rect.holds(square));
        System.out.println("Square holds Circle: " + square.holds(circle));

        // Step 2(e): Check if one shape covers another
        System.out.println("Rectangle covers Square: " + rect.covers(square));
        System.out.println("Circle covers Square: " + circle.covers(square));
    }
}
