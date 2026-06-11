package problems.p0007_reverse_integer;


class Solution {
    public static int reverse(int x) {
        if (x == 0 || x == Integer.MIN_VALUE) return 0;

        int number = Math.abs(x);
        String temp = "";

        while (number > 0) {
            temp += number % 10;

            number /= 10;
        }


        if (Long.parseLong(temp) > Integer.MAX_VALUE) return 0;
        if (x < 0) return Integer.parseInt(temp) * -1;

        return Integer.parseInt(temp);
    }
}