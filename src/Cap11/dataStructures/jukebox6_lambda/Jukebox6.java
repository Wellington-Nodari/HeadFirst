package Cap11.dataStructures.jukebox6_lambda;

import Cap11.dataStructures.jukebox4.MockSongs4;
import Cap11.dataStructures.jukebox4.SongV4;

import java.util.List;

// implementing lambda expression

public class Jukebox6 {
    public static void main(String[] args) {
        new Jukebox6().go();
    }

    public void go() {
        List<SongV4> songList = MockSongs4.getSongsV4();
        System.out.println("not sorted: \n" + songList);

        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println("by Title: \n" + songList);

        songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
        System.out.println("by Artist: \n" + songList);

        songList.sort((one, two) -> one.getBpm() - two.getBpm());
        System.out.println("by Bpm: \n" + songList);

        songList.sort((one, two) -> two.getArtist().compareTo(one.getArtist()));
        System.out.println("by Artist desc: \n" + songList);

    }
}