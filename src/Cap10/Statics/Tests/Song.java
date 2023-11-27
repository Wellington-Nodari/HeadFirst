package Cap10.Statics.Tests;

public class Song extends SoundPlayer{
    String title;
    public Song (String t) {
//        super("Samsung");
        title = t;
    }
    public void play() {
        SoundPlayer player = new SoundPlayer("Apple");

        player.playSound(title);
    }

}
