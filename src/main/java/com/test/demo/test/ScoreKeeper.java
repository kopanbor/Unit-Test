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
    
    public void scoreTeamWIN1(){
        scoreTeamWIN += 1;
    }

    public void scoreTeamWIN2(){
        scoreTeamWIN += 2;
    }

    public void scoreTeamWIN3(){
        scoreTeamWIN += 3;
    }
    public void scoreTeamBWL1() {
        scoreTeamBWL += 1;
    }

    public void scoreTeamBWL2() {
        scoreTeamBWL += 2;
    }

    public void scoreTeamBWL3() {
        scoreTeamBWL += 3;
    }

}
