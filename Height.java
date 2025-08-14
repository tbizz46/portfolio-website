package project;

/**
 * Author: Terence Boyce
 * Project: CMSC 215 Intermediate Programming - Programming Project 1
 * Date: 8/22/23
 * Description: This class represents the height of a basketball player.
 */
public class Height {
    private final int feet;
    private final int inches;

    public Height(int feet, int inches) {
        this.feet = feet + inches / 12;
        this.inches = inches % 12;
    }

    public int toInches() {
        return (feet * 12) + inches;
    }

    @Override
    public String toString() {
        return feet + "'" + inches + "\"";
    }
}
