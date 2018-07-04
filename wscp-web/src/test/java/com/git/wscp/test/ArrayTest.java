package com.git.wscp.test;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * User: wzb
 * Date: 2018/6/27
 * Time: 17:47
 * Version: 1.0
 * Description:
 */
public class ArrayTest {
    public static void main(String[] args) {

        int[] array = {11, 22, 33, 12, 4, 2, 5, 7, 8};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int s : array) {
            System.out.print(s + "\t");
        }
    }

}
