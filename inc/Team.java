package inc;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import inc.Player;
import java.util.Arrays;

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
        System.out.println(this.teamName + " Assists: "+ this.teamAssists +" Goals: "+ this.teamGoals + " Total Points: "+this.teamTotal);
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

    public double getTeamBudget(){
        return this.teamBudget;
    }

    public String getTeamStars(){
        if (this.teamTotal > 20){
            this.teamStars = "***";
        } else if (this.teamTotal >= 10) {
            this.teamStars = "**";
        } else {
            this.teamStars =" ";
        }
        return this.teamStars;
    }

    // SETTERS

    public void setTeamName(String name){
        this.teamName = name;
    }

    public void setTeamGoals(double goals){
        this.teamGoals = goals;
    }

    public void setTeamAssists(double assists){
        this.teamAssists = assists;
    }

    public void setTeamTotal(){
        this.teamTotal = this.teamGoals + this.teamAssists;
    }

   

    

}
