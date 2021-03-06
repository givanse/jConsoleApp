package game.patterns;

import game.pieces.Square.SquareColour;
import game.pieces.SquaresMatrix;

/**
 *
 * @author givanse
 */
class TSquare extends Tetromino {
    
    /**
     * 
     * @param x
     * @param y
     * @param squares
     * @return 
     */
    @Override
    protected int[][] findPatternMatch(int x, int y, SquareColour squareType,
                                                     SquaresMatrix squares) {
        /**
         *  _ _
         * |  _|
         * |_|_|
         */
        if(Tetromino.isSquareMatch(x-1, y, squareType, squares))
          if(Tetromino.isSquareMatch(x, y-1, squareType, squares))
            if(Tetromino.isSquareMatch(x-1, y-1, squareType, squares))
              return new int[][]{{x, y}, {x-1, y}, {x, y-1}, {x-1, y-1}};
        /**
         *  _ _
         * |_  |
         * |_|_|
         */
        if(Tetromino.isSquareMatch(x+1, y, squareType, squares))
          if(Tetromino.isSquareMatch(x, y-1, squareType, squares))
            if(Tetromino.isSquareMatch(x+1, y-1, squareType, squares))
              return new int[][]{{x, y}, {x+1, y}, {x, y-1}, {x+1, y-1}};
        /**
         *  _ _
         * | |_|
         * |_ _|
         */
        if(Tetromino.isSquareMatch(x-1, y, squareType, squares))
          if(Tetromino.isSquareMatch(x, y+1, squareType, squares))
            if(Tetromino.isSquareMatch(x-1, y+1, squareType, squares))
              return new int[][]{{x, y}, {x-1, y}, {x, y+1}, {x-1, y+1}};
        /**
         *  _ _
         * |_| |
         * |_ _|
         */
        if(Tetromino.isSquareMatch(x+1, y, squareType, squares))
          if(Tetromino.isSquareMatch(x, y+1, squareType, squares))
            if(Tetromino.isSquareMatch(x+1, y+1, squareType, squares))
              return new int[][]{{x, y}, {x+1, y}, {x, y+1}, {x+1, y+1}};
        
        return new int[0][0];
    }
}