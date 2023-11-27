package Cap8.PolymorphismExercise;

public class Sun extends CelesteBody implements Star{
    public void shine() {
        System.out.println("The Sun is shinning");
    }

    public void composition(){
        System.out.println("Hydrogen and Helium");
    };

    public void move() {
        System.out.println("Translating the Milky Way");
    }
}
