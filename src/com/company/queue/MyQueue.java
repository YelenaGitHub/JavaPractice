package com.company.queue;

import java.util.EmptyStackException;

public class MyQueue<T> {

    // реализация очереди (FIFO), первым пришел, первый ушел

    private static class QueueNode<T> {

        private T data;
        private QueueNode<T> next;

        public QueueNode(T data){
            this.data = data;
        }

    }

    private QueueNode<T> first;
    private QueueNode<T> last;

    // добавление нового элемента в очередь
    public void add(T item){
        QueueNode<T> node = new QueueNode<>(item);

        if (first == null) {
            first = node;
        } else {
          node.next = first;
          first = node;
        }

        if (last == null) {
            last = node;
        }

    }

    // чтение первого элемента из очереди
    public T peek(){
        if (first == null) {
            throw new EmptyStackException();
        }
        return first.data;
    }

    // удаление первого элемента из очереди
    public T remove(){
        if (first == null) {
            throw new EmptyStackException();
        }

        QueueNode<T> node = first;
        first = first.next;

        return node.data;
    }

    // проверка, что очередь пустая
    public boolean isEmpty(){
        return (first == null && last == null);
    }

}
