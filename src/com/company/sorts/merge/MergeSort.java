package com.company.sorts.merge;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    // сортировка merge join
    public Integer[] sortArr(int[] arr1, int[] arr2){
        int[] arrSmall, arrLarge;

        if (arr1.length <= arr2.length){
            arrSmall = arr1;
            arrLarge = arr2;
        } else {
            arrSmall = arr2;
            arrLarge = arr1;
        }

        Arrays.sort(arrSmall);
        ArrayList resultList = new ArrayList<>();

        for (int i = 0; i < arrLarge.length; i++) {
            if (Arrays.binarySearch(arrSmall, arrLarge[i]) >= 0) {
                resultList.add(arrLarge[i]);
            }
        }

        return (Integer[]) resultList.toArray();


    }

}
