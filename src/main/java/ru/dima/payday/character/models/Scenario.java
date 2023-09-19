package ru.dima.payday.character.models;

import java.util.ArrayList;
import java.util.List;

import static ru.dima.payday.character.constants.ConstScenarios.*;

public class Scenario {
    public static List<List<String>> scenarioList = new ArrayList<>();

    static {
        for (String s : scenariosText) {
            List<String> scenario = new ArrayList<>();
            initializeScenario(s, scenario);
            scenarioList.add(scenario);
        }
    }

    private static void initializeScenario(String text, List<String> scenarioList) {
        String[] sentences = text.split("\\.");
        for (String sentence : sentences) {
            scenarioList.add(sentence.trim() + ".");
        }
    }
}