package com.company.utils;

import java.util.List;

public class ListUtils {

    public static void printArrayList(List<?> list){
        System.out.println("List size " + list.size());
        list.forEach(System.out::println);
    }
}
