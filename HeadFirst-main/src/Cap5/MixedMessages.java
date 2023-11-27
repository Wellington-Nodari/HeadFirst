package Cap5;

public class MixedMessages {
    public static void main(String [] args) {
        int x = 0;
        int y = 30;

        for (int outer = 0; outer < 3; outer++) {         // REMEMBER, ever since the child loop is broken the variables are redefined
            for (int inner = 4; inner > 1; inner--) {     // in this case when the outer loop is iterated the inner will restart with the value of 4
                x = x + 0;
                y = y - 2;
                if (x == 6) {
                    break;
                }
                x = x + 3;
            }
            y = y - 2;
        }
        System.out.println(x + " " + y);
    }
}

/*

x = x + 3 > 54, 6
x = x + 6 > 60, 10
x = x + 2 > 45, 6
x++ >
x-- >
x = x + 0 >

 */