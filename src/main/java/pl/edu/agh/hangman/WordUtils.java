package pl.edu.agh.hangman;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class WordUtils {

    public String getRandomWord(List<String> wordList) {
        Random random = new Random();
        final int randomInt = random.nextInt(wordList.size());
        return wordList.get(randomInt);
    }

    String[] dashWord(String randomWord) {
        String[] dashedWord = new String[randomWord.length()];
        Arrays.fill(dashedWord, "_");
        return dashedWord;
    }

    public boolean isTheWordGuessed(String[] array) {
        boolean condition = true;
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(array[i], "_")) {
                condition = false;
            }
        }
        return condition;
    }

    private List<String> getWords() {
        WordReader wr = new WordReader();
        return wr.readFile();
    }

    public String getWord() {
        List<String> wordList = getWords();
         return getRandomWord(wordList);
    }

    public String[] getDashedWord(String word) {
        return dashWord(word);
    }
}
