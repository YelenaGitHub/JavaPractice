package com.company.stack;

import java.util.EmptyStackException;

public class MyStack2<T> {

    private static class StackNode<T> {

        private T item;
        private StackNode<T> next;

        public StackNode (T item) {
            this.item = item;
        }
    }

    private StackNode<T> top;

    // добавление нового элемента на вершину
    public void push (T item) {
        StackNode<T> node = new StackNode<>(item);

        node.next = top;
        top = node;
    }

    // чтение элемента с вершины стека
    public T peek(){
        if (top == null) {
            throw new EmptyStackException();
        }

        return top.item;
    }

    // удаление с вершины стека
    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }

        T item = top.item;
        top = top.next;

        //StackNode<T> node = top;
        //top.next = node;

        return item;

    }

    // проверка пустой ли стек
    public boolean isEmpty() {
        return top == null;
    }


}
