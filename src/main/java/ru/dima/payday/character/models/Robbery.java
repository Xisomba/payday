package ru.dima.payday.character.models;

public class Robbery {
    private final String robberyName;
    private final String location;
    private final int robberyNum;
    private int reward;
private double combatProbability;
    @Override
    public String toString() {
        return String.format("%s. Местоположение:%s", robberyName, location);
    }

    public Robbery(int robberyNum, String robberyName, String location) {
        this.robberyName = robberyName;
        this.location = location;
        this.robberyNum = robberyNum;
    }


    public void setDifficulty(Difficulty difficulty){
        this.reward = difficulty.getReward();
        this.combatProbability = difficulty.getCombatProbability();
    }

    public int getRobberyNum() {
        return robberyNum;
    }
    public int getReward() {
        return reward;
    }
    public double getCombatProbability() {
        return combatProbability;
    }
}






