package Cap11.dataStructures.jukebox2;

import java.util.*;

public class Jukebox2 {
    public static void main(String[] args) {
        new Jukebox2().go();
    }

    public void go() {
        List<SongV2> songList = MockSongs2.getSongsV2();
        System.out.println(songList);

//        Collections.sort(songList); (this line won't let me compile the code, as SongV2 doesn't implements Comparable)
        System.out.println(songList);
    }
}
