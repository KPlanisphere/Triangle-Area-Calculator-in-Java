# Triangle Area Calculator in Java

This repository contains a Java project that calculates the area of a triangle given the lengths of its sides. The program includes classes for handling user input, performing calculations, and displaying the results.

## Features

- **User Input Handling**: Reads the lengths of the triangle's sides from the user.
- **Area Calculation**: Computes the area using Heron's formula.
- **Result Display**: Outputs the calculated area to the user.

### Code Snippets

#### Main Class
The main class initializes the program, handles user input, and invokes the calculation methods.

```java
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of side A: ");
        double sideA = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        double sideB = scanner.nextDouble();

        System.out.print("Enter the length of side C: ");
        double sideC = scanner.nextDouble();

        TTriangulo triangle = new TTriangulo(sideA, sideB, sideC);
        double area = triangle.calculateArea();

        System.out.println("The area of the triangle is: " + area);
    }
}
```

#### Triangle Class

The `TTriangulo` class contains methods for calculating the area of the triangle.

```java
public class TTriangulo {
    private double sideA;
    private double sideB;
    private double sideC;

    public TTriangulo(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}
```

### Usage

1.  Compile the Java files using a Java compiler (e.g., `javac`).
2.  Run the main class (`Principal`) to start the program.
3.  Enter the lengths of the triangle's sides when prompted.
4.  The program will calculate and display the area of the triangle.

### Classes and Methods

-   `Principal`: The main class that handles user input and program execution.
    -   `main(String[] args)`: The entry point of the program.
-   `TTriangulo`: A class representing a triangle with methods for area calculation.
    -   `TTriangulo(double sideA, double sideB, double sideC)`: Constructor that initializes the triangle's sides.
    -   `calculateArea()`: Method that calculates and returns the area of the triangle using Heron's formula.