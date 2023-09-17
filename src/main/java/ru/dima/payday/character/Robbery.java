package ru.dima.payday.character;

import java.util.Random;

import static ru.dima.payday.character.Difficulty.*;

public class Robbery {
    private Difficulty difficulty;
    private String robberyName;
    private String location;

    @Override
    public String toString() {
        return String.format("Название ограбления:%s Местоположение:%s", robberyName, location);
    }

    public Robbery(String robberyName, String location) {
        this.robberyName = robberyName;
        this.location = location;


    }

    public static Robbery[] robberies;

    static {
        robberies = new Robbery[5];
        robberies[0] = new Robbery("Ювелирный магазин", "Америка, Лос-Анджелес"); // В каждый по сценарию , который будет относиться к уникальному ограблению
        robberies[1] = new Robbery("Банк Спермы", "Россия, Норильск");
        robberies[2] = new Robbery("Данж Говна", "Бразилия");
        robberies[3] = new Robbery("Воровской карман", "Неизвестно, Норильск?");
        robberies[4] = new Robbery("ЛАРЁК", "Россия, Нижние Серги");
    }
    public void setDifficulty(Difficulty difficulty){
        this.difficulty = difficulty;
    }

}






