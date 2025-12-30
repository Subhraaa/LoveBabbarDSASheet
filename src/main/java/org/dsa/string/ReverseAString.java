package org.dsa.string;

public class ReverseAString {


    //1-  Using backward traversal – > O(n) Time and O(n) Space
    //The idea is to start at the last character of the string and move backward, appending each character to a new string res. This new string res will contain the characters of the original string in reverse order.
    public static String reverseString(String input){
        StringBuilder returnString = new StringBuilder();

        for(int i = input.length()-1; i>=0; i--){
            returnString.append(input.charAt(i));
        }

        return returnString.toString();
    }


    //2- Using Two Pointers -> O(n) Time and O(1) Space
    //The idea is to maintain two pointers: left and right, such that left points to the beginning of the string and right points to the end of the string.
    //
    //While left pointer is less than the right pointer, swap the characters at these two positions.
    // After each swap, increment the left pointer and decrement the right pointer to move towards the center of the string.
    // This will swap all the characters in the first half with their corresponding character in the second half.
    public static String TwoPointerApproach(String input){
        int left = 0;
        int right = input.length() -1;
        while(left<right){
//        char temp = input.charAt(left);
//        input.charAt()
        }

        return "";
    }


    public static void main(String[] args) {
    String input = "somethingtotest";
    String reversed = reverseString(input);
    System.out.println(reversed);

    }
}
