package Cap11.dataStructures.jukebox;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jukebox1 {
    public static void main (String[] args) {
        new Jukebox1().go();
//        Jukebox1 jb = new Jukebox1();
//        jb.go();
    }

    public void go() {
        List<String> songList = MockSongs.getSongStrings();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }
}
