package Cap10.Statics.Tests;

public class SoundPlayTestDrive {
    public static void main(String[] args) {
        final SoundPlayer a = new SoundPlayer("www");
        SoundPlayer b = new SoundPlayer("xxxx");

//        SoundPlayer.doSomething();

//        SoundPlayTestDrive x = new SoundPlayTestDrive();
//        String [] y = new String[3];
//        x.main(y);

        System.out.println(a.spCount);
        System.out.println(b.spCount);

        a.go(55);

    }
}
