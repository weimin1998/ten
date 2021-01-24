package com.weimin;

import java.util.Arrays;

/**
 * 八皇后问题
 */
public class Eight {

    public static void main(String[] args) {
        put(0);
    }

    private static int max = 8;
    static int[] array = new int[max];

    // 当摆放第n个皇后的时候，和前面以摆好的比较，看是否合适
    private static boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            // 判断在同一列  或者 同一斜线
            if (array[n] == array[i] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
    }

    private static void put(int n) {
        if (n == 8) {
            System.out.println(Arrays.toString(array));
        } else {
            for (int i = 0; i < max; i++) {
                array[n] = i;
                if (judge(n)) {
                    put(n + 1);
                }
            }
        }

    }
}
