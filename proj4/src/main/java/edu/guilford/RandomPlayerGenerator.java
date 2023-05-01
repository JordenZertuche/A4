package edu.guilford;

public class RandomPlayerGenerator {
    public static Player[] generateRlayer(int numPlayers) {
        Player[] Players = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            Players[i] = new Player();
        }
        return Players;
    }

    public static Player[] generateRPlayer(int numPlayers) {
        return null;
    }
}



