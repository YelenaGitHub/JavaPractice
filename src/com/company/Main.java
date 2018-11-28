package com.company;

import com.company.lists.ListExercise;
import com.company.lists.ListReverse;
import com.company.queue.MyQueue;
import com.company.sorts.hash.HashSort;
import com.company.sorts.merge.MergeSort;
import com.company.stack.MyStack;
import com.company.string.UniqueString;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static com.company.utils.ListUtils.printArrayList;

public class Main {

    public static void main(String[] args) {
        //testFindKElement(3);
        //testStackCreation();
        //testQueueCreation();
        //testUniqueString();
        //MoneyChange.solve(10);
        //hashJoin();
        //mergeJoin();
        reverseLinkedList();
    }

    private static void reverseLinkedList(){
/*
        ListNode<Integer> firstNode = new ListNode<>(1);
        ListNode<Integer> secondNode = new ListNode<>(2);
        ListNode<Integer> thirdNode = new ListNode<>(3);

        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);

        ListReverse list = new ListReverse();
        list.reverse(firstNode);
*/
        List<Integer> arrayList = Arrays.asList(1,2,3,4,5,6);

        System.out.println("Before reversing");
        printArrayList(arrayList);

        ListReverse<String> listReverse = new ListReverse<>();
        List<?> list = listReverse.reverse(arrayList);

        System.out.println("After reversing");
        printArrayList(list);
    }

    private static void hashJoin(){

        int[] arr1 = {10, 2, 5, 7};
        int[] arr2 = {12, 7, 2, 10, 1};
        HashSort myHashSort = new HashSort();
        myHashSort.sortArr(arr1, arr2);

    }

    private static void mergeJoin(){

        int[] arr1 = {10, 2, 5, 7};
        int[] arr2 = {12, 7, 2, 10, 1};
        MergeSort myMergeSort = new MergeSort();
        myMergeSort.sortArr(arr1, arr2);

    }

    private static void testUniqueString() {
        String s = "alkjsdf";
        UniqueString.isUniqueChars(s);
    }

    private static void testQueueCreation(){
        MyQueue<String> queue = new MyQueue<>();

        System.out.println("Добавление элемента в очередь");
        queue.add("a");
        System.out.println("Очередь пустая - " + queue.isEmpty());

        System.out.println("Чтение элемента из очереди:" + queue.peek());

        System.out.println("Добавить еще один элемент в очередь");
        queue.add("b");
        System.out.println("Чтение элемента b из очереди:" + queue.peek());
    }

    private static void testFindKElement(int k){
        System.out.println("Поиск k-элемента с конца однонаправленного списка");
        LinkedList<String> list = new LinkedList<>(Arrays.asList("a", "b", "c", "d", "e", "f"));
        String kElem = ListExercise.findKElem2(list, k);
    }

    private static void testStackCreation(){
        System.out.println("Проверка реализации стека");
        MyStack<String> stack = new MyStack<>();
        System.out.println("Stack is empty: " + stack.isEmpty());
        //assert (stack.isEmpty() == true);

        String item = "A";
        System.out.println("Добавлен новый элемент на вершину " + item);
        stack.push(item);
        System.out.println("Чтение элемента с вершина стека");
        System.out.println("Верхний элемент: " + stack.peek());

        item = "B";
        System.out.println("Добавление еще одного элемента на вершину " + item);
        stack.push(item);
        System.out.println("Верхний элемент сейчас: " + stack.peek());

        System.out.println("Удаление элементов из стека");
        while (!stack.isEmpty()) {
            stack.pop();
        }

        System.out.println("Stack is empty: " + stack.isEmpty());

        System.out.printf("Попытка прочитать из пустого стека: " + stack.pop());
    }

    private static int test(String i) {
        // вернуть порядковый номер для заполнения битового вектора
        return i.toLowerCase().charAt(0) - 'a';
    }



}
