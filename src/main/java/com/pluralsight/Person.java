package com.pluralsight;

public class Person {

    protected String name;
    protected int health;
    protected int experiencePoints;

    public Person(String name, int health, int experiencePoints) {
        this.name = name;
        this.health = health;
        this.experiencePoints = experiencePoints;
    }
    public boolean isAlive(){
        return this.health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public String getStatus(){
        return this.name + "has" + this.health + "health points";
    }
}
