package Cap11.dataStructures.jukebox3;

public class SongV3 implements Comparable<SongV3> {
    private String title;
    private String artist;
    private int bpm;

    // for the method below, check the Comparable interface
    public int compareTo(SongV3 s) {
        return artist.compareTo(s.getArtist());
    }

    SongV3 (String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getBpm() {
        return bpm;
    }

    public String toString() {
        return title;
    }
}
