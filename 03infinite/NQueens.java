public class NQueens {
    boolean[][] board;

    // constuctor
    public NQueens(int size) {
	board = new boolean[size][size];
    }

    // toString
    public String toString() {
	String out = "";
	for (boolean[] row : board) {
	    out += "\n";
	    for (boolean square : row) {
		if (square)
		    out += "Q";
		else
		    out += "-";
		out += " ";
	    }
	}
	return out;
    }

    // return student name
    public String name() {
	return "stringham.eric";
    }



    // solve the board starting from 0,0
    public boolean solve() {
	return solve(0);
    }

    // solve the board starting from x in the first rank/file
    public boolean solve(int x) {
	return solve(x, 0, 0);
    }

    private boolean solve(int rank, int file, int queens) {
	if (queens == board.length)
	    return true;

	board[rank][file] = true;

	for (int i = 0; i < board.length; i++) {
	    if ((board[rank][i] && i != file)
		    || (board[i][file] && i != rank)
		    || (i != 0 && inRange(rank - i, file - i) && board[rank - i][file
			    - i])
		    || (i != 0 && inRange(rank - i, file + i) && board[rank - i][file
			    + i])
		    || (i != 0 && inRange(rank + i, file - i) && board[rank + i][file
			    - i])
		    || (i != 0 && inRange(rank + i, file + i) && board[rank + i][file
			    + i])) {
		System.out
			.println("Target test failed at " + rank + "," + file);
		board[rank][file] = false;
		return false;
	    }
	}

	for (int i = file + 1; i < board.length; i++) {
	    for (int j = 0; j < board.length; j++) {
		if (solve(j, i, queens + 1))
		    return true;
	    }
	}

	System.out.println("Possibility test failed at " + rank + "," + file);
	board[rank][file] = false;
	return false;
    }

    private boolean inRange(int r, int f) {
	System.out.println(r + "," + f + " diagonal test value");
	return r >= 0 && r < board.length && f >= 0 && f < board.length;
    }



    public static void main(String[] args) {
	NQueens castle = new NQueens(5);
	System.out.println(castle);

	castle.solve();
	System.out.println(castle);
    }
}