package pl.edu.agh.hangman;

import java.util.*;

public class CorrectLetter {
    public static ArrayList<Integer> checker() {

        String[] hang = {
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


        List<String> hangmanList = new ArrayList<String>(Arrays.asList(hang));

        int liczbaZyc = 6;


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
            } else {
                System.out.println(hangmanList.get(liczbaZyc));
                liczbaZyc--;
            }
        }

        return letterIndex;
    }

    public static void main(String[] args) {
        System.out.println(checker());
    }
}
