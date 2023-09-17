package ru.dima.payday.character;

import java.util.Random;

public class Fight {
    public static int fightTime = 10;

    public static boolean startFight() {
        Guard.generateGuard();


        boolean win;
        Random random = new Random();
        int characterStrength = random.nextInt(10) + 5;
        int guardStrength = random.nextInt(10) + 1;

        if (characterStrength > guardStrength) {
            win = true;
            System.out.println("Игрок победил охранника");
        } else if (characterStrength < guardStrength) {
            win = false;
            System.out.println("Охранник победил");
        } else {
            System.out.println("Вы смогли убежать от охранника");
            win = true;
        }
    return win;
    }


}
