package Cap11.dataStructures.jukebox5;

import Cap11.dataStructures.jukebox4.MockSongs4;
import Cap11.dataStructures.jukebox4.SongV4;

import java.util.Comparator;
import java.util.List;

public class Jukebox5 {
    public static void main(String[] args) {
        new Jukebox5().go();
    }

    public void go() {
        List<SongV4> songList = MockSongs4.getSongsV4();
        TitleCompare2 titleCompare2 = new TitleCompare2();
        ArtistCompare2 artistCompare2 = new ArtistCompare2();

        songList.sort(titleCompare2);
        System.out.println(songList);

        songList.sort(artistCompare2);
        System.out.println(songList);
    }
}
class TitleCompare2 implements Comparator<SongV4> {
    public int compare(SongV4 one, SongV4 two) {
        return one.getTitle().compareTo(two.getTitle());
    }
}

class ArtistCompare2 implements Comparator<SongV4> {
    public int compare(SongV4 one, SongV4 two) {
        return one.getArtist().compareTo(two.getArtist());
    }
}