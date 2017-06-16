package org.LibraryPOS.maven;

/**
 * Created by luayghazwan on 6/16/17.
 */
public class SportFactory {

    public Sport pickSport(SportType sportType) {
        if (sportType == null) {
            return  null;
        }
        switch (sportType) {
            case Tennis: return new Tennis();
            case Football: return new Football();
        }
        return null;
    }
}
