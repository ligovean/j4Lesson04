import linkedlist.LinkedList;
import linkedlist.LinkedListImpl;

import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {

        System.out.println("=======================");
        LinkedList<Integer> myLnkLst = new LinkedListImpl<Integer>();

        for (int i = 1; i < 5; i++) {
            myLnkLst.insertLast(i);
        }
        Iterator<Integer> myLnkdIterator = myLnkLst.iterator();
        while (myLnkdIterator.hasNext()){
            System.out.println(myLnkdIterator.next());
        }

        Iterator<Integer> myLnkdIterator2 = myLnkLst.iterator();
        //myLnkdIterator2.insertAfter
        System.out.println();

    }
}
