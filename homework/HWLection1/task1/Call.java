package task1;

public class Call {
    public static void main(String[] args) {
        String text = "sdf sadcx sdfgds dfsada sdf sdf sadcx";
        WordService word = new WordService(text);
        word.findMostFrequentWord();
    }
}
