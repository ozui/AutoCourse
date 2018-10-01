import java.util.Scanner;

import static java.lang.Math.sqrt;

public class SquareFinder {

    private static final double pi = 3.14;
    private static final String squareString = "Enter  positive square side length: ";
    private static final String circleString = "Enter  positive circle radius: ";
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double squareSide = readNumber(squareString);
        double circleRadius = readNumber(circleString);

        System.out.printf("Square of square: %.2f\n", getSquareSquare(squareSide));
        System.out.printf("Square of circle: %.2f\n",getCircleSquare(circleRadius));

        boolean circleFitsSquare = ifCircleFitsSquare(squareSide,circleRadius);
        boolean squareFitsCircle = ifSqureFitsCirle(squareSide,circleRadius);
        System.out.printf("Square with side %.2f fits circle with radius %.2f: %b\n", squareSide, circleRadius, squareFitsCircle);
        System.out.printf("Circle with radius %.2f fits square with side %.2f: %b\n", circleRadius, squareSide, circleFitsSquare);
    }

    private static double getSquareSquare(double squareSide) {
        return Math.pow(squareSide, 2);
    }

    private static double getCircleSquare(double circleRadius) {
        return pi * Math.pow(circleRadius, 2);
    }

    private static double readNumber(String prompt) {
        double num = -1;

        while (num < 0) {

            System.out.println(prompt);

            try {
                num = in.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input, only positive numbers are allowed");
                in.next();
            }
        }
        return num;
    }

    private static boolean ifCircleFitsSquare(double squareSide, double circleRadius) {
        return (circleRadius == squareSide / 2);
    }

    private static boolean ifSqureFitsCirle(double squareSide, double circleRadius) {
        return (circleRadius == sqrt(2) * squareSide / 2);
    }
}
