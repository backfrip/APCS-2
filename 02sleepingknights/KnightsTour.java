import java.util.*;
import java.io.*;

public class KnightsTour {
    // terminal constants
    final static String clear = "\033[2J";
    final static String hide = "\033[?25l";
    final static String show = "\033[?25h";

    // the board
    private int[][]board;



    // constructor
    public KnightsTour(int size) {
	// TODO
    }

    // return the String representation of this tour
    public String toString() {
	String ans = "\n";
	
	// TODO: Build Knight's Tour
	
	return hide + go(0,0) + ans + "\n" + show;
    }



    // called to solve the Knight's Tour
    public void solve() {
	// TODO
    }

    // called to solve the Knight's Tour from a certain position
    public void solve(int startx, int starty) {
	// TODO
    }

    // recursive helper for the solve() wrappers
    public boolean solve(int x, int y, int move) {
	System.out.println(this);
	wait(20);
	
	// TODO

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
	}
    }



    

    