package Cap8.PolymorphismExercise;

public class Saturn extends Planets implements GasGiant{
    public void composition(){
        System.out.println("Gas");
    };

    @Override
    public void yearToDays() {
        super.yearToDays();
    }
}
