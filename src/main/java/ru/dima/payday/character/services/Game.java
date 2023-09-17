package ru.dima.payday.character.services;

import ru.dima.payday.character.*;
import ru.dima.payday.character.Character;
import ru.dima.payday.character.services.ResultHandler;

import java.util.*;
import java.util.Random;

import static ru.dima.payday.character.Robbery.robberies;
import static ru.dima.payday.character.Scenario.scenarioList;

public class Game {
    static Character character = new Character();

    public static int fightCount = 0;

    public static int money;
    static List<Guard> Guards = new ArrayList<>();
    static Random random = new Random();
    static boolean win = true;
    static int scenarioSize;

    public static void startGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Список доступных ограблений:");
        for (int i = 0; i < robberies.length; i++) {
            System.out.printf("%d. %s %n", i + 1, robberies[i]);


        }

        System.out.println("Выберите ограбление");
        int robberyNum = scanner.nextInt();
        Robbery selectedRobbery = robberies[robberyNum - 1];
        System.out.println("Выберите сложность ограбления");
        for (int i = 0; i < Difficulty.values().length; i++) {
            System.out.printf("%d. %s%n", (i + 1), Difficulty.values()[i]);//создание персонажа, выбор ограбления , выбор сложности ограбления , старт игры
        }
        int selectedDifficulty = scanner.nextInt();

        double chosenDouble = Difficulty.values()[selectedDifficulty - 1].getCombatProbability();
        money = Difficulty.values()[selectedDifficulty - 1].getReward();

        System.out.printf("%s%nСложность: %s%n", selectedRobbery, Difficulty.values()[selectedDifficulty - 1]);
        System.out.println("Вы начинаете ограбление");
        List<String> scenario = new ArrayList<>();
        scenario.addAll(scenarioList.get(robberyNum - 1));
        for (int l = 0; l < scenario.size(); l++) {
            System.out.println(scenario.get(l));
            double procOfCombat = random.nextDouble();
            if (procOfCombat < chosenDouble) {
                fightCount++;
                boolean result = Fight.startFight();
                if (!result) {
                    win = false;
                    break;
                }

            }
            scenarioSize = l;
        }
        ResultHandler.resultOutput();

    }

    @Override
    public String toString() {
        return String.format("%nИмя: %s%nВозраст: %d%nНациональность: %s%nПол: %s%n", character.getName(), character.getAge(), character.getNationality(), character.getGender());
    }
}
