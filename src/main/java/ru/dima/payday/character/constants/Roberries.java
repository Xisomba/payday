package ru.dima.payday.character.constants;

import ru.dima.payday.character.models.Robbery;

public class Roberries {
    public static Robbery[] robberies;

    static {
        robberies = new Robbery[5];
        robberies[0] = new Robbery(1,"Ювелирный магазин", "Америка, Лос-Анджелес"); // В каждый по сценарию , который будет относиться к уникальному ограблению
        robberies[1] = new Robbery(2,"Банк Спермы", "Россия, Норильск");
        robberies[2] = new Robbery(3,"Данж Говна", "Бразилия");
        robberies[3] = new Robbery(4,"Воровской карман", "Неизвестно, Норильск?");
        robberies[4] = new Robbery(5,"ЛАРЁК", "Россия, Нижние Серги");
    }
}
