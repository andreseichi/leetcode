package problems.p13_roman_to_integer;

class Solution {
    public static int romanToInt(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int rawValue = getRawValue(c);

            if ( i + 1 < s.length() &&  rawValue < getRawValue(s.charAt(i + 1))) {
                sum -= rawValue;
            } else {
                sum += rawValue;
            }
        }

        return sum;
    }

    private static int getRawValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}