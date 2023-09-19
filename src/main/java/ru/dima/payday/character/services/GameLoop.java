package ru.dima.payday.character.services;

import ru.dima.payday.character.models.Character;

import java.util.Scanner;

public class GameLoop {
    public static void gameLoop() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        PlayerCreateService createPlayer = new PlayerCreateService();
        Character character = createPlayer.playerCreator(scanner);
        boolean playAgain = true;
        while (playAgain) {
            Game startGame = new Game();
            startGame.startGame(scanner, character);
            System.out.print("Хотите продолжить игру? (да/нет): ");
            String playAgainChoice = scanner.next();
            playAgain = playAgainChoice.equalsIgnoreCase("Да");
        }
        System.out.println("i wanna k$m");
        scanner.close();    }

}
