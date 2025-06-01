package Homework7.hangman;

import javax.swing. SwingUtilities;

public class TimerRunnable implements Runnable {
    private final Timer game;

    public TimerRunnable(Timer game) {
        this.game = game;
    }

    @Override
    public void run() {
        try {
            while (game.timerRunning && game.timeLeft > 0) {
                game.timeLeft--;
                SwingUtilities.invokeLater(() -> game.updateTime());
                Thread.sleep(1000);
            }
            Thread.currentThread().interrupt();
            SwingUtilities.invokeLater(() -> game.endGame(false));
        } catch (InterruptedException e) {

        }

// TODO: Implement the countdown loop
// - Decrease timeLeft every second
// - Update the time label using SwingUtilities . invokeLater ()
// - End the game if time runs out
    }

}

