package project;

/**
 * Author: Terence Boyce
 * Project: CMSC 215 Intermediate Programming - Programming Project 1
 * Date: 8/22/23
 * Description: This class represents a basketball player with attributes name, height, and age.
 */
public class Player {
    private final String name;
    private final Height height;
    private final int age;
	

    public Player(String name, Height height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Height getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Player Name: " + name + ", Height: " + height + ", Age: " + age;
    }
}
