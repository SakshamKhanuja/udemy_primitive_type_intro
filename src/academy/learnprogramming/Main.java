package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // 1. int - Integer

        // Stores the minimum valid "int" value.
        int myMinIntValue = Integer.MIN_VALUE;

        // Stores the maximum valid "int" value.
        int myMaxIntValue = Integer.MAX_VALUE;

        // Println statement combines both text and data using the "+" operator.
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // Adding 1 to "myMaxIntValue".
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));

        // Adding -1 to "myMinIntValue".
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));

        /*
         * int myMaxIntTest = 2147483648;   IDE Message -> Integer number too large
         *
         * The above statement would result in an error, as the literal value exceeds the maximum range of an "int"
         * type.
         */
    }
}
