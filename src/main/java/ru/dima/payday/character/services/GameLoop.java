package ru.dima.payday.character.services;

import java.util.Scanner;

public class GameLoop {
    public static void gameLoop() {
        Scanner scanner = new Scanner(System.in);
        CreatePlayer.createPlayer();
        boolean playAgain = true;
        while (playAgain) {
            Game.startGame();
            System.out.print("Хотите продолжить игру? (да/нет): ");
            String playAgainChoice = scanner.next();
            playAgain = playAgainChoice.equalsIgnoreCase("Да");
        }
        System.out.println("i wanna k$m");
        scanner.close();
    }

}
