package pl.edu.agh.hangman;

public class Game {

    WordUtils wordUtils = new WordUtils();

    public void runGame() {

        String word = wordUtils.getWord();
        char[] dashedWord = wordUtils.getDashedWord(word);
        System.out.println(word);
        System.out.println(dashedWord);

        boolean isRunning = true;
        while (isRunning) {
            isRunning = false;
        }
    }
}
