package pl.edu.agh.hangman;

import java.util.Scanner;

public class UI {

    Scanner scanner = new Scanner(System.in);

    public static final String[] HANGMANPICS = new String[]{
            "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "========"
    };

    public void printMainMenu() {

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "|Welcome to the Hangman Game    |\n"
                + "|- - - - - - - - - - - - - - - -|\n"
                + "|1. New Game                    |\n"
                + "|0. Exit                        |\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public void printSelectionMenu(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n"
                + "|Which word source do you prefer?           |\n"
                + "|- - - - - - - - - - - - - - - - - - - - - -|\n"
                + "|1. A word from our wordList                |\n"
                + "|2. A word from Wordnik service             |\n"
                + "|3. Exit                                    |\n"
                + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    public String takeStringInput(String messageForUser) {
        System.out.println(messageForUser);
        return scanner.next();
    }

    public int takeIntegerInput(String messageForUser) {
        System.out.print(messageForUser);
        return scanner.nextInt();
    }
}
