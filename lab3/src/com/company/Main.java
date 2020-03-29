package com.company;

public class Main {

    /*
    c3  becomes 0
    c13 becomes 13

    type StringBuilder
    В заданому тексті знайти підрядок максимальної довжини, що є паліндромом, тобто читається однаково зліва на право та з права на ліво.
     */

    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("Lorem ipsum dolor sit amet, consectetur adipiscing elit, abba sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        System.out.println(findBiggestPalindrome(new StringBuilder(string)));
    }

    static private StringBuilder findBiggestPalindrome(StringBuilder string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i != string.length(); ++i) {
            for (int j = string.length() - 1; j != i; --j) {
                if (string.charAt(i) == string.charAt(j)) {
                    StringBuilder potentialPalindrome = new StringBuilder(string.substring(i, j + 1));
                    if (potentialPalindrome.length() > result.length() && isPalindrome(potentialPalindrome)) {
                        result = potentialPalindrome;
                    }
                }
            }
        }
        return result;
    }

    static private boolean isPalindrome(StringBuilder string) {
        int size = string.length();
        StringBuilder   leftHalf = new StringBuilder(size / 2), // left part of the palindrome
                        rightHalf = new StringBuilder(size / 2); // right part of the palindrome
        leftHalf.insert(0, string.subSequence(0, size / 2));
        rightHalf.insert(0, string.subSequence(size / 2 + size % 2, string.length()));
        rightHalf.reverse(); // reversing right part to make easy to compare
        /*
        // Debug information;
        System.out.println("all: " + string);
        System.out.println("left : " + leftHalf + ", size: " + leftHalf.length());
        System.out.println("right: " + rightHalf + ", size: " + leftHalf.length());
         */
        return rightHalf.toString().equals(leftHalf.toString());
    }
}
