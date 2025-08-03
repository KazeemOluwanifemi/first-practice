import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class FileHandling {
    class gameData{
        Scanner reader = new Scanner(System.in);

        String homeTeam;
        String visitingTeam;
        int homePoint;
        int visitingPoint;

//        method for getting home team names
        ArrayList<String> getHomeTeam(String filename){
            ArrayList<String> homeTeams = new ArrayList<>();

            try (Scanner reader = new Scanner(Paths.get(filename))) {
                while (reader.hasNextLine()) {
                    String line = reader.nextLine();

                    String[] parts = line.split(",");
                    homeTeam = parts[0];

                    homeTeams.add(homeTeam);;
                }
            }
            catch(IOException e){
                System.out.println("Error while handling file: " + filename);
            }

            return homeTeams;
        }

        ArrayList<String> getVisitingTeam(String filename){
            ArrayList<String> visitingTeams = new ArrayList<>();

            try(Scanner reader = new Scanner(Paths.get(filename))){
                while (reader.hasNextLine()){
                    String line = reader.nextLine();

                    String[] parts = line.split(",");
                    visitingTeam = parts[1];

                    visitingTeams.add(visitingTeam);
                }
            }
            catch(IOException e){
                System.out.println("Error while handling file: " + filename);
            }
            return visitingTeams;
        }

        ArrayList<Integer> getHomePoints(String filename){
            ArrayList<Integer> homePoints = new ArrayList<>();

            try(Scanner reader = new Scanner(Paths.get(filename))){
                while (reader.hasNextLine()) {
                    String line = reader.nextLine();

                    String[] parts = line.split(",");

                    homePoint = Integer.parseInt(parts[2]);

                    homePoints.add(homePoint);
                }
            }
            catch(IOException e){
                System.out.println("Error while handling file: " + filename);
            }
            return homePoints;
        }

        ArrayList<Integer> getVisitingPoints(String filename){
            ArrayList<Integer> visitingPoints = new ArrayList<>();

            try(Scanner reader = new Scanner(Paths.get(filename))){
                while (reader.hasNextLine()) {
                    String line = reader.nextLine();

                    String[] parts = line.split(",");

                    visitingPoint = Integer.parseInt(parts[3]);

                    visitingPoints.add(visitingPoint);
                }
            }
            catch(IOException e){
                System.out.println("Error while handling file: " + filename);
            }
            return visitingPoints;
        }
    }
}
