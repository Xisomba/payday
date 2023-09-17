package ru.dima.payday.character;

public class Human {
    private String name;
    private int age;
    private String nationality;
    private String gender;

    public Human(String name, int age, String nationality, String gender) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.gender = gender;
    }

    public Human() {
    }

    public  String getName() {
        return name;

    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public String getGender() {
        return gender;
    }

}
