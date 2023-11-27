package Cap11.dataStructures.jukebox4;

import java.util.Comparator;

public class ArtistCompare implements Comparator<SongV4> {
    public int compare(SongV4 one, SongV4 two) {
        return one.getArtist().compareTo(two.getArtist());
    }
}
