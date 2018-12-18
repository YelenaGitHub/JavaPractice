package com.company.lists;

import com.company.utils.ListNode;
import com.sun.istack.internal.NotNull;

import java.util.List;
import java.util.ListIterator;

public class ListReverse<T> {

    // Reverse a list in one iteration
    // ! fixme check that method
    @Deprecated
    public ListNode<T> reverse(ListNode<T> list) {
        ListNode<T> current = list;
        ListNode<T> nextNode = null;
        ListNode<T> prevNode = null;

        if (current == null || !current.hasNext()) {
            return current;
        }

        while (current != null && current.hasNext()) {
            nextNode = current.getNext();
            current.setNext(prevNode);
            prevNode = current;
            current = nextNode;
        }

        return prevNode;
    }

    // Reverse a list in one iteration (original way).
    // Changes elements in the head and tail of a list
    public static List<?> reverse(@NotNull List<?> list){

        int size = list.size();

        ListIterator startListIterator = list.listIterator();
        ListIterator endListIterator = list.listIterator(size);
        Object tmp;

        for (int i = 0, mid = size >> 1; i < mid; i++){
            tmp = startListIterator.next();

            startListIterator.set(endListIterator.previous());
            endListIterator.set(tmp);
        }
        return list;
    }

}
