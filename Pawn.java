import javax.swing.*;

public class Pawn extends Piece{
    public Pawn(boolean isBlackPlayer){
        //save that variable
        this.isBlackPlayer=isBlackPlayer;// We initialize isBlackPlayer here.
        this.isWhite=!isBlackPlayer;
        if(isBlackPlayer==true)//this is going to take the image uploaded onto intelli j and move it to the board we designed.
            image = new ImageIcon("bpawn.gif");
        else
            image = new ImageIcon("wpawn.gif");

    }
}

