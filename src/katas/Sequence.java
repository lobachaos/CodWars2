package katas;
// https://www.codewars.com/kata/5254bd1357d59fbbe90001ec/train/java
/*
Have a look at the following numbers.

 n | score
---+-------
 1 |  50                       Can you find a pattern in it? If so, then write a function
 2 |  150
 3 |  300
 4 |  500
 5 |  750
 */

public class Sequence {
    public static long getScoreImp(long n) {
        long[] array = new long[(int) n];
        int pa = (int) ((n*(n+1))/2);
        array[0] = 50;
        if(n <= 1)
            return array[0];
        for(int i =1 ; i < array.length ; i++){
            array[i] = array[0] * pa ;
        }
        return array[(int) (n-1)];
    }
    public static long getScoreRefactor(long n) {
        return 25 * n * (n+1);
    }
    }
