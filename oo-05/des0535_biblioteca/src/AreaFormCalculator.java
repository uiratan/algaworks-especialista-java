public class AreaFormCalculator {
    static final double PI = 3.14159265358979323846;

    static double squareArea(double sideLength) {
        return sideLength * sideLength;
    }

    static double circleArea(double radius) {
        return radius * radius * AreaFormCalculator.PI;
    }
}
