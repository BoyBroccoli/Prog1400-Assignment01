package inc;

public class Player {
    
    // INSTANCE VARIABLES
    private String playerName;
    private double playerGoals;
    private double playerAssists;
    private double playerTotal;

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

    public String setPlayerName(String name){
        return this.playerName = name;
    }

    public double setPlayerGoals(double goals){
        return this.playerGoals = goals;
    }

    public double setPlayerAssists(double assists){
        return this.playerAssists = assists;
    }

    public double setPlayerTotal(){
        return this.playerTotal = this.playerGoals + this.playerAssists;
    }
}
