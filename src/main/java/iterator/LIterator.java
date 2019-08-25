package iterator;

import java.util.Iterator;

public interface LIterator<E> extends Iterator<E> {

    void reset();

    void insertBefore(E value);

    void insertAfter(E value);
}
