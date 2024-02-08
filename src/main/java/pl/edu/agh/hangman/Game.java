package pl.edu.agh.hangman;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import static pl.edu.agh.hangman.Hangman.HANGMANPICS;

public class Game {

    WordUtils wordUtils = new WordUtils();

    public void runGame() {
        Scanner scanner = new Scanner(System.in);

        String word = wordUtils.getWord();
        String[] lettersList = word.split("");
        String[] dashedWord = wordUtils.getDashedWord(word);
        System.out.println(Arrays.toString(dashedWord));

        int life = HANGMANPICS.length;
        while (life != 0) {
            System.out.println("Podaj literę: ");
            String guess = scanner.nextLine();
            if (word.contains(guess)) {
                for (int index = 0; index < lettersList.length; index++) {
                    if (Objects.equals(guess, lettersList[index])) {
                        dashedWord[index] = guess;
                        System.out.println(Arrays.toString(dashedWord));
                    }
                }
            } else {
                life --;
                System.out.println("Wrong guess. You've lost one life: " + life);
                System.out.println(Arrays.toString(new String[]{HANGMANPICS[life]}));
            }
            if(wordUtils.isTheWordGuessed(dashedWord)) {
                life = 0;
                System.out.println("Congratulations");
            }
        }
        System.out.println("Game Over");
    }
}
