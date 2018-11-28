package com.company.stack;

import java.util.EmptyStackException;

public class MyStack<T> {

    // создание стека
    private static class StackNode<T> {

        private T item;
        private StackNode<T> next;

        public StackNode(T item) {
            this.item = item;
        }
    }

    private StackNode<T> top;

    // добавление элемента на вершину стека
    public void push(T item){
        StackNode<T> node = new StackNode<>(item);

        node.next = top;
        top = node;
    }

    // удаление элемента с вершины стека
    public T pop(){
        if (top == null) {
            throw new EmptyStackException();
        }

        T item = top.item;
        top = top.next;
        return item;
    }

    // чтение элемента с вершины стека
    public T peek(){
        if (top == null) {
            throw new EmptyStackException();
        }

        return top.item;
    }

    public boolean isEmpty(){
        return top == null;
    }


}
