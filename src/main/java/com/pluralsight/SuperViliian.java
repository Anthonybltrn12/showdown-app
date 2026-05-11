package com.pluralsight;

public class SuperViliian extends Person{
    public SuperViliian(String name, int health, int experiencePoints) {
        super(name, health, experiencePoints);
    }

    public int getEvilnessLevel(){
        return this.experiencePoints;
    }
}
