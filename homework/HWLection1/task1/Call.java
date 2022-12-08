package task1;

public class Call {
    public static void main(String[] args) {
        String text = "abc de df fr abc fr de abc";
        WordService word = new WordService(text);
        word.findMostFrequentWord();
    }
}
