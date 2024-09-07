import java.io.Serial;

/*************************************************************************
 *
 * File name: Assignment1.java
 * Author:    Elijah Tucker
 * Last Edit: 7 Sep 2024
 *
 * Prompt:    Write a Java program that preforms basic arithmetic
 *            operations (addition, subtraction, multiplication, and
 *            division). Adhere to a custom coding style guide, focusing
 *            on naming conventions, consist use of expressions and
 *            statements and including comments for clarity.
 *
 * Change Log:
 *
 * Date & Time        | Description
 * -------------------|-------------------------------
 * 07 Sep 2024 3:00PM | Create File
 * 07 Sep 2024 3:12PM | Create main functions
 * 07 Sep 2024 3:41PM | Create calculate sum function
 * 05 Sep 2024 4:29PM | Create calculateDifference function
 *
 ************************************************************************/

public class Assignment1 {


    /*********************************************************************
     * Function Name: main
     * Inputs:        args - String[] - arguments when the program is
     *                      called
     * Output:        None
     *
     * Description:   This project sets the two numbers and then calls all
     *                the functions for operations.
     *
     ********************************************************************/

    public static void main(String[] args) {

        int number1 = 5;
        int number2 = 3;

        System.out.printf("Number 1 is: %d\nNumber 2 is: %d\n", number1, number2);

        System.out.printf("The sum of the two numbers is: %d\n", calculateSum(number1, number2));
        System.out.printf("Number 1 minus Number 2 is: %d\n", calculateDifference( number1, number2) );
    }

    /*********************************************************************
     * Function Name: calculateSum
     * Inputs:        number1 - int - the first number to be added
     *                number2 - int - the second number to be added
     *
     * Output:        int - the addition of the two numbers
     *
     * Description:   This function adds two numbers
     *
     ********************************************************************/

    public static int calculateSum( int number1, int number2 ) {

        return number1 + number2; //add the numbers and return the value

    }

    /*********************************************************************
     * Function Name: calculateDifference
     * Inputs:        number1 - int - the first number to be subtracted
     *                number2 - int - the second number to be subtracted
     *
     * Output:        int - the subtraction of the two numbers
     *
     * Description:   This function subtracts two numbers
     *
     ********************************************************************/

    public static int calculateDifference( int number1, int number2 ) {

        return number1 - number2; //subtract the numbers and return

    }
}
