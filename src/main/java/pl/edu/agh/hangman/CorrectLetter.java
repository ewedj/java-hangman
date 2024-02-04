package pl.edu.agh.hangman;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class CorrectLetter {
    public static void main(String[] args) {
        String word = "czynność";
        String[] lettersList = word.split("");

        System.out.println(Arrays.toString(lettersList));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj literę: ");
        String guess = scanner.nextLine();
        for (String s : lettersList) {
            if (Objects.equals(guess, s)) {
                System.out.println("correct");
            }
        }
    }
}
