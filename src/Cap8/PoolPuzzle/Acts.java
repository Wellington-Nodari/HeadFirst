package Cap8.PoolPuzzle;

public class Acts extends Clowns{
    public static void main (String [] args) {
        Nose[] i = new Nose[3];

        i[0] = new Acts();
        i[1] = new Clowns();
        i[2] = new Of76();

        for (int x = 0; x < 3; x++) {
            System.out.println(i + " " + i[x].getClass());
        }
    }
}
