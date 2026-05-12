package com.pluralsight;

import java.util.Random;

public class Superhero extends Person {

    public Superhero(String name, int health, int experiencePoints) {

        super(name, health, experiencePoints);
    }

    public int getPowerLevel(){
        return this.experiencePoints;
    }

    @Override
    public void fight(Person opponent){
        //Generate a random number to figure out the base damage i am about to deliver to this opponent
        Random randomNumber = new Random();
        int baseDamage = randomNumber.nextInt(101); // this will give me a number between 0 and 100


        //lets take that base damage plus our experience points for the final damage
        int damage = baseDamage + this.getPowerLevel();

        //figure out how we want to deal that damage to the opponent
        if(baseDamage == 0){
            //if the base damage was 0 then we missed
            System.out.println(this.name + " swings heroically... but misses!");
        }else{
            System.out.println(this.getName() + " lands a heroic punch on " + opponent.getName() + " dealing " + damage + " total damage");
            //deal the damage if the base damage wasnt 0
            opponent.takeDamage(damage);
        }
    }



}
