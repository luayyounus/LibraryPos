package org.LibraryPOS.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        SportFactory sportFactory;

        Equipment equipment = new Equipment();
        equipment.addRacquets(5);

        Player player1 = new Player("Ronaldo", 6, "Tennis", 10);
        Player player2 = new Player("Luay", 7, "Tennis",3);

        player1.matchWith(player2);

        player1.tennis.setScore(15);
        player2.tennis.setScore(15);

        player1.tennis.getResult();
    }
}
