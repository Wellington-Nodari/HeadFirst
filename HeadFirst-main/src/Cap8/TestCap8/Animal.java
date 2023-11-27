package Cap8.TestCap8;

abstract public class Animal extends Object {

    private String picture;
    private String food;
    private String hunger;
    private String boundaries;
    private String location;

    public void makeNoise() {
        System.out.println("Doing noise");
    }

    public void eat() {
        System.out.println("Eating");
    }

    public void sleep() {
        System.out.println("Sleeping");
    }

    public void roam() {
        System.out.println("Roaming");
    }

}
