package Homework7.hangman;

public class Timer extends Game{
    protected Thread timerThread ;
    protected boolean timerRunning ;


    @Override
    protected void startGame (){
        super.startGame();
        this.startTimer();
    }

    protected void startTimer(){
        timerRunning = true;
        timerThread = new Thread(new TimerRunnable(this));
        timerThread.start();
    }
// TODO: Override startGame () to also start the timer
// TODO: Implement startTimer () to create and start the timer thread
}
