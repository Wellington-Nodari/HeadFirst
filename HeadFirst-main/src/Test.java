import Cap11.dataStructures.jukebox4.MockSongs4;
import Cap8.TestCap8.Animal;
import Cap8.TestCap8.Canine;
import Cap8.TestCap8.Cat;
import Cap8.TestCap8.Dog;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        IntoArrayList al = new IntoArrayList();
        System.out.println(al.intoArrayL());

        ArrayList<String> x = al.intoArrayL();
        al.doSomething(x);
    }
}

class Helper {
    public String getUserInput (String prompt) {
        System.out.println(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

class IntoArrayList extends Animal{
    public ArrayList<String> intoArrayL() {
        Helper hp = new Helper();
        ArrayList<String> dog = new ArrayList<>();
        Dog dg = new Dog();

        int size =  dog.size();
        while (size < 3) {
            String dogName = hp.getUserInput("Enter your dog name" );
            dog.add(dogName);
            dg.setDogName(dogName);
            size++;
        }
        return dog;
    }

    public <T extends Canine> void doSomething(ArrayList<String> dogs) {
        Dog dg = new Dog();
        dogs = dg.dogsList();
        System.out.println("18/08/2023" + dogs);
    }
}
