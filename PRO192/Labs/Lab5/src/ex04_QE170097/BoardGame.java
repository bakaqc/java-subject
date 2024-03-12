package ex04_QE170097;

public class BoardGame extends Game {

    private double minimumplayer;
    private double maximumplayer;
    private boolean timelimit;

    public BoardGame(String description) {
        super(description);
    }

    public BoardGame(String description, double minimumplayer, double maximumplayer, boolean timelimit) {
        super(description);
        this.minimumplayer = minimumplayer;
        this.maximumplayer = maximumplayer;
        this.timelimit = timelimit;
    }

    @Override
    public String toString() {
        return super.toString() +  ", minimumplayer = " + this.minimumplayer + ", maximumplayer = " + this.maximumplayer + ", timelimit: " + (this.timelimit? "Yes" : "No");
    }
    
    
    
}


