package ru.dima.payday.character.services;

import static ru.dima.payday.character.Character.totalReward;
import static ru.dima.payday.character.Fight.fightTime;
import static ru.dima.payday.character.services.Game.*;

public class ResultHandler {
    public static int startduration=5;
    public static void resultOutput(){
        int totalDuration = fightCount*fightTime+startduration+scenarioSize*5;
        String won = (win)?"Не попался":"Попался";
        totalReward = (win)? totalReward + money: totalReward;
        int reward = (win)?money:0;
        System.out.printf("%nВы закончили миссию!%n%n%s%nУспешность: %s%n%nПродолжительность: %d секунд%n%nНаграда: %d$%n%nСумма всех наград: %d$%n",
                character, won,totalDuration, money, totalReward);
    }
}