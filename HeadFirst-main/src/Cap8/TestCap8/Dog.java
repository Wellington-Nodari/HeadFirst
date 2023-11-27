package Cap8.TestCap8;

import java.util.ArrayList;

public class Dog extends Canine implements Pet{

    private String dogName;

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public void beFriendly() {
        // (...);
    }

    public void play() {
        // (...);
    }

    public void makeNoise() {
        System.out.println("Woof! Woof!");
    }

    public void eat() {
        System.out.println("chomp... chomp...");
    }

    public ArrayList<String> dogsList() {
        ArrayList<String> dogList = new ArrayList<String>();
        dogList.add(this.getDogName());
        return dogList;
    }

//    Pet d = new Dog();
//
//    Pet[] i  = new Pet[3];
}
