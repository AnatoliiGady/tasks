package org.example.list;

public class MyList<E> {

    private int size = 0;

    private Node<E> head;

    public int getSize() {
        return size;
    }

    public void add(E value) {
        if (value != null) {
            Node<E> newNode = new Node<>(value, null);
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

    public void addFromIndex(E value, int index) {
        if (isEmpty()) {
            return;
        }
        if (head == null) {
            return;
        }
        if (index > size || index < 0) {
            throw new IllegalArgumentException("Неккоректный индекс!");
        }
        Node<E> current = head;
        if (index > 1) {
            Node<E> newNode = new Node<>(value, null);
            for (int i = 1; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        } else {
            head = new Node<>(value, head);
        }
        size++;
    }

    public void print() {
        printElementsFromIndex(0);
    }

    public void printElementsFromIndex(int index) {
        if (isEmpty()) {
            return;
        }
        if (index >= size || index < 0) {
            throw new IllegalArgumentException("Введен неккоректный индекс");
        }
        Node<E> current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        System.out.print(current + " ");
        while (current.next != null) {
            System.out.print(current.next + " ");
            current = current.next;
        }
    }

    public void revers() {
        if (isEmpty()) {
            return;
        }
        Node<E> previous = null;
        Node<E> current = head;
        while (current != null) {
            Node<E> next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public static class Node<E> {
        E value;
        Node<E> next;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }
}
