package com.company.lists;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListExercise {

    // поиск k-элемента с конца однонаправленного списка
    public static String findKElem(LinkedList<String> list, int k){

        String lastItem = null;
        int i = 1;
        int iCurrent = list.size() - k + 1;

        for (String l: list){
            lastItem = l;
            if (i == iCurrent) {
                break;
            }
            System.out.println("The current element is " + lastItem);
            i++;
        }
        System.out.println("The result: " + lastItem);
        return lastItem;
    }

    public static String findKElem2(LinkedList<String> list, int k) {
        // Предположим, что не можем вычислить длину списка, поэтому используется итеративный алгоритм поиска k-го элемента
        String errorMsg = "Element not found (probably the list is small and doesn't have such element)";
        ListIterator<String> listFirstIterator = list.listIterator();
        ListIterator<String> listSecondIterator = list.listIterator();

        String firstElem = null;
        int firstIter = 0;
        int secondIter = 0;

        // сделаем разницу между 2-мя итераторами в k-элементов
        while (listFirstIterator.hasNext()) {
            firstElem = listFirstIterator.next();

            while (listSecondIterator.hasNext() && firstIter == 0 && secondIter < k) {
                listSecondIterator.next();
                secondIter++;
            }

            if (!listSecondIterator.hasNext()){
                System.out.println("The result value is " + firstElem);

                return firstElem;
            } else {
                listSecondIterator.next();
                secondIter++;
            }

            firstIter++;
        }

        return errorMsg;
    }


    public static void test() {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            listIterator.next();
        }

    }
/*
    // поиск через рекурсию k-го элемента в однонаправленном списке
    public static String findKElemRecursion(List<String> list, int k){
        String result;

        if (list.isEmpty()){
            return "Empty list";
        }

        //String[] arr = new String[k];
        for (String l: list) {

        }

        if (list.size() == k) {
            return ;
        }

    }
*/
}
