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
        if(number%2 == 0)
            return "Even";
        else
            return "Odd";
    }


}