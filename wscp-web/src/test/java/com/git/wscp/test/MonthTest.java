package com.git.wscp.test;

/**
 * User: wzb
 * Date: 2018/7/15
 * Time: 22:09
 * Version: 1.0
 * Description:
 */
public class MonthTest {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 3 == 0 ) {
                System.out.println("====" + ints[i]);
            }
        }
    }
}
