package inc;
import java.util.Scanner;
import java.util.Random;
import static inc.Validation.validateInput; // importing created Validation method.

public class Team {
    private static final int NUMOFPLAYERS = 3;
    // INSTANCE VARIABLES
    private String teamName;
    private double teamGoals;
    private double teamAssists;
    private double teamTotal;
    private double teamBudget;
    private String teamStars;
    public Player[] teamPlayers; 


    // METHODS 
    public Team(){
        this.teamPlayers = new Player[4];
    }
    public void outputTeamDetails(){
        System.out.println(this.teamName + "\n ASSISTS: "+ this.teamAssists +
        "\n GOALS: "+ this.teamGoals + "\n TOTAL POINTS: "+this.teamTotal +
        "\n BUDGET: $" + this.getTeamBudget() + "\n RATING: " + this.teamStars);
    }


    // GETTERS
    public double getTeamGoals(){
        return this.teamGoals;
    }
    public double getTeamAssists(){
        return this.teamAssists;
    }
    public double getTeamTotal(){
        return this.teamTotal;
    }
    public String getTeamName(){
        return this.teamName;
    }
    public String getTeamBudget(){
        return String.format("%.2f", this.teamBudget);
    }
    public String getTeamStars(){
        return this.teamStars;
    }

    // SETTERS
    public void setTeamName(String name){
        this.teamName = name;
    }
    public void setTeamGoals(double goals){
        this.teamGoals += goals;
    }
    public void setTeamAssists(double assists){
        this.teamAssists += assists;
    }
    public void setTeamTotal(){
        this.teamTotal += this.teamGoals + this.teamAssists;
    }
    public void setTeamBudget(){
        Random random = new Random();
        int rangeMin = 0;
        int rangeMax = 100000;
        double teamBudget = rangeMin + (rangeMax - rangeMin) * random.nextDouble();
        this.teamBudget = teamBudget;
    }
    public void setTeamStars(){
        if (this.teamTotal > 20){
            this.teamStars = "*** stars";
        } else if (this.teamTotal >= 10) {
            this.teamStars = "** stars";
        } else {
            this.teamStars =" ";
        }
    }
    public static void setTeamInfo(Team currentTeam){
        Scanner scan = new Scanner(System.in);
        String currentTeamName = currentTeam.getTeamName();
        String userInput;
        int tempValue;

        for (int i = 0; i<NUMOFPLAYERS; i++){
            Player currentPlayer = currentTeam.teamPlayers[i];
            String currentPlayerName;
            System.out.println("Enter players for " + currentTeamName + ":\n");
            System.out.println("");
            
            System.out.println("Enter name for player # " + (i+1));
            userInput = scan.nextLine();
            currentPlayer.setPlayerName(userInput);
            currentPlayerName = currentPlayer.getPlayerName();
            System.out.println("");

            System.out.println("Enter number of goals for " + currentPlayerName);
            tempValue= validateInput();
            
            currentPlayer.setPlayerGoals(tempValue);
            currentTeam.setTeamGoals(tempValue);
            System.out.println("");

            System.out.println("Enter number of assists for " + currentPlayerName);
            tempValue = validateInput();

            currentPlayer.setPlayerAssists(tempValue);
            currentTeam.setTeamAssists(tempValue);

            currentPlayer.setPlayerTotal();
            currentTeam.setTeamTotal();
        }
    }
}
