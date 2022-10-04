package inc;

public class Team {

    // INSTANCE VARIABLES
    private String teamName;
    private double teamGoals;
    private double teamAssists;
    private double teamTotal;
    double teamBudget;
    String teamStars;

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

    public String setTeamName(String name){
        return this.teamName = name;
    }

    public double setTeamGoals(double goals){
        return this.teamGoals = goals;
    }

    public double setTeamAssists(double assists){
        return this.teamAssists = assists;
    }

    public double setTeamTotal(){
        return this.teamTotal = this.teamGoals + this.teamAssists;
    }

}
