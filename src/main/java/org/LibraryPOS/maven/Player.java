package org.LibraryPOS.maven;

/**
 * Created by luayghazwan on 6/16/17.
 */
public class Player {
    private String playerName;
    private int playerNumber;
    private String sportType;
    private int yearsOfExperience;

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
}
