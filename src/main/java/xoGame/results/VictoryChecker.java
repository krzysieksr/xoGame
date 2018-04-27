package xoGame.results;

import xoGame.XOBoard;
import xoGame.xoGameExceptions.TooManyArgumentsException;

import java.util.Optional;

import static xoGame.results.MatchResult.*;


public class VictoryChecker {

    private int counter = 0;
    private int condition;

    private VictoryChecker(int victoryCondition) {
        this.condition = victoryCondition;
    }

    public Optional<MatchResult> doWeHaveAWinner(XOBoard board) {
        //TODO
        if (++counter >= 3) {
            counter = 0;
            return Optional.of(X);
        }
        return Optional.empty();

    }

    public static VictoryChecker parse(String winningCondition) throws TooManyArgumentsException {
        String[] parts = winningCondition.split(" ");
        if (parts.length > 1) {
            throw new TooManyArgumentsException(winningCondition);
        }
        int victoryCondition = Integer.parseInt(parts[0]);
        if (victoryCondition <= 0) {
            throw new IllegalArgumentException();
        }
        return new VictoryChecker(victoryCondition);
    }
}
