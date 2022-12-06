package task1;

import java.util.ArrayList;
import java.util.Arrays;

public class WordService {
    private String text;

    public WordService(String text) {
        this.text = text;
    }

    public void findMostFrequentWord() {
        String[] words = text.split(" ");
        ArrayList<String> word = new ArrayList<String>();
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            for(int j = i + 1; j < words.length; j++){
                if(words[i].equals(words[j])){
                    word.add(words[j]);
                }
            }
        }
        System.out.println( Arrays.toString(word.toArray()) );
        // напишите решение тут
        // если это необходимо то
        // смело создавайте дополнительные методы
    }

}

