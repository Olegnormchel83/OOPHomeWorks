package Seminars.Sem3.BullsAndCows;
/**
 * Коровы: угаданный символ
 * Быки: угаданный символ + угаданное место
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MAX_TRY_COUNT = 10;
        List<String> userInputs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        AbstractGame nGame = null;
        int gameMod = 0;
        int wordLength = 0;
        String gameLanguage = null;
        boolean isSelected = false;
        boolean exit = false;

        while (!exit) {
            while (!isSelected) {
                System.out.println("""
                        Выберите режим игры
                        1. Русские слова
                        2. Английские слова
                        3. Цифры
                        """);

                gameMod = scanner.nextInt();

                switch (gameMod) {
                    case 1:
                        nGame = new RUGame();
                        gameLanguage = "RU";
                        isSelected = true;
                        break;
                    case 2:
                        nGame = new ENGame();
                        gameLanguage = "EN";
                        isSelected = true;
                        break;
                    case 3:
                        nGame = new NumberGame();
                        gameLanguage = "NUM";
                        isSelected = true;
                        break;
                    default:
                        System.out.println("Неверно выбран режим!");
                }
            }

            System.out.println("Введите длину загадываемого слова (от 3 до 9 букв): ");
            wordLength = scanner.nextInt();

            switch (wordLength) {
                case 3, 4, 5, 6, 7, 8, 9 -> nGame.start(gameLanguage, wordLength, MAX_TRY_COUNT);
                default -> System.out.println("Мы еще не придумали слов такой длины");
            }

            while (nGame.getGameStatus().equals(GameStatus.START)) {
                Scanner scan = new Scanner(System.in);
                System.out.println("\nВаш ход. Угадайте слово/число из " + wordLength + " символов");
                String userInput = scan.nextLine();
                Answer answer = nGame.inputValue(userInput);
                userInputs.add(userInput);
                System.out.println(answer);
            }

            System.out.println(nGame.getGameStatus().getDescriptions());

            boolean cont = false;
            while (!cont) {
                System.out.println("""
                        \nВыберите действие:
                        1. Посмотреть статистику
                        2. Рестарт
                        3. Выйти
                        """);

                int userChange = scanner.nextInt();

                switch (userChange) {
                    case 1:
                        nGame.getStatistic(MAX_TRY_COUNT, userInputs, nGame.getWord());
                        break;
                    case 2:
                        userInputs.clear();
                        isSelected = false;
                        cont = true;
                        break;
                    case 3:
                        cont = true;
                        exit = true;
                        break;
                    default:
                        System.out.println("Такого дейтсвия нет");
                }
            }
        }
        scanner.close();
    }
}
