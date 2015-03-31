import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayDeque;

public class Maze {
    private char[][] maze;
    
    private static final String clear = "\033[2J";
    private static final String hide = "\033[?25l";
    private static final String show = "\033[?25h";

    private String go(int x, int y) {
	return "/033[" + x + ";" + y + "H";
    }
    
    public Maze(String filename) {
	BufferedReader in = new BufferedReader(new FileReader(filename));
	
    }

}