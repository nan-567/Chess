import javax.swing.*;
import java.awt.*;

public class BoardComponent extends JComponent {
    protected void paintComponent(Graphics g) {
        // draw the gameboard
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                if (x%2 == y%2) {
                    //setting the square color as light and drawing the tile
                    Color lightbrown = new Color(233, 174, 95);
                    g.setColor(lightbrown);
                } else {
                    //drawing a dark square tile
                    Color darkbrown = new Color(177, 113, 24);
                    g.setColor(darkbrown);
                }
                g.fillRect(x*Chess.PIECESIZE, y*Chess.PIECESIZE, Chess.PIECESIZE, Chess.PIECESIZE);
            }
            // make a color object
            Color lightbrown = new Color(233, 174, 95);
            Color darkbrown = new Color(177, 113, 24);
            //draw the 64 tiles

            // let's draw a single tile at the top left corner
            //use fillRect: needs a top- left corner, width, height
            // top left is 0,0
            // width and height? Chess.PIECESIZE or 44

        }
        // We are drawing the pieces to the gameboard here. We are going to iterate through our position array and check if it's
        //not null, which means there is a piece on that position, so we draw the piece on that position. null=no pieceset
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                if (Chess.position[x][y]!=null)Chess.position[x][y].drawPiece(x,y,g);
            }
        }
    }
}