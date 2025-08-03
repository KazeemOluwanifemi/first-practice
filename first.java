import java.util.ArrayList;
import java.util.Scanner;

public class first{
//    main method in the call stack
    public static void main(String[] args) {

//        Instantiate class object
        FileHandling dataOfGame = new FileHandling();
        FileHandling.gameData data = dataOfGame.new gameData();
//        create a list elements to store each list set

        ArrayList<String> homeTeams = data.getHomeTeam("questions.csv");
        ArrayList<String> visitingTeams = data.getVisitingTeam("questions.csv");
        ArrayList<Integer> homePoints = data.getHomePoints("questions.csv");
        ArrayList<Integer> visitingPoints = data.getVisitingPoints("questions.csv");

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the name of a team: ");
        String teamName = reader.nextLine();
        int noOfGamesPlayed = 0;
        int noOfGamesWon = 0;
//        int noOfGamesLost = 0;

        for(int i = 0; i < homeTeams.size(); i++){
            if(homeTeams.get(i).equals(teamName)){
                if(homePoints.get(i) > visitingPoints.get(i)){
                    noOfGamesWon = noOfGamesWon + 1;
                }
                noOfGamesPlayed = noOfGamesPlayed + 1;
            }
        }

        System.out.println("The number of games played by " + teamName + " is " + noOfGamesPlayed);
        System.out.println("The number of games won by " + teamName + " is " + noOfGamesWon);
    }
}