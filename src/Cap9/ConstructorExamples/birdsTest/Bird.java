package Cap9.ConstructorExamples.birdsTest;

public class Bird {
    boolean itFlies;

    public Bird (boolean fly) {
        if (fly) {
            System.out.println("Flying");
        } System.out.println("Not flying");
    }

    public Bird (String fly) {
        if (fly == "Foo") {
            System.out.println("Learning to Fly");
        }
        System.out.println("The bird fell");
    }

    public Bird (int high) {
        System.out.println("The bird is flying high as " + high + " meters.");
    }

    public Bird () {
        System.out.println("The is nothing");
    }
}
