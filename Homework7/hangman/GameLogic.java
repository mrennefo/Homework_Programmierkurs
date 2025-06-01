package Homework7.hangman;

public interface GameLogic {
    void handleGuess(char guess);
    void hasWon();
    void endGame();
}
