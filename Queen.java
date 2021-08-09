import javax.swing.*;

public class Queen extends Piece{
    public Queen(boolean isBlackPlayer){
        //save that variable
        this.isBlackPlayer=isBlackPlayer;// We initialize isBlackPlayer variable here.
        this.isWhite=!isBlackPlayer;//So when we move the pieces on the board only the computer will be allowed to move the black pieces
        if(isBlackPlayer==true)//this is going to take the image uploaded onto intelli j and move it to the board we designed.
            image = new ImageIcon("bqueen.gif");
        else
            image = new ImageIcon("wqueen.gif");

    }

}

