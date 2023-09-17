package ru.dima.payday.character;

import java.util.Random;

public class Guard extends Human {
    public Guard(String name, int age, String nationality, String gender) {
        super(name, age, nationality, gender);
    }

    static String[] names = new String[5];
    static String[] nationalities = new String[5];

    static String[] genders = new String[3];

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

    public static void generateGuard(){
        Random random = new Random();
        int randomAge = random.nextInt(82)+ 18;
        String randomName = names[random.nextInt(names.length)];
        String randomNationalities = nationalities[random.nextInt(nationalities.length)];
        String randomGender = genders[random.nextInt(genders.length)];
        Guard officer =  new Guard(randomName, randomAge, randomNationalities, randomGender);
        System.out.printf("Вас заметил охранник(%s,%s,%s,%s) начинается бой!%n", officer.getName(), officer.getAge(), officer.getGender(), officer.getNationality());
    }

}





