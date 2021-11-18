/** Number of rows in array of Squares */
private int numberOfRows;

/** Number of columns in array of Squares */
private int numberOfColumns;

/** A 2D array od square on the Board */
private Square[][] board;

/**
 *Represents the  number of pieces max connected currently, once maxConnected = 4 the
 * player has won the game.
 */
private int maxConnected;

/** Represents the  number of pieces connected to win the game */
private int numConnected;

public Boolean isDiagonallyConnected(String s) {
    int numConnected = 0;
    int maxConnected = 0;
    int i = 0;
    int j = 0;

    for (j = 0; j < numberOfColumns; j++) {
        if (!board[i][j].hasPiece()) {
            continue;
        }
        else if (board[i][j].getPiece().getType.equals(s)) {
            numConnected++;
            if (numConnected == this.numConnected) {
                return true;
            }
        }
        else {
            if (numConnected > maxConnected) {
                maxConnected = numConnected;
            }
            if (maxConnected > this.maxConnected) {
                this.maxConnected = maxConnected;
            }
            numConnected = 0;
        }
        i++;
    }
