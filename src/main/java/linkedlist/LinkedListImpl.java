package linkedlist;

import java.util.Iterator;

public class LinkedListImpl<E> implements LinkedList<E> {

    private Node<E> firstElement;
    private int size;
    private Node<E> lastElement;


    @Override
    public void insertFirst(E val) {
        Node<E> node = new Node<>(val);
        node.next = firstElement;
        firstElement = node;
        size++;
        if (size == 1) lastElement = firstElement;
    }

    @Override
    public void insertLast(E val) {
        Node<E> node = new Node<>(val);

        if (isEmpty()) firstElement = node;
        else lastElement.next = node;

        lastElement = node;
        size++;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()){
            lastElement = null;
            return null;
        }

        E val = firstElement.val;
        firstElement = firstElement.next;

        size--;

        return val;
    }

    @Override
    public E removeLast() {
        if (isEmpty()){
            firstElement = null;
            return null;
        }

        E val = lastElement.val;
        remove(val);
        return val;
    }

    @Override
    public boolean remove(E val) {
        Node<E> previous = null;
        Node<E> current = firstElement;
        while (current != null) {
            if (current.val.equals(val))
                break;

            previous = current;
            current = current.next;
        }

        if (current == null)
            return false;

        else if (current == firstElement && current == lastElement) {
            firstElement = null;
            lastElement = null;
        }

        else if (current == firstElement)
            firstElement = current.next;

        else if (current == lastElement) {
            lastElement = previous;
            lastElement.next = null;
        }

        else
            previous.next = current.next;

        size--;

        return true;
    }

    @Override
    public boolean contains(E val) {
        Node<E> current = firstElement;
        while (current != null) {
            if (current.val.equals(val))
                return true;

            current = current.next;
        }
        return false;
    }

    @Override
    public String display() {
        String result;
        Node<E> curElememt = this.firstElement;
        if (curElememt!=null) result = "{" + curElememt.val;
        else {
            return "Linked List is Empty.";
        }
        while (curElememt != null) {
            curElememt = curElememt.next;
            if (curElememt != null) result += "," + curElememt.val;
        }
        return result + "}";
    }

    @Override
    public Node<E> getFirst() {
        return firstElement;
    }

    @Override
    public E getFirstValue() {
        return firstElement != null ? firstElement.val : null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return firstElement == null;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
