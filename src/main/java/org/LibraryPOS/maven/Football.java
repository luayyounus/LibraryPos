package org.LibraryPOS.maven;

/**
 * Created by luayghazwan on 6/16/17.
 */
public class Football extends Sport {
    public int result = 0;

    public Football() {
        super(SportType.Football);
    }

    public int getResult(){
        return result;
    }

    public int setScore(int score) {
        if (score == 1) {
            result += score;
            return result;
        }
        System.out.println("Wring Entry");
        return 0;
    }

    public String sportName(){
        return "Football";
    }
}
