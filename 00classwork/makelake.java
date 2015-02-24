import java.io.*;

public class makelake {
    static int rows, cols, elevation, N;
    static int[][] pasture, directions;

    public static void main(String[] args) throws Exception {
	try {
	    BufferedReader in = new BufferedReader(new FileReader("makelake.in"));
	    
	    String[] vars = in.readLine().split(" ");
	    rows = Integer.parseInt(vars[0]);
	    cols = Integer.parseInt(vars[1]);
	    elevation = Integer.parseInt(vars[2]);
	    N = Integer.parseInt(vars[3]);
	    
	    pasture = new int[rows][cols];
	    directions = new int[rows][cols];
	    
	    String[] line;
	    for (int i = 0; i < rows; i++) {
		line = in.readLine().split(" ");
		for (int j = 0; j < cols; j++) {
		    pasture[i][j] = Integer.parseInt(line[j]);
		}
	    }
	    
	    // printPasture();
	    
	    for (int i = 0; i < N; i++) {
		line = in.readLine().split(" ");
		for (int j = 0; j < 3; j++) {
		    directions[i][j] = Integer.parseInt(line[j]);
		}
	    }
	    
	} catch (Exception e) {
	    throw e;
	}
	
	// Make the lake here!
	
    }

    static void printPasture() {
	String out = "";
	for (int[] row : pasture) {
	    for (int col : row) {
		out += col + " ";
	    }
	    out += "\n";
	}
	System.out.print(out);
    }
}