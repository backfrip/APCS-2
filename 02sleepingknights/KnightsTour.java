import java.util.*;
import java.io.*;

public class KnightsTour {
    // terminal constants
    final static String clear = "\033[2J";
    final static String hide = "\033[?25l";
    final static String show = "\033[?25h";

    // the board
    private int[][] board;



    // constructor
    public KnightsTour(int size) {
	board = new int[size][size];
    }

    // return the String representation of this tour
    public String toString() {
	String ans = "";

	for (int[] row : board) {
	    ans += "\n";
	    for (int n : row) {
		if (n < 100)
		    ans += " ";
		if (n < 10)
		    ans += " ";
		ans += n;
	    }
	    ans += "\n";
	}

	return /*hide + go(0, 0) +*/ ans /*+ show*/;
    }



    // called to solve the Knight's Tour
    public boolean solve() {
	return solve(0, 0, 1);
    }

    // called to solve the Knight's Tour from a certain position
    public boolean solve(int startx, int starty) {
	return solve(startx, starty, 1);
    }

    // recursive helper for the solve() wrappers
    private boolean solve(int x, int y, int move) {
	// System.out.println(this);
	// wait(5);

	if (move == board.length * board.length + 1)
	    return true;

	if (board.length <= x || x < 0 || board.length <= y || y < 0
		|| board[y][x] != 0)
	    return false;

	board[y][x] = move;

	if (solve(x + 2, y + 1, move + 1) || solve(x + 1, y + 2, move + 1)
		|| solve(x + 2, y - 1, move + 1)
		|| solve(x + 1, y - 2, move + 1)
		|| solve(x - 2, y + 1, move + 1)
		|| solve(x - 1, y + 2, move + 1)
		|| solve(x - 2, y - 1, move + 1)
		|| solve(x - 1, y - 2, move + 1))
	    return true;

	board[y][x] = 0;

	return false;
    }



    // move cursor in terminal
    private String go(int x, int y) {
	return ("\033[" + x + ";" + y + "H");
    }

    // temporarily stop processing
    public void wait(int millis) {
	try {
	    Thread.sleep(millis);
	} catch (InterruptedException e) {
	    // Nothing to C here!
	}
    }

    // return student name
    public String name() {
	return "stringham.eric";
    }



    // main debugger
    public static void main(String[] args) {
	KnightsTour tour = new KnightsTour(5);

	System.out.print(clear);
	tour.solve(2, 2);
	System.out.println(tour);
    }
}
