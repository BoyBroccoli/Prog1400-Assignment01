import inc.*;
import java.util.Scanner;
import static inc.Team.setTeamInfo;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // declaring scanner object

        // DECLARING VARIABLES
        String userInput;
        
        // DECLARING ARRAY OBJECTS FOR TEAM
        Team team1 = new Team();
        Team team2 = new Team();
        Team team3 = new Team();
        Team[] fantasyTeams = {team1, team2, team3};


        // For loop to set Player objects into Teams Player[] object array
        for (int i = 0; i < NUMOFTEAMS; i++){
             Team currentTeam = fantasyTeams[i];
             currentTeam.setTeamBudget();
             for(int j = 0; j< NUMOFPLAYERS; j++){
                currentTeam.teamPlayers[j] = new Player();
             }
        }
      
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

       
        // For loop for setting up a Teams Player info
        System.out.println(playerEntryHeader);
        System.out.println(longLine);

        for (int i = 0; i< NUMOFTEAMS; i++){
            Team currentTeam = fantasyTeams[i];
            setTeamInfo(currentTeam);
            currentTeam.setTeamStars();
        }
        

        // Displaying Team Report
        System.out.println(teamReportHeader);
        System.out.println(longLine);
        for(int i = 0; i< NUMOFTEAMS; i++){
            Team currentTeam = fantasyTeams[i];
            currentTeam.outputTeamDetails();
            System.out.println("\n");
        }

        // Displaying Player Report
        System.out.println("\n");
        System.out.println(playerReportHeader);
        System.out.println(longLine);

        // Nested for loop for to print current Team and its player stats
        for (int i = 0; i<NUMOFTEAMS; i++){
            Team currentTeam = fantasyTeams[i];
            for (int j= 0; j< NUMOFPLAYERS; j++){
                System.out.println(currentTeam.getTeamName());
                Player currentPlayer = currentTeam.teamPlayers[j];
                currentPlayer.outputPlayerDetails();
                System.out.println("\n");
            }
        }
        scan.close();
    } 


// DECLARING CONSTANT
private static final int NUMOFTEAMS = 3;
private static final int NUMOFPLAYERS = 3;

    // DECLARING AND INITIALIZING Headers
    private static String greetingHeader = "FANTASY HOCKEY APPLICATION\n";
    private static String teamEntryHeader = "TEAM ENTRY\n";
    private static String playerEntryHeader = "PLAYER ENTRY\n";
    private static String teamReportHeader = "REPORT: Stats per Team\n";
    private static String playerReportHeader = "REPORT: Stats per Player\n";
    private static String longLine = "=======================================\n";
}
