package Cap4;

public class TestCap4v3 {

    int calcArea(int h ,int w) {
        return h * w;
    }

    public static void main(String[] args) {
        TestCap4v3 t = new TestCap4v3();

        int a = t.calcArea(7, 12);

        System.out.println(a);

    }

}
