package Cap11.dataStructures.jukebox4;

import java.util.Comparator;

public class TitleCompare implements Comparator<SongV4> {
    public int compare(SongV4 one, SongV4 two) {
        return one.getTitle().compareTo(two.getTitle());
    }
}
