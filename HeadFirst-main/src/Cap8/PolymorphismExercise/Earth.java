package Cap8.PolymorphismExercise;

public class Earth extends Planets implements Rocky{
    public void composition(){
        System.out.println("Rocks");
    }
    @Override
    public void yearToDays() {
        System.out.println("365 days");
    }


    public double move(double hours) {
        double x;
        x = (360 * hours) / 23.56;

        return x;
    }

    public float move(float days) {
        float y;
        y = ((360 * days) / 365) / 365;

        return y;
    }
}
