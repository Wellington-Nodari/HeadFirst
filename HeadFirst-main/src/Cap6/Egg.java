package Cap6;

import java.util.ArrayList;

public class Egg {
    public static void main (String [] args) {
        Egg egg1 = new Egg();
        Egg egg2 = new Egg();

        // make the list with type Egg
        ArrayList<Egg> myList = new ArrayList<Egg>();

        // Add objects of Egg type in it
        myList.add(egg1);
        myList.add(egg2);

        // Find out how many things are in it
        int theSize = myList.size();
        System.out.println(theSize);

        // Find out if the list contains something
        boolean isIn = myList.contains(egg1);
        System.out.println("Is the egg1 in the list? " + isIn);

        // Find out where something is (eg. its index)
        int idx = myList.indexOf(egg2);
        System.out.println(idx);

        // Find out if it's empty
        boolean empty = myList.isEmpty();
        System.out.println(empty);

        // Remove something from List
        myList.remove(egg1);

        isIn = myList.contains(egg1);
        System.out.println("Is the egg1 in the list? " + isIn);

    }
}
