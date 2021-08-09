import javax.swing.*;
import java.awt.*;


public class Chess
    {
        public static final int PIECESIZE=44;
        // peacesize is the length of a single square peace
        public static final int WIDTH =PIECESIZE*8, HEIGHT=PIECESIZE*8;
        // below Piece was created to go along with abstract piece
        public static Piece[][] position = new Piece[8][8];//This is Gameboard, each position could have a piece or not have a piece
        public static BoardComponent board;
        public static void main(String [] args)
        {
            //Here we are defining and positioning the pieces on the board, if there is a position that does not have a piece it will be represented by null.
            position[0][0] = new Rook(true);
            position[1][0] = new Knight(true);
            position[2][0] = new Bishop(true);
            position[3][0] = new Queen(true);
            position[4][0] = new King(true);
            position[5][0] = new Bishop(true);
            position[6][0] = new Knight(true);
            position[7][0] = new Rook(true);
            position[0][1] = new Pawn(true);
            position[1][1] = new Pawn(true);
            position[2][1] = new Pawn(true);
            position[3][1] = new Pawn(true);
            position[4][1] = new Pawn(true);
            position[5][1] = new Pawn(true);
            position[6][1] = new Pawn(true);
            position[7][1] = new Pawn(true);

            position[0][7]=new Rook(false);
            position[1][7] = new Knight(false);
            position[2][7] = new Bishop(false);
            position[3][7] = new Queen(false);
            position[4][7] = new King(false);
            position[5][7] = new Bishop(false);
            position[6][7] = new Knight(false);
            position[7][7]=new Rook(false);
            position[0][6]=new Pawn(false);
            position[1][6]=new Pawn(false);
            position[2][6]=new Pawn(false);
            position[3][6]=new Pawn(false);
            position[4][6]=new Pawn(false);
            position[5][6]=new Pawn(false);
            position[6][6]=new Pawn(false);
            position[7][6]=new Pawn(false);

            // make the window
            JFrame window;
            window = new JFrame("Chess");
            // 10, 40 makes the windows slightly bigger to adjust for the title bar, borders
            window.setSize(WIDTH+1 ,HEIGHT+30);
            // Here on line 56 we are terminating the program by closing the window, we do that by setting the default close operation to Exit on Close.
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //making a board component object and on line 62 we add it to the window which is window.add(board)
            board = new BoardComponent();
            //line 60 we are creating the BoardMouseListener.
            BoardMouseListener mouseListener= new BoardMouseListener();
            //line 62 we are just adding the mouselistener to the board so we could listen for mouse inputs/clicks on the board
            board.addMouseListener(mouseListener);
            // the board we create will now respond to mouse methods inside the board mouse listener.
            window.add(board);

            // Here we set the window.setVisible to True so we can able to see the board
            window.setVisible(true);

        }

    }


