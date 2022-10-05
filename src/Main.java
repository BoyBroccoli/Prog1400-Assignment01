import inc.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // declaring scanner object

        // DECLARING VARIABLES
        String userInput;
        String currentTeamName;
        double userPointsInput;
        
        // DECLARING BOOLEANS
        boolean validInput = false, validName = false, validGoals = false, validAssists = false;
        

        // DECLARING ARRAY OBJECTS FOR TEAM
        Team team1 = new Team();
        Team team2 = new Team();
        Team team3 = new Team();
        Team[] fantasyTeams = {team1, team2, team3};
        
        // MUST BE A BETTER WAY//
        // DECLARING ARRAY OBJECTS FOR PLAYERS
        Player currentPlayer;
        Player player1= new Player(); 
        Player player2= new Player();
        Player player3= new Player(); 
        Player player4= new Player(); 
        Player player5= new Player();
        Player player6= new Player(); 
        Player player7= new Player(); 
        Player player8= new Player(); 
        Player player9 = new Player();
        Player player10 = new Player();
        Player player11 = new Player();
        Player player12 = new Player();
        // Player[] fantasyPlayers ={player1, player2, player3, player4, 
        //     player5, player6, player7, player8, 
        //     player9, player10, player11, player12}; 
        Player[] playersTeam1 = {player1, player2, player3, player4};
        Player[] playersTeam2 = {player5, player6, player7, player8};
        Player[] playersTeam3 = {player9, player10, player11, player12};
        

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
            userInput= currentTeam.setTeamName(scan.nextLine());
            System.out.println("\n");
        }

        
        // for loop for player entry

        System.out.println(playerEntryHeader);
        System.out.println(longLine);
        
        // MUST FIX VALIDATION (WONT EXIT FOR LOOP)//
        //SHOULD CREATE A FUNCTION//
        // For Team1 players1-4
        for (int i = 0; i< playersTeam1.length; i++){
            while (validInput == false){
                currentTeamName = fantasyTeams[0].getTeamName();
                currentPlayer = playersTeam1[i];
                System.out.println("Enter players for " + currentTeamName + ":\n");

                System.out.println("Enter name for player # " + (i+1)+":");
                if(scan.hasNextLine()){
                    validName = true;
                    userInput = currentPlayer.setPlayerName(scan.nextLine());
                    while(validName){
                        
                        System.out.println("Enter number of goals for " + currentPlayer.getPlayerName() + ":");
                        if(scan.hasNextDouble()) {
                            validGoals = true;
                            userPointsInput = currentPlayer.setPlayerGoals(scan.nextDouble());
                            while(validGoals){

                                System.out.println("Enter number of assists for " + currentPlayer.getPlayerName() + ":");
                                if (scan.hasNextDouble()){
                                    validAssists = true;
                                    validInput = true;
                                    while(validInput){
                                        userPointsInput = currentPlayer.setPlayerAssists(scan.nextDouble());
                                        currentPlayer.setPlayerTotal();
                                        validAssists = false;
                                        validGoals = false;
                                        validName = false;
                                        validInput = false;
                                    }
                                    
                                }else {
                                    System.out.println("Please enter a whole or decimal number.\n");
                                    scan.nextLine();
                                    validAssists = false;
                                }
                            }                         
                        } else {
                            System.out.println("Please enter a whole or decimal number.\n");
                            scan.nextLine();
                            validGoals = false;
                        }
                    }           
                } else {
                    System.out.println("Please enter a name with characters.\n");
                    scan.nextLine();
                    validName = false;
                }            
            } 
        }


        // For Team2 players5-8
        for (int i = 0; i< playersTeam2.length; i++){
            currentTeamName = fantasyTeams[1].getTeamName();
            currentPlayer = playersTeam1[i];
            System.out.println("Enter players for " + currentTeamName + ":\n");
            
            System.out.println("Enter name for player # " + (i+1)+":");
            userInput = currentPlayer.setPlayerName(scan.nextLine());

            System.out.println("Enter name for player # " + (i+1)+":");
            userInput = currentPlayer.setPlayerName(scan.nextLine());

            System.out.println("Enter number of goals for " + currentPlayer.getPlayerName() + ":");
            userPointsInput = currentPlayer.setPlayerGoals(scan.nextDouble());

            System.out.println("Enter number of assists for " + currentPlayer.getPlayerName() + ":");
            userPointsInput = currentPlayer.setPlayerAssists(scan.nextDouble());
            currentPlayer.setPlayerTotal();
            System.out.println("\n");
            scan.nextLine();
        }

        // For Team3 players9-12
        for (int i = 0; i< playersTeam3.length; i++){
            currentTeamName = fantasyTeams[2].getTeamName();
            currentPlayer = playersTeam1[i];
            System.out.println("Enter players for " + currentTeamName + ":\n");
            
            System.out.println("Enter name for player # " + (i+1)+":");
            userInput = currentPlayer.setPlayerName(scan.nextLine());

            System.out.println("Enter name for player # " + (i+1)+":");
            userInput = currentPlayer.setPlayerName(scan.nextLine());

            System.out.println("Enter number of goals for " + currentPlayer.getPlayerName() + ":");
            userPointsInput = currentPlayer.setPlayerGoals(scan.nextDouble());

            System.out.println("Enter number of assists for " + currentPlayer.getPlayerName() + ":");
            userPointsInput = currentPlayer.setPlayerAssists(scan.nextDouble());
            currentPlayer.setPlayerTotal();
            System.out.println("\n");
            scan.nextLine();
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