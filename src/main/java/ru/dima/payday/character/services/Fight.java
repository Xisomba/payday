package ru.dima.payday.character.services;

import ru.dima.payday.character.constants.Colors;
import ru.dima.payday.character.models.Guard;

import java.util.Random;

import static ru.dima.payday.character.constants.GameConst.SLEEP_TIME;
import static ru.dima.payday.character.constants.GuardParams.*;


public class Fight {
    private  final int boundOfStrength = 10;
    private  final int minCharacterStrength = 5;
    private  final int minGuardStrength = 1;
    private  final int minGuardAge = 18;
    private  final int guardAgeBound = 82;

    public boolean startFight(Random random) throws InterruptedException {

        Guard officer = generateGuard(random);
        System.out.printf("%sВас заметил охранник(%s,%s,%s,%s) начинается бой!%n",Colors.ANSI_RED, officer.getName(), officer.getAge(), officer.getGender(), officer.getNationality());
        Thread.sleep(SLEEP_TIME);
        boolean win;
        int characterStrength = random.nextInt(boundOfStrength) + minCharacterStrength;
        int guardStrength = random.nextInt(boundOfStrength) + minGuardStrength;

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

    private  Guard generateGuard(Random random) {
        int randomAge = random.nextInt(guardAgeBound) + minGuardAge;
        String randomName = names[random.nextInt(names.length)];
        String randomNationalities = nationalities[random.nextInt(nationalities.length)];
        String randomGender = genders[random.nextInt(genders.length)];

        return new Guard(randomName, randomAge, randomNationalities, randomGender);
    }

}
