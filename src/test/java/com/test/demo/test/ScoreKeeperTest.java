package com.test.demo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScoreKeeperTest {
    private ScoreKeeper scoreKeeper;

    @BeforeEach
    public void setUp() {
        scoreKeeper = new ScoreKeeper();
    }

    @Test
    public void testInitalScore() {
        scoreKeeper = new ScoreKeeper();
        assertEquals("000:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamWIN1() {
        scoreKeeper.scoreTeamWIN1();
        assertEquals("001:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamWIN2() {
        scoreKeeper.scoreTeamWIN2();
        assertEquals("002:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamWIN3() {
        scoreKeeper.scoreTeamWIN3();
        assertEquals("003:000", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamBWL1() {
        scoreKeeper.scoreTeamBWL1();
        assertEquals("000:001", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamBWL2() {
        scoreKeeper.scoreTeamBWL2();
        assertEquals("000:002", scoreKeeper.getScore());
    }

    @Test
    public void testScoreTeamBWL3() {
        scoreKeeper.scoreTeamBWL3();
        assertEquals("000:003", scoreKeeper.getScore());
    }

    @Test
    public void testMultipleScoresTeamWIN() {
        scoreKeeper.scoreTeamWIN1();
        scoreKeeper.scoreTeamWIN2();
        scoreKeeper.scoreTeamWIN3();
        assertEquals("006:000", scoreKeeper.getScore());
    }
    @Test
    public void testMultipleScoresTeamBWL() {
        scoreKeeper.scoreTeamBWL1();
        scoreKeeper.scoreTeamBWL2();
        scoreKeeper.scoreTeamBWL3();
        assertEquals("000:006", scoreKeeper.getScore());
    }
    @Test
    public void testMultipleScoresBothTeams () {
        scoreKeeper.scoreTeamWIN1();
        scoreKeeper.scoreTeamWIN2();
        scoreKeeper.scoreTeamWIN3();
        scoreKeeper.scoreTeamBWL1();
        scoreKeeper.scoreTeamBWL3();
        assertEquals("006:004", scoreKeeper.getScore());
    }
}
