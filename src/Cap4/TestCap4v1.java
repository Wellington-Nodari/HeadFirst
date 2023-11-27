package Cap4;

public class TestCap4v1 {

    int size;
    String name;

    void bark(int numOfBarks) {
//        if (size > 60) {
//            System.out.println("Woof! Woof!");
//        } else if (size > 14) {
//            System.out.println("Roof! Roof!");
//        } else {
//            System.out.println("Yip! Yip!");
//        }

        // adding parameter to the method
        System.out.print(name + " Says: ");
        while (numOfBarks > 0) {
            System.out.print("ruff! ");
            numOfBarks = numOfBarks - 1;
        } System.out.println("");
    }
}

class DogTestDrive {
    public static void main(String[] args){
        TestCap4v1 one = new TestCap4v1();
        one.size = 70;
        one.name = "Hanna";

        TestCap4v1 two = new TestCap4v1();
        two.size = 8;

        TestCap4v1 three = new TestCap4v1();
        three.size = 35;

        int b = 5;

        // passing arguments that points to the method's parameter
        one.bark(b);
        two.bark(2);
        three.bark(3);
    }

}
