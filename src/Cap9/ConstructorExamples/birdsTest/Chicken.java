package Cap9.ConstructorExamples.birdsTest;

public class Chicken extends Bird {

    private Bird bird;

//    public Chicken(boolean fly) {
//        super(fly);
//    }

    public Chicken (Bird b) {
        super ("Bird");
        bird = b;
    }

//    public Chicken () {
//        this(false);
//    }


}
