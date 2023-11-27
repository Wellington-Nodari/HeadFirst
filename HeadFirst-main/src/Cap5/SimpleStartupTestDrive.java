package Cap5;

public class SimpleStartupTestDrive {

    public static void main(String [] args) {
        SimpleStartup dot = new SimpleStartup();

        int[] locations = {2,5,4};
        dot.setLocationCells(locations);

        int userGuess = 5;
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";

        if (result.equals("hit")) {
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}
