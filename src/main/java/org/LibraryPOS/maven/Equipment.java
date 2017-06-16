package org.LibraryPOS.maven;

/**
 * Created by luayghazwan on 6/16/17.
 */

public class Equipment extends Tennis {
    private int racquetsAvailable = 10;

    public Equipment () {
        super();
    }

    public void buyRacquet(int numberOfRacquets){
        if (racquetsAvailable > 0) {
            System.out.println("Thank you for purchasing this raquet!");
            racquetsAvailable -= 1;
            return;
        }
        System.out.println("No raquets available in store.");
    }

    public void addRacquets(int numberOfRacquets) {
        this.racquetsAvailable = numberOfRacquets;
    }
}
