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
        String mostOftenWord = "";
        int numberWords = 0;
        for (int i = 0; i < words.length; i++) {
            int counter = 0;
            for(int j = 0; j < words.length; j++){
                if(words[i].equals(words[j])){
                    counter++;
                    for(String elem of words){

                    }
                    mostOftenWord = words[j];
                    System.out.println(mostOftenWord);
//                    mostOftenWord = words[i];
//                    word.add(words[j]);
                }
            }
            word.add(mostOftenWord);
            if (counter >= numberWords){
                word.add(mostOftenWord);
            }
        }
        System.out.println( Arrays.toString(word.toArray()) );

    }

}

