import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayDeque;

public class Maze {
    // @formatter:off
    private static final String clear="\033[2J";private static final String hide="\033[?25l";
    private static final String show="\033[?25h";private String go(int x,int y){return "/033["+x+";"+y+"H";}// @formatter:on

    private char[][] maze;
    private int rows = 0, cols;

    public Maze(String filename) {
	try {
	    BufferedReader in = new BufferedReader(new FileReader(filename));
	    in.mark(100);
	    String line = in.readLine();
	    cols = line.length();
	    for (; line != null && !line.equals(""); rows++)
		line = in.readLine();
	    maze = new char[rows][cols];
	    in.reset();
	    for (int i = 0; i < rows; i++) {
		line = in.readLine();
		for (int j = 0; j < cols; j++)
		    maze[i][j] = line.charAt(j);
	    }
	} catch (FileNotFoundException e) {
	    System.err.println("File \"" + filename
		    + "\" not found!\nStopping...");
	    System.exit(1);
	} catch (IOException e) {
	    System.err.println("Error reading file \"" + filename
		    + "\"\nStopping...");
	    System.err.println(e.getMessage());
	} catch (NullPointerException e) {
	    System.err.println("File \"" + filename
		    + "\" is empty!\nStopping...");
	    System.exit(1);
	} catch (StringIndexOutOfBoundsException e) {
	    System.err.println("Syntax error in first line of file \""
		    + filename + "\"\nStopping...");
	    System.exit(1);
	}

    }
}