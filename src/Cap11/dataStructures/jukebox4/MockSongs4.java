package Cap11.dataStructures.jukebox4;

import java.util.ArrayList;
import java.util.List;

public class MockSongs4 {
    public static List<String> getSongStrings() {
        return null;
    }

    public static List<SongV4> getSongsV4() {
        List<SongV4> songs = new ArrayList<>();
        songs.add(new SongV4("somersault", "zero 7", 147));
        songs.add(new SongV4("cassidy", "grateful dead", 158));
        songs.add(new SongV4("$10", "hitchhiker", 140));

        songs.add(new SongV4("havana", "cabello", 150));
        songs.add(new SongV4("Cassidy", "greatful dead", 158));
        songs.add(new SongV4("50 ways", "simon", 102));
        return songs;
    }
}