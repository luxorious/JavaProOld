package homeworks.aditionalHomeWorks.lesson9HW.wordFinder;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWordFinderTest {

    public static void main(String[] args) {
        UniqueWordFinder uf = new UniqueWordFinder();

        String text = "some unique some words text";

        Set<String> expected = Set.of("some", "unique", "words", "text");

        if (expected.equals(uf.find(text))){
            System.out.println("It's working");
        } else {
            System.out.println((uf.find(text)) + " result!\n" + expected + "expected");
        }
    }
}
