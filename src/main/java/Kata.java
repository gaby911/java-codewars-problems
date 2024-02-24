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

}