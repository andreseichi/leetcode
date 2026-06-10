package problems.p0009_palindrome_number;

import java.util.ArrayList;

class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        int control = x;
        ArrayList<Integer> array = new ArrayList<>();

        while (Math.floor(control) != 0) {
            Integer digit = (int) Math.floor(control % 10);
            array.add(digit);
            control = control / 10;
        }

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != array.get(array.size() - 1 - i)) return false;
        }

        return true;
    }
}