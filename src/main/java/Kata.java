public class Kata {
    /*
    Very simple, given a number (integer / decimal / both depending on the language),
     find its opposite (additive inverse).
        Examples:
        1: -1
        14: -14
        -34: 34
     */


    public static int opposite(int number) {
        return 0 - number;
    }

    /*
    Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
    */

    public static String even_or_odd(int number) {
        if (number % 2 == 0)
            return "Even";
        else
            return "Odd";
    }

    /*
    DESCRIPTION:
        Given an array of integers your solution should find the smallest integer.

        For example:

        Given [34, 15, 88, 2] your solution will return 2
        Given [34, -345, -1, 100] your solution will return -345
        You can assume, for the purpose of this kata, that the supplied array will not be empty.
     */


    public static int findSmallestInt(int[] args) {
        int smallestNumber = args[0];

        for (int i = 1; i < args.length; i++) {

            if (args[i] < smallestNumber) {
                smallestNumber = args[i];
            }
        }
        return smallestNumber;

    }

    /*
    DESCRIPTION:
        You get an array of numbers, return the sum of all of the positives ones.

        Example [1,-4,7,12] => 1 + 7 + 12 = 20

        Note: if there is nothing to sum, the sum is default to 0.
     */

    public static int sum(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    /*
    DESCRIPTION:
        In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?

        Examples
        Kata.makeNegative(1);  // return -1
        Kata.makeNegative(-5); // return -5
        Kata.makeNegative(0);  // return 0
        Notes
        The number can be negative already, in which case no change is required.
        Zero (0) is not checked for any specific sign. Negative zeros make no mathematical sense.
        */

    public static int makeNegative(final int x) {
        if (x == 0) {
            return 0;
        } else if (x < 0)
            return x;
        else
            return -x;
    }

    /*
    DESCRIPTION:
        Write a function that accepts an integer n and a string s as parameters,
        and returns a string of s repeated exactly n times.

        Examples (input -> output)
        6, "I"     -> "IIIIII"
        5, "Hello" -> "HelloHelloHelloHelloHello"
        */

    public static String repeatStr(final int repeat, final String string) {

        String s = "";
        for (int i = 0; i < repeat; i++) s += string;
        return s;
    }

    public static String repeatStrv2(final int repeat, final String string) {

        if (repeat == 0)
            return "";
        else
            return string.repeat(repeat);
    }

    public static String repeatStrv3(final int repeat, final String string) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(string);
        }
        return String.valueOf(sb);
    }


}