package Cap11.dataStructures.jukebox7.TestTree;

import java.util.*;

public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    public void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix you Body");
        Book b3 = new Book("Finding Emo");

        Set<Book> tree = new TreeSet<>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);

        System.out.println(tree);
    }
}

class Book implements Comparable<Book>{
    private String title;

    public Book (String t) {
        title = t;
    }

    public int compareTo(Book b) {
        return title.compareTo(b.title);
    }

    public String toString() {
        return title;
    }
}