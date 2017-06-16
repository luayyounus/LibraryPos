package org.LibraryPOS.maven;

/**
 * Created by luayghazwan on 6/16/17.
 */
public class Tennis extends Sport {
    public Equipment equipment;
    public int result = 0;

    public SportType sportType;

    public Tennis() {
        super(SportType.Tennis);
    }

    public int getResult(){
        return result;
    }

    public int setScore(int score) {
        int result = 0;
        if (score == 15) {
            result += score;
            return result;
        } else if (score == 10) {
            result += score;
            return result;
        }
        System.out.println("Wring Entry");
        return 0;
    }
}
