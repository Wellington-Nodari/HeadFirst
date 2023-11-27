package Cap10.Statics.TestBox;

public class TestBox {
    private Integer i = 0;
    private int j;

    public static void main(String[] args) {
        TestBox t = new TestBox();
        t.go2();
    }

    public void go() {
        j = i;
        System.out.println(j);
        System.out.println(i);
    }

    public void go2() {
        boolean y = false;
        long z = 123456;
        double a = 42.2;

        String print = Long.toString(z);
        String print2 = String.valueOf(a);
        System.out.println("This test is " + y + "\n" + print + "\n" + print2);
    }

    public void parse() {
        String s = "2";
        int x = Integer.parseInt(s);

        double d = Double.parseDouble("420.24");
        boolean b = Boolean.parseBoolean("TRUE");
    }
}


