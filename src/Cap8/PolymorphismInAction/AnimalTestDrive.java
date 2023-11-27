package Cap8.PolymorphismInAction;

import Cap8.TestCap8.*;

public class AnimalTestDrive {

    public static void main (String [] args) {
        MyAnimalList list = new MyAnimalList();

        Dog dog = new Dog();
        Cat cat = new Cat();

        list.add(dog);
        list.add(cat);

        if (dog.equals(cat)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        System.out.println(cat.getClass());
        System.out.println(cat.hashCode());
        System.out.println(cat.toString());
        System.out.println(dog.hashCode());
        System.out.println(dog.toString());
    }
}
