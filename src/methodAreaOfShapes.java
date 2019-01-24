/*Write an application to calculate the area of a circle, triangle, rectangle or square.

Have the user input the shape they want to calculate the area for
and then based on that, get the input needed to make that calculation.

    Area of a circle = π*r2 (For simplicity, let's set π = 3.14)
    Area of a triangle = (1/2)b*h (base x height)
    Area of a rectangle = l*w (length x width)
    Area of a square = a^2 (a is the length of one side of a square)

Write methods for each area calculation.*/

import java.util.Scanner;

public class methodAreaOfShapes {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose one of the following shapes that you'd like to calculate the area for: ");
        System.out.println("1) circle\t2) triangle\t3) rectangle\t4) square");
        int userInput = input.nextInt();
        double area = -1;

        // Choose appropriate getArea method depending on user choice
        if(userInput==1){
            // call getAreaCircle
            System.out.println("Please enter the radius of the circle: ");
            double radius = input.nextDouble();
            area = getAreaCircle(radius);
        }else if (userInput==2){
            // call getAreaTriangle
            System.out.println("Please enter the base of the triangle: ");
            double base = input.nextDouble();
            System.out.println("Please enter the height of the triangle: ");
            double height = input.nextDouble();
            area = getAreaTriangle(base, height);
        }else if (userInput==3){
            // call getAreaRectangle
            System.out.println("Please enter the length of the rectangle: ");
            double length = input.nextDouble();
            System.out.println("Please enter the width of the rectangle:");
            double width = input.nextDouble();
            area = getAreaRectangle(length, width);
        }else if (userInput==4){
            // call getAreaSquare
            System.out.println("Please enter the length of one side of the square: ");
            double side = input.nextDouble();
            area = getAreaSquare(side);

        }else{
            System.out.println("That choice is invalid. Please choose again between 1 and 4.");
        }

        // Print accordingly
        if (userInput>0 && userInput<5){
            System.out.print("The area of the ");
            if (userInput==1){
                System.out.print("circle");
            }else if (userInput==2){
                System.out.print("triangle");
            }else if (userInput==3){
                System.out.print("rectangle");
            }else if (userInput==4){
                System.out.print("square");
            }
            System.out.print(" is " + area);
        }

    }

    public static double getAreaCircle(double r){
        double A = 0;
        final double pi = 3.14;
        A = pi * (r*r);
        return A;
    }

    public static double getAreaTriangle(double b, double h){
        double A = 0;
        A = 0.5 * b * h;
        return A;
    }

    public static double getAreaRectangle(double l, double w){
        double A = 0;
        A = l * w;
        return A;
    }

    public static double getAreaSquare(double s){
        double A = 0;
        A = s * s;
        return A;
    }
}
