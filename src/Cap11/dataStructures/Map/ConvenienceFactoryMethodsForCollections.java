package Cap11.dataStructures.Map;

import Cap11.dataStructures.jukebox4.SongV4;

import java.util.*;
import static java.util.Map.*;

public class ConvenienceFactoryMethodsForCollections {
    public static void main(String[] args) {
        // LIST - List.of()
        // simple list of Strings
        List<String> strings = List.of("somersault", "cassidy", "$10");

        // list of objects
        List<SongV4> songs = List.of(new SongV4("somersault", "zero 7", 147),
                                    new SongV4("cassidy", "greatful dead", 158),
                                    new SongV4("$10", "hitchhiker", 140));

        System.out.println("Songs Lists: " + strings + "\n" + songs);

        // SET - Set.of()
        // Set uses a very similar sintax to List
        Set<Book> books = Set.of(new Book("How Cats Work"),
                                new Book("Remix you Body"),
                                new Book("Finding Emo"));

        System.out.println("Book Set: " + books);

        // MAP - Map.of() || Map.ofEntries()
        // If put less than 10 entries, use Map.of() <Suggestion>
        Map<String, Integer> scores = Map.of("Kathy", 42,
                                            "Bert", 343,
                                            "Skyler", 420);
        System.out.println(scores);

        // If put more than 10 entries, use Map.ofEntries()
        Map<String, String> stores = Map.ofEntries(
                                    Map.entry("Riley", "Supersports"),
                                    Map.entry("Brooklyn", "Camera World"),
                                    Map.entry("Jay", "Homecase"));

        System.out.println(stores);

        // Using static import
        Map<String, String> stores2 = ofEntries(
                entry("Riley", "Supersports"),
                entry("Brooklyn", "Camera World"),
                entry("Jay", "Homecase"));

        System.out.println("Using static import: " + stores2);
    }

}
