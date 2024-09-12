/*************************************************************************
 *
 * File name: Assignment1.java
 * Author:    Elijah Tucker
 * Last Edit: 9 Sep 2024
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
 * 07 Sep 2024 3:41PM | Create calculateSum function
 * 07 Sep 2024 4:29PM | Create calculateDifference function
 * 07 Sep 2024 4:38PM | Create calculateProduct function
 * 07 Sep 2024 4:51PM | Create calculateQuotient function
 * 08 Sep 2024 9:31AM | Add comments in main function
 * 09 Sep 2024 3:36PM | Clean up the main function to be more readable
 * 12 Sep 2024 5:39PM | Fix to have the right print call
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
     *                the functions for the different operations and
     *                prints the results in an easy to read format.
     *
     ********************************************************************/

    public static void main(String[] args) {

        //set the numbers
        int number1 = 5;
        int number2 = 3;

        //Display the set numbers used
        System.out.println("Number 1 is: " + number1);
        System.out.println("Number 2 is: " + number2);

        int sum = calculateSum(number1, number2); //add the two numbers
        System.out.println("The sum of the two numbers is: " + sum); //display the sum

        int difference = calculateDifference(number1, number2); //subtract number 2 from number 1
        System.out.println("Number 1 minus Number 2 is: " + difference ); //display the difference

        int product = calculateProduct(number1, number2); // multiply the two numbers
        System.out.println("The product of the two numbers is: " + product ); //display the product

        double quotient = calculateQuotient(number1, number2); //divide number 1 by number 2
        System.out.println("Number 1 divided by Number 2 is: " + quotient ); //display the quotient

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

    private static int calculateSum( int number1, int number2 ) {

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

    private static int calculateDifference( int number1, int number2 ) {

        return number1 - number2; //subtract the numbers and return

    }

    /*********************************************************************
     * Function Name: calculateProduct
     * Inputs:        number1 - int - the first number to be multiply
     *                number2 - int - the second number to be multiply
     *
     * Output:        int - the multiplication of the two numbers
     *
     * Description:   This function multiplies two numbers
     *
     ********************************************************************/

    private static int calculateProduct( int number1, int number2 ) {

        return number1 * number2; //multiply the numbers and return

    }

    /*********************************************************************
     * Function Name: calculateQuotient
     * Inputs:        number1 - int - the first number to be divided
     *                number2 - int - the second number to be divided
     *
     * Output:        double - the division of the two numbers
     *
     * Description:   This function divides two numbers
     *
     ********************************************************************/

    private static double calculateQuotient( int number1, int number2 ) {

        return ((double) number1) / ((double) number2); //divide the numbers and return

    }

}
