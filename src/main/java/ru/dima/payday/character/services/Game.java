package ru.dima.payday.character.services;

import ru.dima.payday.character.constants.Colors;
import ru.dima.payday.character.models.Character;
import ru.dima.payday.character.models.Robbery;

import java.util.*;
import java.util.Random;

import static ru.dima.payday.character.constants.GameConst.SLEEP_TIME;
import static ru.dima.payday.character.models.Scenario.scenarioList;

public class Game {

    public void startGame(Scanner scanner, Character character) throws InterruptedException {
        RobberySelection robberySelection = new RobberySelection();
        Robbery selectedRobbery = robberySelection.robberySelector(scanner);
        System.out.println("Вы начинаете ограбление");
        List<String> scenario = scenarioList.get(selectedRobbery.getRobberyNum() - 1);
        boolean result = true;
        long startTime = System.currentTimeMillis();
        for (String s : scenario) {
            Thread.sleep(SLEEP_TIME);
            System.out.printf("%s%s", Colors.ANSI_WHITE,s);
            Random random = new Random();
            double procOfCombat = random.nextDouble();
            if (procOfCombat < selectedRobbery.getCombatProbability()) {
                Fight fight = new Fight();
                result = fight.startFight(random);
                if (!result) {
                    break;
                }

            }
        }
        long endTime = System.currentTimeMillis();
        ResultHandler resultHandler = new ResultHandler();
        resultHandler.resultOutput(character, result, selectedRobbery, startTime, endTime);

    }
}