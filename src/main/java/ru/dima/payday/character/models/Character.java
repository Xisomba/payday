package ru.dima.payday.character.models;

public class Character extends Human {
    public static int totalReward = 0;
    public Character(String name, int age, String nationality, String gender) {
        super(name, age, nationality, gender);
        }
    @Override
    public String toString() {
        return String.format("%nИмя: %s%nВозраст: %d%nНациональность: %s%nПол: %s%n", getName(), getAge(), getNationality(), getGender());
    }
}
