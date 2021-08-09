import javax.swing.*;
import java.awt.*;

public abstract class Piece {
    protected ImageIcon image;
    protected ImageIcon white;
    boolean isBlackPlayer;//here we are creating a variable.
    boolean isWhite = true;
    public boolean canMove;
    //public Piece(boolean isBlackPlayer, ImageIcon image){
    //this.image = image;
    //this.isBlackPlayer=isBlackPlayer;//making it so we can write it in the superclass whether every single piece is a white or black one.
    //}
    //public abstract boolean canMove(int startx, int starty, int endx, int endy);

    public void drawPiece(int x, int y, Graphics g) {
        g.drawImage(image.getImage(), x * 44, y * 44, null);// x and y are the height and the weight
//

    }


    public boolean canMove(int startx, int starty, int endx, int endy) {return true; }//will be used to assign canMove to
}//BoardMouseListener

