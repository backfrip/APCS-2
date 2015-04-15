import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayDeque;

public class Maze {
    // @formatter:off
    private static final String clear="\033[2J";private static final String hide="\033[?25l";
    private static final String show="\033[?25h";private String go(int x,int y){return "\033["+x+";"+y+"H";}// @formatter:on

    private char[][] maze;
    private int rows = 0, cols;
    private Space start, end;

    private class Space {// @formatter:off
	private int stepnum, ycor, xcor;
	public Space(int xval, int yval) {this(xval, yval, 0);}
	public Space(int xval, int yval, int stepval) {xcor = xval; ycor = yval; stepnum = stepval;}
	public int x() {return xcor;} public void x(int xval) {x(xval);}
	public int y() {return ycor;} public void y(int yval) {y(yval);}
	public int step() {return stepnum;} public void step(int stepval) {step(stepval);}
    } // @formatter:on

    public Maze(String filename) {
	try {
	    BufferedReader in = new BufferedReader(new FileReader(filename));
	    in.mark(10000);
	    String line = in.readLine();
	    cols = line.length();
	    for (; line != null && !line.equals(""); rows++)
		line = in.readLine();
	    maze = new char[rows][cols];
	    in.reset();
	    for (int i = 0; i < rows; i++) {
		line = in.readLine();
		for (int j = 0; j < cols; j++) {
		    if (line.charAt(j) == 'S') {
			start = new Space(j, i);
		    }
		    if (line.charAt(j) == 'E') {
			end = new Space(j, i);
		    }
		    maze[i][j] = line.charAt(j);
		}
	    }// @formatter:off
	}catch(FileNotFoundException e){System.err.println("File \""+filename+"\" not found!\nStopping...");System.exit(1);
	}catch(IOException e){System.err.println("Error reading file \""+filename+"\"\nStopping...");System.err.println(e.getMessage());
	}catch(NullPointerException e){System.err.println("File \""+filename+"\" is empty!\nStopping...");System.exit(1);
	}catch(StringIndexOutOfBoundsException e){System.err.println("Syntax error in first line of file \""+filename+"\"\nStopping...");System.exit(1);}
    } // @formatter:on

    public String toString() {
	String out = "";
	for (char[] line : maze) {
	    out += "\n";
	    for (char space : line)
		out += space;
	}
	return out;
    }

    public String toString(boolean animate) {
	if (!animate)
	    return toString();
	return clear + hide + go(0, 0) + toString() + hide;
    }

    public boolean solveBFS(boolean animate) {
	solveBFS(0, 0);
	return false;
    }

    public boolean solveBFS() {
	return solveBFS(false);
    }

    // Do I need this? Don't think so, I'll use iterators.
    private boolean solveBFS(int x, int y) {
	return false;
    }
}