package Cap9.ConstructorExamples.birdsTest;

public class Duck2 extends Bird{
    private int size;

//    Using OVERLOADED CONSTRUCTORS
//    this is more useful if compared to the "commented IF" as the user can pass the size = 0 as a valid value

    public Duck2() {
        super(true);
        size = 27;
        System.out.println("This duck2 size is " + size);
    }

    public Duck2(int duckSize) {
//        clunky solution

//        if (duckSize == 0) {
//            size = 27;
//        } else {
//            size = duckSize;
//        }
        super(12);
        System.out.println("Quack");
        size = duckSize;
        System.out.println("This duck2 size is " + size);
    }
}
