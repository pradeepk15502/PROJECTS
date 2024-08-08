ThalaForReason
This Java program is a simple demonstration of basic arithmetic operations. It takes an integer input from the user, performs a series of calculations, and then outputs a final result. The operations are designed in such a way that the output will always be a constant value, regardless of the input provided.

How It Works:
Input Stage:

The program prompts the user to enter an integer value (n).
Calculation Stage:

The input value n is first doubled (y = 2 * n).
A constant value of 14 is added to the result (sum = y + 14).
This sum is then divided by 2 (div = sum / 2).
Finally, the initial input value n is subtracted from the result (ans = div - n).
Output Stage:

The program prints the final result (ans).
Key Points:
Predictable Outcome: No matter what integer is provided as input, the output will always be 7. This is because the operations simplify to (2 * n + 14) / 2 - n, which reduces to 7.

Educational Purpose: This program can serve as a simple educational example to demonstrate arithmetic operations and how predictable outcomes can be achieved through algebraic manipulation.

Example:
Enter your number
5
Your ans is: 7
In this example, even though the input was 5, the output is still 7.

Potential Enhancements:
Adding error handling for non-integer inputs.
Extending the program to handle multiple operations or providing explanations for the output.
