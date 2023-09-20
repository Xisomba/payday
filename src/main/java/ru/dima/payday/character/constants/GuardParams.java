package ru.dima.payday.character.constants;

public class GuardParams {
    public static final String[] names = new String[5];
    public static final String[] nationalities = new String[5];

    public static final String[] genders = new String[3];

    static {
        names[0] = "Андрей";
        names[1] = "Илья";
        names[2] = "Артём";
        names[3] = "Кирилл";
        names[4] = "Олег";


        nationalities[0] = "Русский";
        nationalities[1] = "Армянин";
        nationalities[2] = "Белорус";
        nationalities[3] = "Китаец";
        nationalities[4] = "Обрез";

        genders[0] = "Мужчина";
        genders[1] = "женщина";
        genders[2] = "Механик";
    }
}
