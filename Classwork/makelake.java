import java.io.*;

public class makelake {
    int R, C, E, N;
    
    public static void main(String[] args) {
	// Put file read here
	String input = "4 6 22 2/n28 25 20 32 34 36\n27 25 20 20 30 34\n24 20 20 20 20 30\n20 20 14 14 20 20\n1 4 4\n1 1 10";
	String[] lines = input.split("\n");
	String[] firstLine = lines[0].split(" ");
	R = firstLine[0]
	// Recieve file input as list of Strings
	// Take first String and break into R, C, E, and N variables
	// Take following R strings and parse into a grid (2D int array)
	// Take following N strings and use as directions
	// Make the lake!
    }

}