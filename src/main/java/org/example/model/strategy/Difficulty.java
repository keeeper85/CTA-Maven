package org.example.model.strategy;

public enum Difficulty {

    EASY (new EasyStrategy(), " Try playing at Normal difficulty."),
    NORMAL (new NormalStrategy(), " Try playing at Difficult level."),
    DIFFICULT (new DifficultStrategy(), " Try playing at Hardcore level."),
    HARDCORE (new HardcoreStrategy(), " You've beat the game! You're hardcore!");

    Strategy strategy;
    String winningMessage;

    Difficulty(Strategy strategy, String winningMessage) {
        this.strategy = strategy;
        this.winningMessage = winningMessage;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public String getWinningMessage() {
        return winningMessage;
    }
}
