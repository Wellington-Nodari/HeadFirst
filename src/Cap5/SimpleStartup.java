package Cap5;

import java.util.ArrayList;
import java.util.List;

public class SimpleStartup {
    private int [] locationCells;
    private int numOfHits = 0;

    public void setLocationCells (int [] locs) {
        locationCells = locs;
    }

    ArrayList<Integer> guessedList = new ArrayList<>();

    int checkGuess (int guessed) {
        int x;
        boolean guessedAgain = guessedList.contains(guessed);
        if (guessedAgain) {
            x = 1;
        } else {
            x = 0;
        }
        return x;
    }

        String checkYourself (int guess) {
            String result = "miss";
            for (int cell : locationCells) {
                if (checkGuess(guess) == 1) {
                    System.out.println("You have guessed this number already, choose another one");
                    result = "miss";
                    break;
                } else {
                    if (guess == cell) {
                        result = "hit";
                        numOfHits++;
                        guessedList.add(guess);
                        break;
                    }
                }
            }
                if (numOfHits == locationCells.length) {
                    result = "kill";
                }
//            System.out.print(guessedList + ", ");
            System.out.println (result);
            return result;
        }
}

