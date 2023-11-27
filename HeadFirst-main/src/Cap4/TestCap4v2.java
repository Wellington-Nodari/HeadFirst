package Cap4;

public class TestCap4v2 {

    int takeTwo(int x, int y) {
        int z = x + y;
        return z;
//        in order to return values, it will allow to get the value and assign it to a variable
    }

    public static void main (String[] args) {
        // just testing that char is a number and relates to int and not to String
        char c = 'w';
        int q = c;
        System.out.println(q);

        TestCap4v2 t = new TestCap4v2();
        int z = t.takeTwo(2,5); // as on this variable

        if (z > 2) {
            System.out.print("it works! " + z);
        }
    }

}
