package org.LibraryPOS.maven;

/**
 * Created by luayghazwan on 6/16/17.
 */
public abstract class Team {
    abstract void matchWith (String teamName);

    private void matchPlan () {
        System.out.println("Make a plan for this match to win the game.");
    }

    public void calculateScore () {
        System.out.println("Implement a score calculation for your Game!");
    }
}
