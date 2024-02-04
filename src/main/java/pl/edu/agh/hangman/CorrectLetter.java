package pl.edu.agh.hangman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class CorrectLetter {
    public ArrayList<Integer> checker (String[] args) {
        ArrayList<Integer> letterIndex = new ArrayList<>();
        String word = "czynność";
        String[] lettersList = word.split("");

        System.out.println(Arrays.toString(lettersList));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj literę: ");
        String guess = scanner.nextLine();
        for (int index = 0; index < lettersList.length; index++) {
            if (Objects.equals(guess, lettersList[index])) {
                letterIndex.add(index);
            }
        }
        return letterIndex;
    }
}
