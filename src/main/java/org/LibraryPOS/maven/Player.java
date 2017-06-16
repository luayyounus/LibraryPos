package org.LibraryPOS.maven;

/**
 * Created by luayghazwan on 6/16/17.
 */
public class Player extends Team {
    private String playerName, sportType;
    private int playerNumber, yearsOfExperience;

    Tennis tennis;

    //Default Constructor with Default Values
    public Player () {
        playerName = "Luay";
        playerNumber = 7;
        sportType = "Tennis";
        yearsOfExperience = 4;
    }

    //Another Constructor
    public Player (String playerName, int playerNumber, String sportType, int yearsOfExperience) {
        this.playerName = playerName;
        this.playerNumber = playerNumber;
        this.sportType = sportType;
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    void matchWith(Player newPlayer){
        System.out.println("Match started!");
    }

    @Override
    void matchPlan () {
        System.out.println("The plan is 4-3-3 defense for the first 30 mins.");
    }

    @Override
    public String toString() {
        return playerName + " | " + playerNumber + " | " + sportType + " | " + yearsOfExperience + " years of experience.";
    }
}
