package katas;

// https://www.codewars.com/kata/5d68d05e7a60ba002b0053f6
/*
Given an array arr (numbers of days of absence for each employee) and a number s (total bonus) the function bonus(arr, s) will follow John's way and return an array of the fair bonuses of all employees in the same order as their numbers of days of absences.

s and all elements of arr are positive integers.

Examples:
bonus([18, 15, 12], 851) -> [230, 276, 345]

bonus([30, 27, 8, 14, 7], 34067) -> [2772, 3080, 10395, 5940, 1188
 */
public class Bonuses {
    public static int[] bonuses(int[] days, int value) {
        double[][] arr = new double[days.length][days.length];

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days.length; j++) {
                arr[i][j] = Math.abs((double) days[i] / (double) days[j]);

            }
        }
        // sum of all rows:
        double[] mult = new double[days.length];
        double multiplier = 0;
        int index = 0;
        for (double[] num : arr) {
            for (double num2 : num) {
                multiplier += num2;
            }
            mult[index] = multiplier;
            multiplier = 0;
            index++;
        }
        index = 0;
        int[] result = new int[mult.length];
        for (double num : mult) {
            result[index] = (int) (value / num);
            index++;
        }
        return result;
    }
}
