package Cap11.dataStructures.jukebox3;

import java.util.Collections;
import java.util.List;

public class Jukebox3 {
    public static void main(String[] args) {
        new Jukebox3().go();
    }

    public void go() {
        List<SongV3> songList = MockSongs3.getSongsV3();
        System.out.println(songList);

        Collections.sort(songList);
        System.out.println(songList);
    }
}
