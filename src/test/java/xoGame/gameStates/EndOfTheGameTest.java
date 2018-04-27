package xoGame.gameStates;

import org.testng.Assert;
import org.testng.annotations.Test;
import xoGame.ScoreBoard;
import xoGame.results.GameResult;

import java.util.Scanner;
import java.util.function.Supplier;

public class EndOfTheGameTest {

    @Test
    public void testMoveToNextState() {
        //given
        GameResult gameResult = new GameResult(new ScoreBoard());
        String input = "some string";
        EndOfTheGame endOfTheGame = new EndOfTheGame(gameResult);
        Supplier<String> userInputProvider=new Scanner(System.in)::nextLine;

        // when
        GameState resultGameState = endOfTheGame.moveToNextState(userInputProvider);

        // then
        Assert.assertTrue(resultGameState instanceof InitialState);
    }
}
