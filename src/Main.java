import inc.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // declaring scanner object

        // DECLARING VARIABLES
        String userInput;
        int tempValue;
        
        // DECLARING BOOLEANS
        boolean validInput = false;

        // DECLARING ARRAY OBJECTS FOR TEAM
        Team team1 = new Team();
        Team team2 = new Team();
        Team team3 = new Team();
        Team[] fantasyTeams = {team1, team2, team3};

        for (int i = 0; i < NUMOFTEAMS; i++){
             Team currentTeam = fantasyTeams[i];
             for(int j = 0; j< NUMOFPLAYERS; j++){
                currentTeam.teamPlayers[j] = new Player();
             }
             
        }
        

   
        

        // DECLARING AND INITIALIZING Headers
        String greetingHeader = "FANTASY HOCKEY APPLICATION\n";
        String teamEntryHeader = "TEAM ENTRY\n";
        String playerEntryHeader = "PLAYER ENTRY\n";
        String teamReportHeader = "REPORT: Stats per Team\n";
        String playerReportHeader = "REPORT: Stats per Player\n";
        String longLine = "=======================================\n";

        // Initializing Program
        System.out.println(greetingHeader);
        System.out.println(teamEntryHeader);
        System.out.println(longLine);

        // For loop to get team names
        for(int i = 0; i < NUMOFTEAMS; i++){
            System.out.println("Enter name for team # "+ (i+1) +":");
            Team currentTeam = fantasyTeams[i];
            userInput = scan.nextLine();
            currentTeam.setTeamName(userInput);
            System.out.println("\n");
        }

        // TEST: PRINTING TEAM NAMES -- will erase
        for (int i = 0; i < fantasyTeams.length; i++){
            String currentTeamName = fantasyTeams[i].getTeamName();
            System.out.println(currentTeamName);
        }

        
        // for loop for player entry

        System.out.println(playerEntryHeader);
        System.out.println(longLine);
        
        // Setting player names for the teams.
        for (int i = 0; i< fantasyTeams.length; i++){
            String currentTeamName = fantasyTeams[i].getTeamName();
            for (int j = 0; j<NUMOFPLAYERS; j++){
                Player currentPlayer = fantasyTeams[i].teamPlayers[j];
                System.out.println("Enter players for " + currentTeamName + ":\n");
                
                System.out.println("Enter name for player # " + (j+1)+":");
                userInput = scan.nextLine();
                currentPlayer.setPlayerName(userInput);

                System.out.println("Enter number of goals for " + currentPlayer.getPlayerName());
                tempValue = scan.nextInt();
                currentPlayer.setPlayerGoals(tempValue);

                System.out.println("Enter number of assists for " + currentPlayer.getPlayerName());
                tempValue = scan.nextInt();
                currentPlayer.setPlayerAssists(tempValue);

                currentPlayer.setPlayerTotal();
                
            }
           
            System.out.println("\n");
        } 

    } 


// DECLARING CONSTANT
private static final int NUMOFTEAMS = 3;
private static final int NUMOFPLAYERS = 4;

    public String printLongLine(){
        String longLine = "====================";
        return longLine;
    }
}
