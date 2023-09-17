package ru.dima.payday.character;

import java.util.ArrayList;
import java.util.List;

public class Scenario {
    public String varScenarios;

    public static String[] scenariosText = {
            "Ты вошли в цель, успешно, прядь лобковых волос намоталось на нос. Пушкина убили как пригожина.",
            "Пы вошли в цель, успешно, прядь лобковых волос намоталось на нос. Пушкина убили как пригожина.",
            "Мы вошли в цель, успешно, прядь лобковых волос намоталось на нос. Пушкина убили как пригожина.",
            "Вы вошли в цель, успешно, прядь лобковых волос намоталось на нос. Пушкина убили как пригожина.",
            "Сы вошли в цель, успешно, прядь лобковых волос намоталось на нос. Пушкина убили как пригожина.",
    };
    public static List<List<String>> scenarioList = new ArrayList<>();

    static {
        for (int i = 0; i < scenariosText.length; i++) {
            List<String> scenario = new ArrayList<>();
            initializeScenario(scenariosText[i], scenario);
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