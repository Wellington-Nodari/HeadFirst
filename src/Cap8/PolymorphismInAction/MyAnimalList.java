package Cap8.PolymorphismInAction;

import Cap8.TestCap8.Animal;

public class MyAnimalList {

    private Animal[] animals = new Animal[5];
    private int nextIndex = 0;

    public void add (Animal a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Animal added at " + nextIndex);
            nextIndex ++;
        }
    }

}
