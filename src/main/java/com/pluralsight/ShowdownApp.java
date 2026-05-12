package com.pluralsight;

public class ShowdownApp {
    public static void main(String[] args) {
        Person anthony = new Person("Eric", 100, 100);
        Superhero batman = new Superhero("Batman", 200, 50);
        SuperViliian joker = new SuperViliian("Joker", 200, 65);


        while(batman.isAlive() && joker.isAlive()){
            batman.fight(joker);
            System.out.println(batman.getStatus());
            System.out.println(joker.getStatus());
            joker.fight(batman);
            System.out.println(batman.getStatus());
            System.out.println(joker.getStatus());
        }
        if(batman.isAlive()){
            System.out.println(batman.getName() + "has whooped butt");
        }
        if(joker.isAlive()){
            System.out.println(joker.getName() + "has whooped butt");
        }

    }

}
