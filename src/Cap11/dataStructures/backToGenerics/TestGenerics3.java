package Cap11.dataStructures.backToGenerics;

import java.util.ArrayList;
import java.util.List;

public class TestGenerics3 {
    public static void main(String [] args) {
        new TestGenerics3().go();
    }

    public void go() {
        List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
        List<? extends Animal> vaccinatedAnimals = takeAnimals(animals);

        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<? extends Animal> vaccinatedDogs = takeAnimals(dogs);

        takeAnimals(new ArrayList<>());
    }

//    public <T extends Animal> List<T> takeAnimals(List<T> list) {
//        for (T a : list) {
//            a.eat();
//            a.giveClass();
//        } System.out.println(list + "\n"); return list;
//    }

    public List<? extends Animal> takeAnimals(List<? extends Animal> animals) {
//        animals.add(new Dog());
        for (Animal a : animals) {
            a.eat();
            a.giveClass();
        } System.out.println(animals + "\n"); return animals;
    }
}

