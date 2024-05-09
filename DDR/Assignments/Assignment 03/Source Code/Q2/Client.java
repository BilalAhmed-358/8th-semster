public class Application {
    public static void main(String[] args) {
        // Step 1(a)
        CustomRectangle rectangle = new CustomRectangle(1.5f, 1.5f, 5.5f, 4.9f);

        // Step 1(b)
        System.out.println("Area: " + rectangle.calculateArea());

        // Step 1(c)
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        // Step 1(d)
        System.out.println("containsPoint(2.5, 2.5): " + rectangle.containsPoint(2.5f, 2.5f));

        // Step 1(e)
        System.out.println("containsRectangle(new CustomRectangle(3, 5, 8.5, 3.5)): " +
                rectangle.containsRectangle(new CustomRectangle(3, 5, 8.5f, 3.5f)));

        // Step 1(f)
        System.out.println("coversRectangle(new CustomRectangle(3, 5, 2.3, 5.4)): " +
                rectangle.coversRectangle(new CustomRectangle(3, 5, 2.3f, 5.4f)));
    }
}
