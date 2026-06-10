package problems.p0012_integer_to_roman;

class Solution {
    public static String intToRoman(int num) {
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] letters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int number = num;
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (number > 0) {
            while (number >= numbers[i]) {
                number -= numbers[i];
                result.append(letters[i]);
            }
            i++;
        }

        return result.toString();
    }
}