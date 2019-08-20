import linkedlist.LinkedList;
import linkedlist.SimpleListLinkImpl;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> sLL1 = new SimpleListLinkImpl();
        System.out.println("sLL1: " + sLL1.display());
        System.out.println("add Items to LL");
        for (int i = 0; i < 10; i++) {
            sLL1.insertLeft(i);
        }
/*
        System.out.println("sLL1: " + sLL1.display());

        System.out.println("====Test contains Method====");
        System.out.println("Contains 0: " + sLL1.contains(0));
        System.out.println("Contains 1: " + sLL1.contains(1));
        System.out.println("Contains 5: " + sLL1.contains(5));
        System.out.println("Contains 8: " + sLL1.contains(8));
        System.out.println("Contains 9: " + sLL1.contains(9));
        System.out.println("Contains 10: " + sLL1.contains(10));
        System.out.println();


        System.out.println("====Test removeLeft Method====");
        System.out.println("sLL1 before remove: " + sLL1.display());
        System.out.println("removeLeft: " + sLL1.removeLeft());
        System.out.println("sLL1: " + sLL1.display());
        System.out.println("removeLeft: " + sLL1.removeLeft());
        System.out.println("sLL1: " + sLL1.display());
        System.out.println("removeLeft: " + sLL1.removeLeft());
        System.out.println("sLL1: " + sLL1.display());
        System.out.println("removeLeft: " + sLL1.removeLeft());
        System.out.println("sLL1: " + sLL1.display());
        System.out.println("removeLeft: " + sLL1.removeLeft());
        System.out.println("sLL1: " + sLL1.display());
        System.out.println("removeLeft: " + sLL1.removeLeft());
        System.out.println("sLL1: " + sLL1.display());
        System.out.println("removeLeft: " + sLL1.removeLeft());
        System.out.println("sLL1: " + sLL1.display());
        System.out.println("removeLeft: " + sLL1.removeLeft());
        System.out.println("sLL1: " + sLL1.display());
        System.out.println("removeLeft: " + sLL1.removeLeft());
        System.out.println("sLL1: " + sLL1.display());
        System.out.println("removeLeft: " + sLL1.removeLeft());
        System.out.println("sLL1: " + sLL1.display());
        System.out.println("removeLeft: " + sLL1.removeLeft());
        System.out.println("sLL1: " + sLL1.display());
        System.out.println();
*/

        System.out.println("====Test remove Method====");
        System.out.println("sLL1 before remove: " + sLL1.display());
        System.out.println("remove 6: " + sLL1.remove(6));
        System.out.println("sLL1: " + sLL1.display());
        System.out.println("remove 5: " + sLL1.remove(5));
        System.out.println("sLL1: " + sLL1.display());
        System.out.println("remove 4: " + sLL1.remove(4));
        System.out.println("sLL1: " + sLL1.display());
        System.out.println("remove 3: " + sLL1.remove(3));
        System.out.println("sLL1: " + sLL1.display());
        System.out.println("remove 2: " + sLL1.remove(2));
        System.out.println("sLL1: " + sLL1.display());

        System.out.println("remove 1: " + sLL1.remove(1));
        System.out.println("sLL1: " + sLL1.display());

        System.out.println("remove 0: " + sLL1.remove(0));
        System.out.println("sLL1: " + sLL1.display());

        System.out.println("remove 8: " + sLL1.remove(8));
        System.out.println("sLL1: " + sLL1.display());

        System.out.println("remove 9: " + sLL1.remove(9));
        System.out.println("sLL1: " + sLL1.display());

    }

}
