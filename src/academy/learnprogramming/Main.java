package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // 1. int (Primitive type) - Integer (Wrapper Class)

        // Stores the minimum valid "int" value.
        int myMinIntValue = Integer.MIN_VALUE;

        // Stores the maximum valid "int" value.
        int myMaxIntValue = Integer.MAX_VALUE;

        // Println statement combines both text and data using the "+" operator.
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // Adding 1 to "myMaxIntValue" - OVERFLOW
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));

        // Adding -1 to "myMinIntValue" - UNDERFLOW
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));

        /*
         * int myMaxIntTest = 2147483648;   IDE Message -> Integer number too large
         *
         * The above statement would result in an error, as the literal value exceeds the maximum range of an "int"
         * type.
         */

        // 2. byte (Primitive type) - Byte (Wrapper Class)

        // Stores minimum and maximum valid "byte" values.
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        // Prints out the minimum and maximum "byte" values.
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        // 3. short (Primitive type) - Short (Wrapper Class)

        // Stores minimum and maximum valid "short" values.
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        // Prints out the minimum and maximum "short" values.
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        // 4. long (Primitive type) - Long (Wrapper Class)

        // Stores minimum and maximum valid "long" values.
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        // Prints out the minimum and maximum "long" values.
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        // Appending "L" at the end of a value informs the computer that this value is a "long" literal.
        long myLongValue = 100L;
        System.out.println(myLongValue);

        /*
         * long myLongValue = 100;
         *
         * The above statement is valid because an "int" type fits entirely in a "long" datatype due to "long" having
         * twice the width that of "int"; hence Java will convert the "int" value to "long" automatically.
         *
         * long bigLongLiteralValue = 2147483648; IDE Message -> Integer number too large
         *
         * The above statement will result in an error because Java still treats the value as an "int" literal that
         * exceeds its maximum range. Adding "L" at the end of the value will let Java treat it as a "long" literal.
         */
        long bigLongLiteralValue = 2147483648L;
        System.out.println(bigLongLiteralValue);
    }
}
