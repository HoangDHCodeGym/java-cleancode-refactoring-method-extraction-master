public class Cylinder {
    private static double getBaseArea(int radius) {
        return Math.pow(radius, 2) * Math.PI;
    }

    private static double getPerimeter(int radius) {
        return radius * 2 * Math.PI;
    }

    public static double getSurfaceArea(int radius, int height) {
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        return perimeter * height + 2 * baseArea;
    }
}
