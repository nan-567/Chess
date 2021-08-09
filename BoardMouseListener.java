import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

public class BoardMouseListener implements MouseListener {
    int startx, starty;
    int endx, endy;

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.print("Mouse pressed");
        //save where I clicked
        // this is going to pick up the piece and moving it.
        int mousex = e.getX();
        int mousey = e.getY();
        startx = mousex / 44;// converting from pixels to blocks
        starty = mousey / 44;

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouse release");
        int mousex = e.getX();
        int mousey = e.getY();
        endx = mousex / 44;//converting from pixels to blocks
        endy = mousey / 44;

        // part 5: if statements to limit movements on the board.
        if (endx > 7 || endx < 0 || endy > 7 || endy < 0) {
            return;// make sure the start x and start y index are between the ranges 0-7, making the the movement cordinates are on the board.
        }
        if (Chess.position[endx][endy] != null && Chess.position[endx][endy].isWhite) {
            return;// don't let the person make a move on their own square, so basically the person can't move a white piece
            // onto a white piece square.
        }
        if (startx == endx && starty == endy) {
            return;// checking that the person does not make a move on the square they are already on.

        }
        if(Chess.position[startx][starty]==null){
            return;//checking if there is an actual piece at the start coordinate.
        }
        if (Chess.position[startx][starty].canMove(startx, starty, endx, endy) == false) {
            return;//checking if piece selected can move.
        }
        if(Chess.position[startx][starty].isWhite==false){
            return;// make sure you can only move white pieces.
        }
        //move is valid, so move piece
        Chess.position[endx][endy] = Chess.position[startx][starty];
        Chess.position[startx][starty] = null;
        Chess.board.repaint();//Here we are redrawing the gameboard and all of the pieces
        //computers move
        Random Computerplayer = new Random();

        while(true){//generate random move for lines 58-61
            startx = (int)(Math.random()*8);
            starty = (int)(Math.random()*8);
            endx = (int)(Math.random()*8);
            endy = (int)(Math.random()*8);

            if(Chess.position[startx][starty]==null){//selected position does not have a piece, try again.
                continue;
            }
            if(startx==endx && starty ==endy){// the piece is being moved to the same position, the start and end positions are the same, try again.
                continue;
            }
            if(Chess.position[startx][starty].isWhite){// the piece is white, can only move black; try again
                continue;
            }
            if(Chess.position[endx][endy] != null && !Chess.position[endx][endy].isWhite){//if you are moving onto a black piece;try again
                continue;
            }
            if(Chess.position[startx][starty].canMove(startx, starty,endx,endy)==false){//just checking if it is a valid move, if the move is not valid;try again
                continue;
            }
            //move is valid, move the blackpiece.
            Chess.position[endx][endy] = Chess.position[startx][starty];
            Chess.position[startx][starty] = null;
            Chess.board.repaint();//redraw the board and all the pieces.
            break;//black has moved, break out of the while loop.


        }



    }

        @Override
        public void mouseEntered(MouseEvent e){

        }

        @Override
        public void mouseExited(MouseEvent e){

        }
        @Override
        public void mouseClicked(MouseEvent e){
            //save where I clicked
            // this is going to pick up the piece and moving it.

        }

    }

