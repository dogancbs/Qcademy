package org.example.course.oop;

import java.util.Arrays;

public class LocalList<A> {
    private A[] speicher;
    private int size;

    public LocalList() {
        this.speicher = (A[]) new Object[10];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(speicher[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean add(A a) {
        if (size == speicher.length) {
            speicher = Arrays.copyOf(speicher, speicher.length * 2);
        }
        speicher[size++] = a;
        return true;
    }

    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(speicher[i])) {
                System.arraycopy(speicher, i + 1, speicher, i, size - i - 1);
                size--;
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(LocalList<A> ll) {
        for (int i = 0; i < ll.size(); i++) {
            if (!contains(ll.get(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean addAll(LocalList<A> ll) {
        for (int i = 0; i < ll.size(); i++) {
            add(ll.get(i));
        }
        return true;
    }

    public boolean addAll(int index, LocalList<A> ll) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        while (size + ll.size() > speicher.length) {
            speicher = Arrays.copyOf(speicher, speicher.length * 2);
        }

        System.arraycopy(speicher, index, speicher, index + ll.size(), size - index);

        for (int i = 0; i < ll.size(); i++) {
            speicher[index + i] = ll.get(i);
        }

        size += ll.size();
        return true;
    }

    public boolean removeAll(LocalList<A> ll) {
        boolean modified = false;
        for (int i = 0; i < ll.size(); i++) {
            modified |= remove(ll.get(i));
        }
        return modified;
    }

    public void clear() {
        Arrays.fill(speicher, null);
        size = 0;
    }

    public A get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return speicher[index];
    }

    public A remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        A removedElement = speicher[index];
        System.arraycopy(speicher, index + 1, speicher, index, size - index - 1);
        size--;
        return removedElement;
    }

    public LocalList<A> subList(int a, int b) {
        if (a < 0 || b > size || a > b) {
            throw new IndexOutOfBoundsException("Invalid range");
        }

        LocalList<A> subList = new LocalList<>();
        for (int i = a; i < b; i++) {
            subList.add(speicher[i]);
        }
        return subList;
    }

    public static void main(String[] args) {

        LocalList<Integer> myList = new LocalList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        System.out.println("Size: " + myList.size());
        System.out.println("Contains 2: " + myList.contains(2));

        LocalList<Integer> newList = new LocalList<>();
        newList.add(2);
        newList.add(3);

        System.out.println("Contains all: " + myList.containsAll(newList));

        myList.addAll(newList);
        System.out.println("After addAll: " + Arrays.toString(myList.speicher));

        myList.remove(2);
        System.out.println("After remove: " + Arrays.toString(myList.speicher));

        myList.clear();
        System.out.println("After clear: " + Arrays.toString(myList.speicher));
    }
}

