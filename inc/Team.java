package inc;
import java.util.Scanner;
import inc.Player;
import java.util.Random;
import java.text.DecimalFormat;


public class Team {

    // INSTANCE VARIABLES
    private String teamName;
    private double teamGoals;
    private double teamAssists;
    private double teamTotal;
    double teamBudget;
    String teamStars;
    public Player[] teamPlayers; 

    // METHODS 

    public Team(){
        this.teamPlayers = new Player[4];
    }

    public void outputTeamDetails(){
        System.out.println(this.teamName + " Assists: "+ this.teamAssists +
        " Goals: "+ this.teamGoals + " Total Points: "+this.teamTotal +
        " Budget : $" + this.getTeamBudget() + " Rating: " + this.teamStars);
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
        Scanner scan = new Scanner(System.in);
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
        double teamBudget = random.nextDouble(100000);
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

    public static final DecimalFormat decilForm = new DecimalFormat("0.00");
   

    

}
