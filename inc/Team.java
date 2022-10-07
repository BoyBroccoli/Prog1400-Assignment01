package inc;

public class Team {

    // INSTANCE VARIABLES
    private String teamName;
    private double teamGoals;
    private double teamAssists;
    private double teamTotal;
    double teamBudget;
    String teamStars;
    private Player[]; // fix this.

    // METHODS 

    public void outputTeamDetails(){

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
