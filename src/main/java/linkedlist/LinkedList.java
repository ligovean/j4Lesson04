package linkedlist;

public interface LinkedList<E> {

    void insertLeft(E val);
    E removeLeft();
    boolean remove(E val);
    boolean contains(E val);
    String display();
    E getFirst();

    class Node<T>{
        final T val;
        Node<T> next;
        Node<T> previous;

        public Node(T val) {
            this.val = val;
        }
    }

    int size();
    boolean isEmpty();
}
