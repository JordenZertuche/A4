package edu.guilford;

public class PlayerData {
    // Using the data from the PlayerData.csv file, create a Player class that has
    // the following attributes:
    // PlayerID,FirstName,LastName,Position,HeightInches,SpeedMph,GamesPlayed,GamesStarted
    // Make sure that you have getters and setters for each attribute.
    // Make sure that you have a toString method that prints out all of the
    // attributes.
    // create a constructor that can be used to instantiate an object with
    // reasonable random values for the attributes.

    private int playerID;
    private String firstName;
    private String lastName;
    private String position;
    private int heightInches;
    private int speedMph;
    private int gamesPlayed;
    private int gamesStarted;

    public PlayerData() {
        this.playerID = 0;
        this.firstName = "firstName";
        this.lastName = "lastName";
        this.position = "position";
        this.heightInches = 72;
        this.speedMph = 4;
        this.gamesPlayed = 0;
        this.gamesStarted = 0;
    }

    public PlayerData(int playerID, String firstName, String lastName, String position, int heightInches, int speedMph,
            int gamesPlayed, int gamesStarted) {
        this.playerID = playerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.heightInches = heightInches;
        this.speedMph = speedMph;
        this.gamesPlayed = gamesPlayed;
        this.gamesStarted = gamesStarted;
    }
    

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        if (playerID > 0) {
            this.playerID = playerID;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() > 0) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 0) {
            this.lastName = lastName;
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position.length() > 0) {
            this.position = position;
        }
    }

    public int getHeightInches() {
        return heightInches;
    }

    public void setHeightInches(int heightInches) {
        if (heightInches > 0) {
            this.heightInches = heightInches;
        }
    }

    public int getSpeedMph() {
        return speedMph;
    }

    public void setSpeedMph(int speedMph) {
        if (speedMph > 0) {
            this.speedMph = speedMph;
        }
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        if (gamesPlayed > 0) {
            this.gamesPlayed = gamesPlayed;
        }
    }

    public int getGamesStarted() {
        return gamesStarted;
    }

    public void setGamesStarted(int gamesStarted) {
        if (gamesStarted > 0) {
            this.gamesStarted = gamesStarted;
        }
    }

    @Override
    public String toString() {
        return "PlayerData{" +
                "playerID=" + playerID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", heightInches=" + heightInches +
                ", speedMph=" + speedMph +
                ", gamesPlayed=" + gamesPlayed +
                ", gamesStarted=" + gamesStarted +
                '}';
    }

    //create a method that will sort an array of PlayerData objects by playerID
    public static void sortPlayerData(PlayerData[] array) {
        //lets use a bubble sort
        //lets create a boolean variable to keep track of whether or not we have swapped any elements
        boolean swapped = true;
        //lets create a while loop that will continue to run as long as swapped is true
        while (swapped) {
            //lets set swapped to false
            swapped = false;
            //lets create a for loop that will iterate through the array
            for (int i = 0; i < array.length - 1; i++) {
                //lets create an if statement that will check if the playerID of the current element is greater than the playerID of the next element
                if (array[i].getPlayerID() > array[i + 1].getPlayerID()) {
                    //lets call the swap method to swap the two elements
                    swap(array, i, i + 1);
                    //lets set swapped to true
                    swapped = true;
                }
            }
        }
    }


    //lets create a method that swaps two elements in an array
    private static void swap(int[] array, int i, int j) {
        // create a temporary variable to hold the value of array[i]
        int temp = array[i];
        // set array[i] to the value of array[j]
        array[i] = array[j];
        // set array[j] to the value of the temporary variable
        array[j] = temp;
    }

    public static PlayerData[] readPlayerData(String string) {
        return new PlayerData[0];
    }

}
