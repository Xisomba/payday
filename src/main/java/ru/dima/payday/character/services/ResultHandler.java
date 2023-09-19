package ru.dima.payday.character.services;

import ru.dima.payday.character.models.Character;
import ru.dima.payday.character.models.Robbery;

import static ru.dima.payday.character.models.Character.totalReward;
public class ResultHandler {
    public  void resultOutput(Character character, boolean result, Robbery selectedRobbery, long startTime, long endTime){
        long totalDuration = (endTime - startTime)/1000 ;
        String won = result?"Красава!Пошел нахуй!":"Шерсть ебаная, под шконкой";
        totalReward = result? totalReward + selectedRobbery.getReward(): totalReward;
        int reward = result?selectedRobbery.getReward():0;
        System.out.printf("%nВы закончили миссию!%n%n%s%nУспешность: %s%n%nПродолжительность: %d секунд%n%nНаграда: %d$%n%nСумма всех наград: %d$%n",
                character, won,totalDuration, reward, totalReward);
    }
}