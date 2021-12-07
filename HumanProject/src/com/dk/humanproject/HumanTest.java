package com.dk.humanproject;

public class HumanTest {

	public static void main(String[] args) {
		Human sbeve = new Human ("Sbeve Tyler", 37);
        Human rafaelangelo = new Human("Rafaelangelo Turtle", 22);
        Human bobothy = new Human("Bobothy Jones", 45);

        System.out.println(sbeve.getName() + " " + sbeve.getHealth());
        System.out.println(rafaelangelo.getName() + " " + rafaelangelo.getHealth());
        System.out.println(bobothy.getName() + " " + bobothy.getHealth());

        System.out.println("The Number of Humans is " + Human.getAllHumans());
        sbeve.eat();
        System.out.println(sbeve.getName() + " " + sbeve.getHealth());

        rafaelangelo.attack(sbeve);
        System.out.println(sbeve.getHealth());

	}

}
