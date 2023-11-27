package Cap8.TestCap8;

import Cap8.PolymorphismInAction.MyDogList;

public class TestClass {
    public static void main (String [] args) {
        System.out.println("Testing...");

        Dog aDog = new Dog();
//        Dog sameDog = getObject(aDog);
        Object sameDog2 = getObject(aDog);

        if (aDog.equals(sameDog2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


        Object o = sameDog2;
//        Dog d = (Dog) o;  // cast the Object back to a Dog WE KNOW is there

        if (o instanceof Dog) {
            Dog dd = (Dog) o;
        }

//        d.eat();


    }

    public static Object getObject(Object o) {
        return o;
    }
}
