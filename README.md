CalculatorWithParameters

A simple Java project to demonstrate the usage of parameters in methods. This project provides a basic calculator with methods for addition, subtraction, multiplication, and division.
Features

    - Addition: Adds two numbers.
    - Subtraction: Subtracts the second number from the first.
    - Multiplication: Multiplies two numbers.
    - Division: Divides the first number by the second. Includes error handling for division by zero.

Code Example

    CalculatorWithParameters calculator = new CalculatorWithParameters();

    int num1 = 20;
    int num2 = 10;

    System.out.println("Addition: " + calculator.add(num1, num2));
    System.out.println("Subtraction: " + calculator.subtract(num1, num2));
    System.out.println("Multiplication: " + calculator.multiply(num1, num2));
    System.out.println("Division: " + calculator.divide(num1, num2));

How to Run

1.Compile the program:

    javac CalculatorWithParameters.java

1.Run the program:

    java CalculatorWithParameters

Expected Output

    Addition: 30
    Subtraction: 10
    Multiplication: 200
    Division: 2.0

License

    This project is open-source and available for personal and educational use.
