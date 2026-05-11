package com.pluralsight;

public class ShowdownApp {
    public static void main(String[] args) {
        Person somePerson = new Person("Eric", 100, 100);
        Superhero someSuperhero = new Superhero("Super Eric", 150, 200);
        SuperViliian evilLovi = new SuperViliian("EvilLovi",100,500);

        System.out.println(somePerson.getStatus());
        System.out.println(someSuperhero.getStatus());
        System.out.println(evilLovi.getStatus());
    }

}
