package edu.guilford;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Player {
    // attributes for a Football Player
    private String name;
    private int age;
    private String position;
    private String team;
    private double height;
    private double weight;
    private int number;
    private String yearsPro;
    private double salary;

    // constructor
    public Player() {
        Random rand = new Random();

        // Generate random values for each attribute
        this.name = generateRandomName();
        this.age = rand.nextInt(100) + 1; // generates a random number between 1 and 100
        this.position = generateRandomPosition();
        this.team = generateRandomTeam();
        this.height = rand.nextDouble() * 4.0; // generates a random floating-point number between 0.0 and 4.0
        this.weight = rand.nextDouble() * 300.0; // generates a random floating-point number between 0.0 and 300.0
        this.number = rand.nextInt(100) + 1; // generates a random number between 1 and 100
        this.yearsPro = generateRandomYear();
        this.salary = rand.nextInt(1000000); // generates a random integer between 0 and 1000000
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        } else {
            System.out.println("Invalid name");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (position.length() > 0) {
            this.position = position;
        } else {
            System.out.println("Invalid position");
        }
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        if (team.length() > 0) {
            this.team = team;
        } else {
            System.out.println("Invalid team");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0.0) {
            this.height = height;
        } else {
            System.out.println("Invalid height");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0.0) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight");
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number > 0) {
            this.number = number;
        } else {
            System.out.println("Invalid number");
        }
    }

    public String getYearsPro() {
        return yearsPro;
    }

    public void setYearsPro(String yearsPro) {
        if (yearsPro.length() > 0) {
            this.yearsPro = yearsPro;
        } else {
            System.out.println("Invalid yearsPro");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0.0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }



   

    // toString method
    @Override
    public String toString() {
        return "Player [name=" + name + ", age=" + age + ", position=" + position + ", team=" + team + ", height="
                + height + ", weight=" + weight + ", number=" + number + ", yearsPro=" + yearsPro + ", salary="
                + salary + "]";

    }

    private String generateRandomName() {
        String[] firstNames = { "Jaqan", "Bob", "Charlie", "David", "", "Frank", "Grace", "Heidi", "Ivan", "Judy" };
        String[] lastNames = { "Smith", "Johnson", "Brown", "Garcia", "Davis", "Wilson", "Miller", "Jones", "Taylor",
                "Clark" };
        Random rand = new Random();
        String firstName = firstNames[rand.nextInt(firstNames.length)];
        String lastName = lastNames[rand.nextInt(lastNames.length)];
        return firstName + " " + lastName;
    }

    private String generateRandomPosition() { //in order to acess this I had to run it through a student method
        String[] positions = { "QB", "RB", "WR", "TE", "OL", "DL", "LB", "CB", "S", "K" };
        Random rand = new Random();
        return positions[rand.nextInt(positions.length)];
    }

    private String generateRandomTeam() {
        String[] teams = { "Patriots", "Bills", "Jets", "Dolphins", "Ravens", "Bengals", "Browns", "Steelers", "Texans",
                "Colts", "Jaguars", "Titans", "Broncos", "Chiefs", "Raiders", "Chargers", "Cowboys", "Giants",
                "Eagles", "Redskins", "Bears", "Lions", "Packers", "Vikings", "Falcons", "Panthers", "Saints",
                "Buccaneers", "Cardinals", "Rams", "49ers", "Seahawks" };
        Random rand = new Random();
        return teams[rand.nextInt(teams.length)];
    }

    private String generateRandomYear() {
        String[] years = { "Rookie", "1st Year", "2nd Year", "3rd Year", "4th Year", "5th Year", "6th Year",
                "7th Year", "8th Year", "9th Year", "10th Year", "11th Year", "12th Year", "13th Year", "14th Year",
                "15th Year", "16th Year", "17th Year", "18th Year", "19th Year", "20th Year" };
        Random rand = new Random();
        return years[rand.nextInt(years.length)];
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of random Players to generate: ");
            int numPlayers = scanner.nextInt();

            // Generate an array of random Player objects
            Player[] Players = RandomPlayerGenerator.generateRlayer(numPlayers);

            // Display the unsorted array of Player objects
            System.out.println("Unsorted Players:");
            for (Player Player : Players) {
                System.out.println(Player);
            }

            // Sort the array of Player objects by Position using selection sort
            selectionSortBy(Players);

            // Display the sorted array of Player objects
            System.out.println("\nSorted Players by Position (selection sort):");

            // Shuffle the array of Player objects
            shuffleArray(Players);

            // Sort the array of Player objects by h using merge sort
            mergeSortByPosition(Players);

            // Display the sorted array of Player objects
            System.out.println("\nSorted Players by Position (merge sort):");
            for (Player Player : Players) {
                System.out.println(Player);
            }

            // Search for a Player by name using sequential search
            System.out.print("Enter the name of the Player to search for: ");
            scanner.nextLine(); // consume newline character
            String name = scanner.nextLine();
            int index = sequentialSearchByName(Players, name);
            if (index != -1) {
                System.out.println("Found " + Players[index] + " at index " + index + " using sequential search.");
            } else {
                System.out.println("Unable to find " + name);
            }
            System.out.print("Enter the age of the Player to search for: ");
            int age = scanner.nextInt();
            index = binarySearchByAge(Players, age);
            if (index != -1) {
                System.out.println("Found " + Players[index] + " at index " + index + " using binary search.");
            } else {
                System.out.println("Unable to find a Player with age " + age);
            }
        }
    }

    // Sorting algorithms

    // Selection sort

    public static void selectionSortBy(Player[] Players) {
        for (int i = 0; i < Players.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < Players.length; j++) {
                if (Players[j].getPosition().compareTo(Players[minIndex].getPosition()) < 0) {
                    minIndex = j;
                }
            }
            Player temp = Players[i];
            Players[i] = Players[minIndex];
            Players[minIndex] = temp;
        }
    }

    // Merge sort

    public static void mergeSortByPosition(Player[] Players) {
        mergeSortByPosition(Players, 0, Players.length - 1);
    }

    private static void mergeSortByPosition(Player[] Players, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSortByPosition(Players, start, mid);
            mergeSortByPosition(Players, mid + 1, end);
            mergeByPosition(Players, start, mid, end);
        }
    }

    private static void mergeByPosition(Player[] Players, int start, int mid, int end) {
        Player[] temp = new Player[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (Players[i].getPosition().compareTo(Players[j].getPosition()) < 0) {
                temp[k] = Players[i];
                i++;
            } else {
                temp[k] = Players[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = Players[i];
            i++;
            k++;
        }
        while (j <= end) {
            temp[k] = Players[j];
            j++;
            k++;
        }
        for (int x = 0; x < temp.length; x++) {
            Players[start + x] = temp[x];
        }
    }

    // Searching algorithms

    // Sequential search

    public static int sequentialSearchByName(Player[] Players, String name) {
        for (int i = 0; i < Players.length; i++) {
            if (Players[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    // Binary search

    public static int binarySearchByAge(Player[] Players, int age) {
        return binarySearchByAge(Players, age, 0, Players.length - 1);
    }

    private static int binarySearchByAge(Player[] Players, int age, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (Players[mid].getAge() == age) {
                return mid;
            } else if (Players[mid].getAge() < age) {
                return binarySearchByAge(Players, age, mid + 1, end);
            } else {
                return binarySearchByAge(Players, age, start, mid - 1);
            }
        }
        return -1;
    }

    


    // Other helper methods
    public static void shuffleArray(Player[] Players) {
        Random rand = new Random();
        for (int i = Players.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Player temp = Players[i];
            Players[i] = Players[j];
            Players[j] = temp;
        }
    }
}