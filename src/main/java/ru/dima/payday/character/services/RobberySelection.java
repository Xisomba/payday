package ru.dima.payday.character.services;

import ru.dima.payday.character.models.Difficulty;
import ru.dima.payday.character.models.Robbery;
import java.util.Scanner;
import static ru.dima.payday.character.constants.Roberries.robberies;

public  class RobberySelection {
public Robbery robberySelector(Scanner scanner) {
    System.out.println("Список доступных ограблений:");
    for (int i = 0; i < robberies.length; i++) {
        System.out.printf("%d. %s %n", i + 1, robberies[i]);
    }
    System.out.println("Выберите ограбление");
    int robberyNum = scanner.nextInt();
    Robbery selectedRobbery = robberies[robberyNum - 1];
    System.out.println("Выберите сложность ограбления,от сложности ограбления зависит сила охранников.");
    for (int i = 0; i < Difficulty.values().length; i++) {
        System.out.printf("%d. %s%n", (i + 1), Difficulty.values()[i]);//создание персонажа, выбор ограбления , выбор сложности ограбления , старт игры
    }
    int selectedDifficulty = scanner.nextInt();

    Difficulty chosenDifficulty = Difficulty.values()[selectedDifficulty-1];
    selectedRobbery.setDifficulty(chosenDifficulty);
    System.out.printf("%s%nСложность: %s%n", selectedRobbery, chosenDifficulty);
    return selectedRobbery;
}
}

