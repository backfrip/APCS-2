public class NQueens {
    int[][] board;

    // constuctor
    public NQueens(int size) {
	board = new int[size][size];
    }

    // toString
    public String toString() {
	String out = "";
	for (int[] rank : board) {
	    out += "\n";
	    for (int space : rank) {
		if (space == -1)
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
	return solve(0, 0);
    }

    // solve the board starting from x in the first rank/file
    public boolean solve(int x) {
	return solve(0, x);
    }

    public boolean solve(int rank, int file) {
	if (rank == board.length)
	    return true;

	if (board[rank][file] == 0) {
	    board[rank][file] = -1;

	    for (int i = 1; i < board.length - rank; i++) {
		board[rank + i][file] += 1;
		if (file - i >= 0)
		    board[rank + i][file - i] += 1;
		if (file + i < board.length)
		    board[rank + i][file + i] += 1;
	    }

	    if (solve(rank + 1, 0))
		return true;

	    for (int i = 1; i < board.length - rank; i++) {
		board[rank + i][file] -= 1;
		if (file - i >= 0)
		    board[rank + i][file - i] -= 1;
		if (file + i < board.length)
		    board[rank + i][file + i] -= 1;
	    }

	    board[rank][file] = 0;
	}
	if (file < board.length - 1)
	    return solve(rank, file + 1);
	return false;
    }



    public static void main(String[] args) {
	NQueens ether = new NQueens(5);
	ether.solve();
	System.out.println(ether);
    }
}