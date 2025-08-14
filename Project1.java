package project;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Author: Terence Boyce
 * Project: CMSC 215 Intermediate Programming - Programming Project 1
 * Date: 8/22/23
 * Description: This class manages the input of player data and computes the required results.
 */
public class Project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Player> players = new ArrayList<>();
        int totalAge = 0;

        while (true) {
            System.out.println("Enter player's name (or 'exit' to stop): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Enter player's height (feet): ");
            int feet = scanner.nextInt();

            System.out.println("Enter player's height (inches): ");
            int inches = scanner.nextInt();

            System.out.println("Enter player's age: ");
            int age = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            players.add(new Player(name, new Height(feet, inches), age));
            totalAge += age;
        }

        double averageAge = (double) totalAge / players.size();
        System.out.println("Average age of all players: " + averageAge);

        Player tallestPlayer = null;
        for (Player player : players) {
            if (player.getAge() <= averageAge) {
                if (tallestPlayer == null || player.getHeight().toInches() > tallestPlayer.getHeight().toInches()) {
                    tallestPlayer = player;
                }
            }
        }

        if (tallestPlayer != null) {
            System.out.println("Tallest player with age less than or equal to average: " + tallestPlayer);
        } else {
            System.out.println("No player found with age less than or equal to average.");
        }
    }
}
