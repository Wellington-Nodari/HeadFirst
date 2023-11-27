package Cap11.dataStructures.jukebox2;

import java.util.ArrayList;
import java.util.List;

public class MockSongs2 {
    public static List<String> getSongStrings() {
        return null;
    }

    public static List<SongV2> getSongsV2() {
        List<SongV2> songs = new ArrayList<>();
        songs.add(new SongV2("somersault", "zero 7", 147));
        songs.add(new SongV2("cassidy", "grateful dead", 158));
        songs.add(new SongV2("$10", "hitchhiker", 140));

        songs.add(new SongV2("havana", "cabello", 150));
        songs.add(new SongV2("Cassidy", "greatful dead", 158));
        songs.add(new SongV2("50 ways", "simon", 102));
        return songs;
    }
}