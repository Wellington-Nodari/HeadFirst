package Cap11.dataStructures.backToGenerics;

import java.util.List;

public class TestGenerics2 {
    public static void main(String [] args) {
        new TestGenerics2().go();
    }

    public void go() {
        List<Animal> animals = List.of(new Dog(), new Cat(), new Dog());
        takeAnimals(animals);

        List<Dog> dogs = List.of(new Dog(), new Dog());
        takeAnimals(dogs);
    }

    public static void takeAnimals(List<? extends Animal> animals) {
//        animals.add(new Dog()); // >>> this (adding anything) won't be allowed by the compiler when using wildcards <?>
        for (Animal a : animals) {
            a.eat();
        }
    }
}