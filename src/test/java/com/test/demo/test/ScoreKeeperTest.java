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

}
