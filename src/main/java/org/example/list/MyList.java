package org.example.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyList<E> implements Iterable<E> {

    private int size = 0;

    private Node<E> head;

    public int getSize() {
        return size;
    }

    public void add(E value) {
        if (value != null) {
            Node<E> newNode = new Node<>();
            newNode.value = value;
            if (isEmpty()) {
                head = newNode;
            } else {
                Node<E> tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = newNode;
            }
            size++;
        }
    }

    public void print() {
        while (head.next != null) {
            System.out.println(head);
            head = head.next;
        }
        System.out.println(head);
    }

    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                E value = current.value;
                current = current.next;
                return value;
            }
        };
    }

    public static class Node<E> {
        E value;
        Node<E> next;

        @Override
        public String toString() {
            return value.toString();
        }
    }
}
