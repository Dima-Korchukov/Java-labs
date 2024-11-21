import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * Class LinkedListFlowerCollection implements a singly linked list for Flower objects,
 * and implements the List interface.
 */
public class LinkedListFlowerCollection implements List<Flower> {
    
    private Node head; // First element of the list
    private int size;  // Size of the list

    // Node class representing each element in the linked list
    private class Node {
        Flower data;
        Node next;

        Node(Flower data) {
            this.data = data;
            this.next = null;
        }
    }

    // Empty constructor
    public LinkedListFlowerCollection() {
        head = null;
        size = 0;
    }

    // Constructor with a single Flower object
    public LinkedListFlowerCollection(Flower flower) {
        this();
        add(flower);
    }

    // Constructor with a collection of Flower objects
    public LinkedListFlowerCollection(Collection<? extends Flower> flowers) {
        this();
        addAll(flowers);
    }

    // Method to get the size of the list
    @Override
    public int size() {
        return size;
    }

    // Method to check if the list is empty
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to add a Flower to the list
    @Override
    public boolean add(Flower flower) {
        if (head == null) {
            head = new Node(flower);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(flower);
        }
        size++;
        return true;
    }

    // Method to get a Flower by its index
    @Override
    public Flower get(int index) {
        checkIndex(index);
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Helper method to check if an index is valid
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }

    // Method to remove a Flower at a specific index
    @Override
    public Flower remove(int index) {
        checkIndex(index);
        Node current = head;
        if (index == 0) {
            head = head.next;
        } else {
            Node prev = null;
            for (int i = 0; i < index; i++) {
                prev = current;
                current = current.next;
            }
            prev.next = current.next;
        }
        size--;
        return current.data;
    }

    // Method to clear the list
    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    // Additional methods from List interface
    @Override
    public boolean contains(Object o) {
        for (Node current = head; current != null; current = current.next) {
            if (current.data.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Flower> iterator() {
        return new Iterator<Flower>() {
            private Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Flower next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Flower data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    @Override
    public ListIterator<Flower> listIterator() {
        throw new UnsupportedOperationException("ListIterator not supported");
    }

    @Override
    public ListIterator<Flower> listIterator(int index) {
        throw new UnsupportedOperationException("ListIterator not supported");
    }

    @Override
    public boolean addAll(Collection<? extends Flower> c) {
        for (Flower flower : c) {
            add(flower);
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Remove by object not supported");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object item : c) {
            if (!contains(item)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Flower> c) {
        throw new UnsupportedOperationException("Add all at index not supported");
    }

    @Override
    public Flower set(int index, Flower element) {
        throw new UnsupportedOperationException("Set not supported");
    }

    @Override
    public void add(int index, Flower element) {
        throw new UnsupportedOperationException("Add at index not supported");
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Index of not supported");
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Last index of not supported");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Retain all not supported");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Remove all not supported");
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("To array not supported");
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("To array not supported");
    }

    @Override
    public List<Flower> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Sublist not supported");
    }
}
