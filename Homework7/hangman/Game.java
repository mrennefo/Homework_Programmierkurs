package Homework7.hangman;
import javax.swing .*;
import java.awt .*;
import java.util. ArrayList ;
public class Game extends JFrame {
    // GUI components
    protected JLabel wordLabel , attemptsLabel , timeLabel ;
    protected JTextField inputField ;
    // The word the player has to guess (fixed for now)
    protected String currentWord = "example";
    // Stores the letters guessed by the player
    protected ArrayList <Character> guessedLetters = new ArrayList <>();
    // Number of tries left
    protected int attemptsLeft = 6;
    // Time left (not yet functional – stays at 60)
    protected int timeLeft = 60;
    // Sets up the window and its components
    public Game () {
        setTitle(" Hangman Game ");
        setSize (400 , 250);
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLayout(new GridLayout(6, 1));
// Button to start a new game
        JButton startButton = new JButton(" Start Game ");
        add( startButton );
// Label showing the guessed word with _ for unknown letters
        wordLabel = new JLabel(" Word: ", SwingConstants.CENTER );
        add(wordLabel);
// Label showing how many tries are left
        attemptsLabel = new JLabel(" Attempts left: " + attemptsLeft ,
                SwingConstants.CENTER );
        add(attemptsLabel);
// Label showing the time left (not yet changing )
        timeLabel = new JLabel(" Time left: " + timeLeft ,
                SwingConstants.CENTER);
        add(timeLabel);
// Input field where the player types their guess
        inputField = new JTextField();
        inputField.setHorizontalAlignment(JTextField .CENTER);
        inputField.setEnabled(false); // initially inactive
        inputField.addActionListener(e ->{
            processInput();
        });
        add(inputField);
// Starts the game when button is clicked and disables restart
        startButton.addActionListener (e -> {
            startGame();
            startButton.setEnabled (false );
        });
// You will implement this method
        processInput ();
        setVisible (true );
    }
    // Resets game state when starting a new game
    protected void startGame () {
        guessedLetters.clear();
        attemptsLeft = 6;
        timeLeft = 60;
        updateDisplay();
        inputField.setEnabled (true );
        inputField.requestFocus ();
    }

    public void processInput () {
        String input = inputField.getText();
        input.toLowerCase();
        if(input.length() > 1){
            System.out.println("Please enter exactly one letter.");
        } else if(input.length() == 1){
            handleGuess(input.charAt(0));
        }

    }

    protected void updateTime(){
        timeLabel.setText(" Time left: " + timeLeft );
    }

    // Updates the word , attempts , and time on the screen
    protected void updateDisplay () {
        StringBuilder display = new StringBuilder ();
        for(char c : currentWord.toCharArray ()) {
            if (guessedLetters.contains (c)) {
                display.append(c).append(" ");
            } else {
                display.append ("_ ");
            }
        }
        wordLabel.setText (" Word: " + display . toString ());
        attemptsLabel.setText (" Attempts left: " + attemptsLeft );
        timeLabel.setText(" Time left: " + timeLeft );
    }

    private boolean hasWon(){
        String currentGuess = "";
        char[] currentWordArray = currentWord.toCharArray();
        boolean won = true;
        int i = 0;
        while(i < currentWordArray.length && won){
            won = false;
            char c = currentWordArray[i];
            for(char letter : guessedLetters){
                if(letter == c){
                    won = true;
                }
            }
            i++;
        }
        return won;
    }

    protected void endGame(boolean won){
        if(won){
            inputField.setText("You've won! The word was: " + currentWord);
        } else{
            inputField.setText("You lost! The word was: " + currentWord);
        }
        inputField.setEnabled(false);
        //Ggf ende des Spiels ergänzen
    }

    protected void handleGuess(char guess) {
        boolean guessed = false;
        for(char letter : guessedLetters){
            if(letter == guess){
                System.out.println("You've already guessed this letter!");
                guessed = true;
                return;
            }
        }

        if(!guessed){
            guessedLetters.add(guess);
        }
        boolean partofWord = false;
        char[] currentWordArray = currentWord.toCharArray();
        for(char letter: currentWordArray){
            if(letter == guess){
                partofWord = true;
            }
        }
        if(!partofWord){
            attemptsLeft--;
        }
        if(attemptsLeft == 0 || hasWon()){
            System.out.println(hasWon());
            endGame(hasWon());
        }
        updateDisplay();

    }

}


