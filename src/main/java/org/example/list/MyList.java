package org.example.list;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

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
        getElementsFromIndex(0);
    }

    public void getElementsFromIndex(int index) {
        if (isEmpty()) {
            return;
        }
        if (index >= size || index < 0) {
            throw new IllegalArgumentException("Неккоректный индекс");
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println(current);
        while (current.next != null) {
            System.out.println(current.next);
            current = current.next;
        }
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
