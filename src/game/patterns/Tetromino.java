package game.patterns;

import game.pieces.Square.SquareColour;
import game.pieces.SquaresMatrix;

/**
 * The parent/interface for all the different tetrominos, also known as
 * Tetris shapes.
 * 
 * @author givanse
 */
public abstract class Tetromino {
    
    /**
     * Each tetromino (TObject) overwrites this method and implements its own
     * rules for pattern matching.
     * 
     * @param x
     * @param y
     * @param squareType
     * @param squares
     * @return 
     */
    protected abstract int[][] findPatternMatch(int x, int y, 
                                SquareColour squareType, SquaresMatrix squares);
    
    protected static int[][] isHorizontalMatch(
                               int nBackward, int nForward, int x, int y,
                               SquareColour squareType, SquaresMatrix squares) {
        int result[][] = new int[4][2];
        int rCounter = 0;
        /* Backward */
        for(int i = x; i > x - nBackward; i--)
            if(!Tetromino.isSquareMatch(i, y, squareType, squares)) {
                return new int[0][0];
            } else {
                result[rCounter++] = new int[]{i, y};
            }
        /* Forward */
        for(int i = x; i < x + nForward; i++)
            if(!Tetromino.isSquareMatch(i, y, squareType, squares)) {
                return new int[0][0];
            } else {
                result[rCounter++] = new int[]{i, y};
            }
        return result;
    }
    
    protected static int[][] isVerticalMatch(
                               int nBackward, int nForward, int x, int y,
                               SquareColour squareType, SquaresMatrix squares) {
        int result[][] = new int[4][2];
        int rCounter = 0;
        /* Backward */
        for(int i = y; i > y - nBackward; i--)
            if(!Tetromino.isSquareMatch(x, i, squareType, squares)) {
                return new int[0][0];
            } else {
                result[rCounter++] = new int[]{x, i};
            }
        /* Forward */
        for(int i = y; i < y + nForward; i++)
            if(!Tetromino.isSquareMatch(x, i, squareType, squares)) {
                return new int[0][0];
            } else {
                result[rCounter++] = new int[]{x, i};
            }
        return result;
    }
    
    /**
     * 
     * @param x
     * @param y
     * @param squareColour
     * @param squaresMatrix
     * @return True if the position holds a Square that has the same 
     *         SquareColour, False otherwise.
     */
    protected static boolean isSquareMatch(int x, int y, 
                                           SquareColour squareColour, 
                                           SquaresMatrix squaresMatrix) {
        if(x < 0 || y < 0)
            return false;
        
        if(!(squareColour instanceof SquareColour))
            return false;
        
        if(!(squaresMatrix instanceof SquaresMatrix))
            return false;
        
        if(x >= squaresMatrix.getNumberOfColumns() ||
           y >= squaresMatrix.getNumberOfRows())
            return false;
        
        if(squaresMatrix.isPositionAvailable(x, y))
            return false;
        
        if(squaresMatrix.getSquare(x, y).getSquareColour() == squareColour)
            return true;
        
        return false;
    }
    
    /**
     * Tests if the pattern of this tetromino is found within the squares 
     * adjacent to the one indicated by the (x, y) coordinates.
     * 
     * @param x
     * @param y
     * @param squares
     * @return true if a match was found, false otherwise
     */
    protected int[][] isPatternFound(int x, int y, SquaresMatrix squares) {
         /* Its empty, no pattern can be found. */
        if(squares.isPositionAvailable(x, y))
            return new int[0][0];
        SquareColour squareType = squares.getSquare(x, y).getSquareColour();
        return this.findPatternMatch(x, y, squareType, squares);
    }

    
    /* Public methods */

    public static int[][] performPatternMatching(int x, int y, 
                                                 SquaresMatrix squares) {
        /* TODO: add the logic for all the other shapes */
        int tetromino[][] = TetrominoType.SQUARE.isPatternFound(x, y, squares);
        if(tetromino.length != 0)
            return tetromino;
        
        tetromino = TetrominoType.SShape.isPatternFound(x, y, squares);
        if(tetromino.length != 0)
            return tetromino;
        
        /*tetromino = TetrominoType.STRAIGHT.isPatternFound(x, y, squares);
        if(tetromino.length != 0)
            return tetromino;*/
        
        return tetromino;
    }
}