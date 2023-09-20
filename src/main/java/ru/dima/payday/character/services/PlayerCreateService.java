package ru.dima.payday.character.services;

import ru.dima.payday.character.models.Character;

import java.util.Scanner;

public class PlayerCreateService {
    public Character playerCreator(Scanner scanner) {
        System.out.println("Введите имя персонажа:");
        String characterName = scanner.nextLine();
        System.out.println("Возраст:");// при вводе не числа - цикл должен вернуть пользователя на ввод возраста
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Национальность:");
        String nationality = scanner.nextLine();
        System.out.println("Введите пол:");
        String gender = scanner.nextLine();
        Character character = new Character(characterName, age, nationality, gender);
        System.out.printf("Данные вашего персонажа%nИмя: %s %nВозраст: %d %nНациональность :%s%nПол: %s%n", character.getName(), character.getAge(), character.getNationality(), character.getGender());
        return character;
    }
}
