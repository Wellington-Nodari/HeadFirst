package Cap10.Statics.Tests;

import javax.swing.*;
import java.util.ArrayList;

public class SoundPlayer {
    String brand;
    int spCount = 0;

    public SoundPlayer (String b) {
        brand = b;
//        spCount++;
        System.out.println(spCount);
    }

    public SoundPlayer(){

    }

    public void playSound(String title) {
        System.out.println(title);
    }

    public static void doSomething() {
        String x = JOptionPane.showInputDialog("Enter the player brand");
        SoundPlayer sp = new SoundPlayer(x);
        System.out.println("The player brand is " + sp.brand);
    }

    public static void go (final long spCount) {
        long y = Math.round(11.49f);
        int x = 11;
        Integer iWrap = new Integer(x);

        System.out.println(y + x +  spCount);
    }

}
