package linkedlist;

public interface LinkedList<E> extends Iterable<E> {

    void insertFirst(E value);
    void insertLast(E value);

    E removeFirst();
    E removeLast();

    boolean remove(E val);
    boolean contains(E val);
    String display();
    E getFirstValue();
    Node<E> getFirst();

    class Node<T>{
        public final T val;
        public Node<T> next;


        public Node(T val) {
            this.val = val;
        }
    }

    int size();
    boolean isEmpty();
}
