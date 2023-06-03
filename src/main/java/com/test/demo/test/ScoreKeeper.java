package com.test.demo.test;

public class ScoreKeeper {
    private int scoreTeamWIN;
    private int scoreTeamBWL;

    public ScoreKeeper(){
        scoreTeamWIN = 0;
        scoreTeamBWL = 0;
    };

    public String getScore() {
        return String.format("%03d:%03d", scoreTeamWIN, scoreTeamBWL);
    }
    
}
