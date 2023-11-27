package Cap11.dataStructures.reverse_engineer;

import java.util.*;

public class SortMountains {
    public static void main(String[] args) {
        new SortMountains().go();
    }

    public void go() {
        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("Longs", 14255));
        mountains.add(new Mountain("Elbert",14433));
        mountains.add(new Mountain("Marron",14156));
        mountains.add(new Mountain("Castle",14265));
        System.out.println("as entered: \n" + mountains);

        mountains.sort((a, b) -> a.name.compareTo(b.name));
        System.out.println("by name:\n" + mountains);

        mountains.sort((a, b) -> b.height - a.height);
        System.out.println("by height:\n" + mountains);
    }
}

class Mountain {
     String name;
     int height;

    Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String toString() {
        return name + " " + height;
    }
}
