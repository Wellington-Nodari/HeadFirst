package Cap9.ConstructorExamples.birdsTest;

public class Duck {
    private int size;

    public Duck(int duckSize) {
        System.out.println("Quack");

        size = duckSize;

        System.out.println("This duck size is " + size);
    }

//    public void setSize(int newSize) {
//        size = newSize;
//    }
}
