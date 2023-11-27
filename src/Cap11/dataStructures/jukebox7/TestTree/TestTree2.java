package Cap11.dataStructures.jukebox7.TestTree;

import java.util.*;

public class TestTree2 {
    public static void main(String[] args) {
        new TestTree().go();
    }

    public void go() {
        Book2 b1 = new Book2("How Cats Work");
        Book2 b2 = new Book2("Remix you Body");
        Book2 b3 = new Book2("Finding Emo");

//        Using LAMBDA
        Set<Book2> tree = new TreeSet<>((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);

        System.out.println(tree);
    }
}

class Book2 {
    private String title;

    public Book2 (String t) {
        title = t;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return title;
    }
}
