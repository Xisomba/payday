package ru.dima.payday.character.models;

public enum Difficulty {


    NORMAL(10000, 0.2),
    HARD(100000, 0.3),
    OVERKILL(500000, 0.4);
    private final int reward;
    private final double combatProbability;

    Difficulty(int reward, double combatProbability) {
        this.reward = reward;
        this.combatProbability = combatProbability;
    }

    public int getReward() {
        return reward;
    }

    public double getCombatProbability() {
        return combatProbability;
    }
}
