package com.dk.humanproject;

public class Human {
	//================================
	  //  attributes
	//================================
	private String name;
    private int age;
    private int health = 100;
    private int wisdom = 3;
    private int strength = 3;
    private int dexterity = 3;
    
    //static attribute that belongs to the entire class;
    private static int allHumans = 0;

    
    
  //================================
  //  constructors
  //================================
    public Human() {}

    public Human(String name){
        this.name = name;
        allHumans ++;
    }
    public Human(String name, int age){
        this.name = name;
        this.age = age;
        allHumans ++;
    }
    public Human(String name, int age, int health, int wisdom, int strength, int dexterity) {
		this.name = name;
		this.age = age;
		this.health = health;
		this.wisdom = wisdom;
		this.strength = strength;
		this.dexterity = dexterity;
	}

  //================================
  //  methods
  //================================
    public void getPosioned(){
        this.health -= 5;
    }

    public void healthPot(){
        this.health = 100;
    }

    public void attack(Human foe){
        foe.setHealth(foe.health - this.strength);
    }

    public void eat(int calories){
        this.health += calories;
    }
    
    public void eat(){
        this.health += 5;
    }
    
    //================================
    //  getters & setters
    //================================
    public static int getAllHumans(){
        return allHumans;
    }
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getWisdom() {
		return wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
}
