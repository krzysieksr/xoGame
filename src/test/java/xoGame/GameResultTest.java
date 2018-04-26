package xoGame;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GameResultTest {

    @Test
    public void testGetResult() {
        GameResult gameResult = new GameResult(new ScoreBoard());

        Results returnedResult = gameResult.getResult();

        Assert.assertEquals(returnedResult, Results.X);
    }

    @Test
    public void testToString() {
        GameResult gameResult = new GameResult(new ScoreBoard());

        String returnedResult = gameResult.toString();

        Assert.assertEquals("Player 'X' wins", returnedResult);
    }
}