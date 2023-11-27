package Cap11.dataStructures.jukebox3;

import java.util.ArrayList;
import java.util.List;

public class MockSongs3 {
    public static List<String> getSongStrings() {
        return null;
    }

    public static List<SongV3> getSongsV3() {
        List<SongV3> songs = new ArrayList<>();
        songs.add(new SongV3("somersault", "zero 7", 147));
        songs.add(new SongV3("cassidy", "grateful dead", 158));
        songs.add(new SongV3("$10", "hitchhiker", 140));

        songs.add(new SongV3("havana", "cabello", 150));
        songs.add(new SongV3("Cassidy", "greatful dead", 158));
        songs.add(new SongV3("50 ways", "simon", 102));
        return songs;
    }
}