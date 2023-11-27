package Cap11.dataStructures.jukebox4;

import java.util.List;

public class Jukebox4 {
    public static void main(String[] args) {
        new Jukebox4().go();
    }

    public void go() {
        List<SongV4> songList = MockSongs4.getSongsV4();
        System.out.println(songList);

//        <implementing only Comparators instead Comparable>

//        Collections.sort(songList);
//        System.out.println(songList);

        TitleCompare titleCompare = new TitleCompare();
        songList.sort(titleCompare);
        System.out.println(songList);

        ArtistCompare artistCompare = new ArtistCompare();
        songList.sort(artistCompare);
        System.out.println(songList);
    }
}
