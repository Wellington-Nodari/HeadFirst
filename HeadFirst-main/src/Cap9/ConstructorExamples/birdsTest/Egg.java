package Cap9.ConstructorExamples.birdsTest;

public class Egg  extends Duck2 {
    String eggSize;

    public Egg (String eggSize) {
        super(23);
        System.out.println("The egg size is " + eggSize);
    }
}
