package org.LibraryPOS.maven;

/**
 * Created by luayghazwan on 6/16/17.
 */
public abstract class Team implements League {
    private String teamName;
    private int teamSize;

    abstract void matchWith (Player player);
    abstract void matchPlan ();

    public void calculateScore () {
        System.out.println("Implement a score calculation for your Game!");
    }

    public String getTeamName(){
        return teamName;
    }

    public String leagueRules(){
        return "Make sure the green ball pass over the net when served.";
    }
    public String leagueType(){
        return "Gold";
    }
}
