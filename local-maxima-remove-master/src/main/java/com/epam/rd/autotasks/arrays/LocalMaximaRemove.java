package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array) {

        //put your code here
        int len = array.length;
        int rlmArray[] = new int[len], counter = 0;

        int[] finalArray;
        if (len >= 1) {
            for (int i = 0; i < len; i++) {
                if (i == 0) {
                    if (array[i] <= array[i + 1]) {
                        rlmArray[counter] = array[i];
                        counter++;
                    }
                } else if (i == len - 1) {
                    if (array[i] <= array[i - 1]) {
                        rlmArray[counter] = array[i];
                        counter++;
                    }
                } else {
                    //if((array[i] <= array[i - 1] || array[i] == array[i - 1]) && (array[i] > array[i + 1] || array[i] == array[i + 1])){
                    if (array[i] <= array[i + 1] || array[i] <= array[i - 1]) {
                        rlmArray[counter] = array[i];
                        counter++;
                    }
                }
            }

            finalArray = new int[counter];

            for (int i = 0; i < counter; i++) {
                finalArray[i] = rlmArray[i];
            }
        } else {

            throw new UnsupportedOperationException();
        }
        return finalArray;
    }
}
