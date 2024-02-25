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

    /*
    DESCRIPTION:
        Complete the method that takes a boolean value and return a "Yes" string for true,
         or a "No" string for false.
    */

    public static String boolToWord(boolean b) {
        if (b) return "Yes";
        else
            return "No";
    }

    /*
    DESCRIPTION:
        We need a function that can transform a number (integer) into a string.

        What ways of achieving this do you know?

        Examples (input --> output):
        123  --> "123"
        999  --> "999"
        -100 --> "-100"
        */

    public static String numberToString(int num) {
        return String.valueOf(num);
    }

    public static String numberToStringV2(int num) {
        return "" + num;
    }

    public static String numberToStringV3(int num) {
        return Integer.toString(num);
    }

    /*
    DESCRIPTION:
        It's pretty straightforward. Your goal is to create a function that removes the first and last characters
         of a string. You're given one parameter, the original string.
         You don't have to worry about strings with less than two characters.
     */

    public static String remove(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(str.length() - 1);
        sb.deleteCharAt(0);
        return sb.toString();
    }

    public static String removeV2(String str) {
        String res = "";
        for (int i = 1; i < str.length() - 1; i++) {
            res += str.charAt(i);
        }
        return res;
    }

    public static String removeV3(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static String removeV4(String str) {
        return str.replaceAll("^.|.$", "");
    }

    public static String removeV5(String str) {
        return new StringBuffer(str).deleteCharAt(str.length() - 1).deleteCharAt(0).toString();
    }

    /*
    DESCRIPTION:
    Consider an array/list of sheep where some sheep may be missing from their place.
    We need a function that counts the number of sheep present in the array (true means present).
    For example,

    [true,  true,  true,  false,
      true,  true,  true,  true ,
      true,  false, true,  false,
      true,  false, false, true ,
      true,  true,  true,  true ,
      false, false, true,  true]
    The correct answer would be 17.

    Hint: Don't forget to check for bad values like null/undefined
    */

    public int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (Boolean sheep : arrayOfSheeps) {
            if (sheep != null) {
                if (sheep) counter++;
            }
        }
        return counter;
    }

 /*
    DESCRIPTION:
    Write a function that removes the spaces from the string, then return the resultant string.

    Examples:

    Input -> Output
    "8 j 8   mBliB8g  imjB8B8  jl  B" -> "8j8mBliB8gimjB8B8jlB"
    "8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd" -> "88Bifk8hB8BB8BBBB888chl8BhBfd"
    "8aaaaa dddd r     " -> "8aaaaaddddr"
    */

    public static String noSpace(final String x) {
        return x.trim().replace(" ", "");
    }

    /*
    DESCRIPTION:
    Complete the solution so that it reverses the string passed into it.

    'world'  =>  'dlrow'
    'word'   =>  'drow'
    */

    public static String solution(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static String solution2(String str) {
        String res = "";
        for (int i = 1; i <= str.length(); i++) {
            res += str.charAt(str.length() - i);
        }
        return res;
    }

    /*
    DESCRIPTION:
        Your task is to create a function that does four basic mathematical operations.

        The function should take three arguments - operation(string/char), value1(number), value2(number).
        The function should return result of numbers after applying the chosen operation.

        Examples(Operator, value1, value2) --> output
        ('+', 4, 7) --> 11
        ('-', 15, 18) --> -3
        ('*', 5, 5) --> 25
        ('/', 49, 7) --> 7
        */

    public static Integer basicMath(String op, int v1, int v2) {
        switch (op) {
            case "+":
                return v1 + v2;
            case "-":
                return v1 - v2;
            case "*":
                return v1 * v2;
            case "/":
                return v1 / v2;
            default:
                return 0;
        }
    }

    /*
    DESCRIPTION:
    Jenny has written a function that returns a greeting for a user. However, she's in love with Johnny,
     and would like to greet him slightly different. She added a special case to her function, but she made a mistake.

    Can you help her?
    */

    public static String greet(String name) {
        if (name.equals("Johnny")) {
            return "Hello, my love!";
        } else
            return String.format("Hello, %s!", name);

    }

    /*
    DESCRIPTION:
        Summation
        Write a program that finds the summation of every number from 1 to num. The number will always be a positive
         integer greater than 0. Your function only needs to return the result, what is shown between parentheses
          in the example below is how you reach that result and it's not part of it, see the sample tests.

        For example (Input -> Output):

        2 -> 3 (1 + 2)
        8 -> 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)
        */
    public static int summation(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }


}