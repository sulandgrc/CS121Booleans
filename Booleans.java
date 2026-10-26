/**
 * Name: <your name here>
 *
 * CS 121
 *
 * Core Topics: Methods that return boolean values, Boolean Zen
 */

public class Booleans {


    public static void main(String[] args) {

        System.out.println("isFactor(3,9) returns " + isFactor(3, 9));
        System.out.println("isFactor(3,10) returns " + isFactor(3, 10));
        System.out.println("isFactor(0,3) returns " + isFactor(0, 3));
        System.out.println();

        System.out.println("isEven(10) returns: " + isEven(10));
        System.out.println("isEven(-7) returns: " + isEven(-7));
        System.out.println();

        System.out.println("allSmallDigits(1234) returns " + allSmallDigits(1234));
        System.out.println("allSmallDigits(4) returns " + allSmallDigits(4));
        System.out.println();

        System.out.println("isReverse(\"hello\",\"olleh\") returns " + isReverse("hello", "olleh"));
        System.out.println("isReverse(\"cat\",\"dog\") returns " + isReverse("cat", "dog"));
        System.out.println();

        System.out.println("isOdd(12) returns: " + isOdd(12));
        System.out.println("isOdd(-15) returns: " + isOdd(-15));
    }


    /**
     * This method determines if x is a factor of y
     *
     * @param x number
     * @param y factor
     * @return true if x is a factor of y, false otherwise
     */
    public static boolean isFactor(int x, int y) {


        return false;
    }


    /**
     * This method determines if a number is even using Boolean Zen
     * e.g. isEven(10) --> true
     * e.g. isEven(-1) --> false
     *
     * @param num
     * @return returns true is num is even, false if it's odd
     */
    public static boolean isEven(int num) {

        return false;
    }


    /**
     * This method determines if all the digits are less than 5
     * e.g. allSmallDigits(1233) --> true
     * e.g. allSmallDigits(99) --> false
     * e.g. allSmallDigits(1190) --> false
     *
     * @param num
     * @return true if all digits are smaller than 5
     */
    public static boolean allSmallDigits(int num) {

        return true;
    }


    /**
     * This method determines if the strings are the same forwards and backwards
     * e.g. isReverse("hello","olleh") --> true
     * e.g. isReverse("cat","dog") --> false
     *
     * @param s1 text
     * @param s2 text
     * @return true if the strings are the reverse of each other
     */
    public static boolean isReverse(String s1, String s2) {

        return true;

    }

    /**
     * TODO:
     * This method determines if a number is odd using Boolean Zen
     * e.g. isOdd(11) --> true
     * e.g. isOdd(-2) --> false
     *
     * @param num
     * @return true is num is odd, false if it's even
     */
    public static boolean isOdd(int num) {
        return true;
    }
}

