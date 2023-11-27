package Cap11.dataStructures.jukebox7;

import Cap11.dataStructures.jukebox4.SongV4;
import java.util.*;

// implementing lambda expression

public class Jukebox7 {                                                         // or Jukebox8 if following the book
    public static void main(String[] args) {
        new Jukebox7().go();
    }

    public void go() {
        List<SongV4> songList = MockMoreSongs.getSongsV4();
        System.out.println("not sorted: \n" + songList);

        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println("by Title: \n" + songList);

        // using HashSet
//        Set<SongV4> songSet = new HashSet<>(songList);
//        System.out.println("HashSet List: \n" + songSet);

        // using TreeSet - it's necessary to implement Comparable and use the compareTo() method in SongV4 class
        Set<SongV4> songSet = new TreeSet<>(songList);

        // using TreeSet with lambda
//        Set<SongV4> songSet = new TreeSet<>((o1,o2) -> o1.getBpm() - o2.getBpm());
//        songSet.addAll(songList);


        System.out.println("TreeSet List: \n" + songSet);

//        songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
//        System.out.println("by Artist: \n" + songList);

//        songList.sort((one, two) -> one.getBpm() - two.getBpm());
//        System.out.println("by Bpm: \n" + songList);

//        songList.sort((one, two) -> two.getArtist().compareTo(one.getArtist()));
//        System.out.println("by Artist desc: \n" + songList);

//        if (songList.get(1).equals(songList.get(0))) {
//            System.out.println(songList.get(1).hashCode() + " equal to " + songList.get(0).hashCode() );
//        } System.out.println(songList.get(1).hashCode() + " not equal " + songList.get(0).hashCode());
//
//        if (songList.get(1) == (songList.get(0))) {
//            System.out.println(songList.get(1) + " == " + songList.get(0));
//        } System.out.println(songList.get(1) + " != " + songList.get(0));
//
//        if (songList.get(3).equals(songList.get(4)) && songList.get(3).hashCode() == (songList.get(4).hashCode())) {
//            System.out.println(songList.get(1).hashCode() + " equal && == " + songList.get(0).hashCode());
//        } System.out.println(songList.get(1).hashCode() + " not equal && != " + songList.get(0).hashCode());

    }

}