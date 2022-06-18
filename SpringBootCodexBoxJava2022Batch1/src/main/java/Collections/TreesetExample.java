package Collections;

import java.util.TreeSet;

public class TreesetExample {
    public void treeSet() {
        TreeSet<Character> treeset = new TreeSet<>();
        treeset.add('a');
        treeset.add('b');
        treeset.add('c');
        treeset.add('d');
        treeset.add('e');
        treeset.add('f');

        System.out.println(treeset);

        System.out.println();

        System.out.println("Printing all the elements: ");
        for (Character ele:treeset) {
            System.out.println(ele);
        }

        System.out.println();

        System.out.println("Printing first element: ");
        System.out.println(treeset.first());

        System.out.println();

        System.out.println("Printing last element: ");
        System.out.println(treeset.last());

        System.out.println();

        System.out.println("The subset: " + treeset.subSet('b', 'e'));

        System.out.println();

        System.out.println("The tailset: " + treeset.tailSet('b'));

        System.out.println();

        System.out.println("The pollfirst: " + treeset.pollFirst());

        System.out.println();

        System.out.println("The pollLast: " + treeset.pollLast());

    }
}
