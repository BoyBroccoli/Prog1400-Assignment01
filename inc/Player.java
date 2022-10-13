package inc;

import java.util.Scanner;

public class Player {
    
    // INSTANCE VARIABLES
    private String playerName;
    private int playerGoals;
    private int playerAssists;
    private int playerTotal;

    // METHODS 

    public void outputPlayerDetails(){

    }

    // GETTERS

    public double getPlayerGoals(){
        return this.playerGoals;
    }

    public double getPlayerAssists(){
        return this.playerAssists;
    }

    public double getPlayerTotal(){
        return this.playerTotal;
    }

    public String getPlayerName(){
        return this.playerName;
    }



    // SETTERS

    public void setPlayerName(String name){
        this.playerName = name;
    }

    public void setPlayerGoals(int goals){
        this.playerGoals = goals;
    }

    public void setPlayerAssists(int assists){
        this.playerAssists = assists;
    }

    public void setPlayerTotal(){
        this.playerTotal = this.playerGoals + this.playerAssists;
    }
}
