package Cap6;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("I20");
        cars.add("Yaris");
        cars.add("Fiesta");
        cars.add("Model 2");

        ArrayList<String> make = new ArrayList<String>();
        make.add("Hyundai");
        make.add("Toyota");
        make.add("Ford");
        make.add("Mazda");

        ArrayList [] myCars = new ArrayList[2];
        myCars[0] = cars;
        myCars[1] = make;

        int size = myCars.length;


        System.out.println(myCars[0]);
        System.out.println(myCars[1]);
        System.out.println(size);
    }
}
