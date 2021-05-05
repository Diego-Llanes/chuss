package chuss;

//This class handles the player interaction with the game,
//specifically the selection of a move from user input.

public class Player implements Interactable {

    //FIELDS

    private final boolean DEBUG = false;
    //Constant to determine whether [DEBUG TEXT] will be displayed for this class
    private final Board board;
    //The board that the player is interacting with

    //CONSTRUCTORS

    public Player(Board board) {
        //The constructor for the Player object. Gets a one-time user
        //input and turns it into a move object to be passed back to
        //the main game.

        this.board = board;

    }

    //OTHER

    public Move getMove() {

        return board.getUI().getMove();

    }

}