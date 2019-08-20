package linkedlist;

public class SimpleListLinkImpl<E> implements LinkedList<E> {

    private Node<E> firstNode;
    private int size;

    @Override
    public void insertLeft(E val) {
        Node<E> node = new Node<>(val);
        node.next = this.firstNode;
        node.previous = null;

        if (node.next != null) node.next.previous = node;
        this.firstNode = node;

        this.size++;
    }

    @Override
    public E removeLeft() {
        if (isEmpty()) return null;
        E result = this.firstNode.val;
        this.firstNode = firstNode.next;
        if (this.firstNode != null) this.firstNode.previous = null;
        this.size--;
        return result;
    }

    @Override
    public boolean remove(E val) {

        Node<E> curNode = this.firstNode;
        Node<E> node4remove = null;
        while (curNode != null) {
            if (curNode.val.equals(val)){
                node4remove = curNode;
                break;
            }
            curNode = curNode.next;
        }

        if (node4remove == null) return false;

        if (node4remove == this.firstNode) this.firstNode = node4remove.next;

        if (node4remove.next != null) node4remove.next.previous = node4remove.previous;

        if (node4remove.previous != null) node4remove.previous.next = node4remove.next;

        node4remove.next = null;
        node4remove.previous = null;

        this.size--;
        return true;
    }

    @Override
    public boolean contains(E val) {
        Node<E> curNode = this.firstNode;
        while (curNode != null) {
            if (curNode.val.equals(val)) return true;
            curNode = curNode.next;
        }
        return false;
    }

    @Override
    public String display() {
        String result;
        Node<E> curNode = this.firstNode;
        if (curNode!=null) result = "{" + curNode.val;
        else {
            return "Linked List is Empty.";
        }
        while (curNode != null) {
            curNode = curNode.next;
            if (curNode != null) result += "," + curNode.val;
        }
        return result + "}";
    }

    @Override
    public E getFirst() {
        return this.firstNode != null ?this.firstNode.val:null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.firstNode==null;
    }
}
