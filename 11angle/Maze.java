import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Maze {
    // @formatter:off
    private static final String clear="\033[2J";private static final String hide="\033[?25l";
    private static final String show="\033[?25h";private String go(int x,int y){return "\033["+x+";"+y+"H";}// @formatter:on

    private char[][] maze;
    private int rows = 0, cols;
    private Space start, end;

    private class Space {// @formatter:off
	private int stepnum,xcor,ycor;private Space lastspace;
	public Space(int xval,int yval){this(xval,yval,null,0);}
	public Space(int xval,int yval,Space prev){this(xval,yval,prev,prev.step());}
	public Space(int xval,int yval,Space prev,int stepNumber){x(xval);y(yval);last(prev);step(stepNumber);}
	public int x(){return xcor;}public void x(int xval){xcor=xval;}
	public int y(){return ycor;}public void y(int yval){ycor=yval;}
	public int step(){return stepnum;}public void step(int stepval){stepnum=stepval;}
	public Space last(){return lastspace;}public void last(Space last){lastspace=last;}
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

    public String toString() {// @formatter:off
	String out="";for(char[] line:maze){out+="\n";for(char space:line){out+=space;}}return out;
    }public String toString(boolean animate){if(!animate)return toString();
    return clear+hide+go(0,0)+toString()+hide;} // @formatter:on

    public boolean solveBFS(boolean animate) {
	return false;
    }

    public boolean solveBFS() {
	return solveBFS(false);
    }

    public boolean solveDFS(boolean animate) {
	return false;
    }

    public boolean solveDFS() {
	return solveDFS(false);
    }

    public int[] solutionCoordinates() {
	int[] a = { 0, 0, 0 };
	return a;
    }
}