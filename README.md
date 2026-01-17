
Number to Words Converter (Java)
📌 Project Description
This project is a Java console application that converts a number (up to 4 digits) into its word representation.
For example:

Input: 88

Output: Eighty Eight

The program takes user input using the Scanner class and converts the number into words using arrays and conditional logic.

🚀 Features
Converts numbers from 0 to 9999 into words

Handles:

Thousands

Hundreds

Tens

Units

Displays appropriate messages for invalid input

Simple logic without using loops or return statements

🛠️ Technologies Used
Java

Scanner class

Arrays

Conditional statements (if)

▶️ How to Run the Program
Install Java JDK

Open terminal / command prompt

Compile the program:

javac number.java
Run the program:

java number
Enter a number when prompted

🧾 Sample Input & Output
Input
Enter the number
3456
Output
Digit in the no. format Three Thousand Four Hundred Fifty Six
⚠️ Validations
If the number is greater than 4 digits, the program asks the user to enter a valid number

If the number is 0, output will be Zero

📖 Explanation (Logic Summary)
Arrays one[] and ten[] store word values

Number is broken into:

Thousands

Hundreds

Tens

Units

Each part is converted into words and appended to a string

📌 Future Improvements
Support for numbers greater than 4 digits

Handle negative numbers

Improve formatting and spelling corrections (e.g., Forty, Ninety)
