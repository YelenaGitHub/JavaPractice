package com.company.sorts.hash;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSort {

    // сортировка hash
    public Integer[] sortArr(int[] arr1, int[] arr2){
        int arr1Size =  arr1.length;
        int arr2Size =  arr2.length;
        ArrayList<Integer> arrayList = new ArrayList<>();

        int iResultArrayIndex = 0;
        int searchingValue;

        HashSet<Integer> hashSet = new HashSet<>();

        // get minimum arr and walk through it
        for (int i = 0; i < arr1Size; i++){
            hashSet.add(arr1[i]);
        }

        for (int i = 0; i < arr2Size; i++){
            searchingValue = arr2[i];
            if (hashSet.contains(searchingValue)){
                arrayList.add(searchingValue);
            }
        }

        return (Integer[]) arrayList.toArray();
    }
}
