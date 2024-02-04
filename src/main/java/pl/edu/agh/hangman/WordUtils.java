package pl.edu.agh.hangman;

import java.util.List;
import java.util.Random;

public class WordUtils {

    public String getRandomWord(List<String> wordList) {
        Random random = new Random();
        final int randomInt = random.nextInt(wordList.size());
        return wordList.get(randomInt);
    }

    char[] dashWord(String randomWord) {
        final int wordLength = randomWord.length();
        final char dash = '_';
        char[] dashedWord = new char[wordLength];
        for (int i= 0; i < wordLength;i++) {
            dashedWord[i] = dash;
        }
        return dashedWord;
    }
}
