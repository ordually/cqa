import java.util.Scanner;

/*
 * HelloWorld.java
 *
 * Copyright (c) 2019 Lockheed Martin (LM) as an unpublished work. 
 * All Rights Reserved.
 *
 * This file does not contain any Lockheed Martin Proprietary Information.
 */

/**
 * Hello World - Problem A
 * 
 * This program can be used as a template for other CodeQuest problems.
 */
public class ConwaysLaw_Paul {

    public static final int MATRIX_MAX = 9;
    public static final int MATRIX_MIN = 0;
	/**
	 * Every CodeQuest solution must include a main() method; how else 
	 * will we run your code? 
	 * 
	 * If you want to test your program before sending it in for judging,
	 * remember that all input this year comes from System.in. You can use
	 * these commands from your operating system's command line, replacing
	 * "Prob00" with the name of your source code file (assuming your 
	 * source code and input file are in the same location).
	 * 
	 * javac ProbA.java
	 * java ProbA < ProbA.in.txt
	 * 
	 * If you're using an IDE like Eclipse or Netbeans, you can configure
	 * them to run your program as well.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// First, connect to the standard input channel
		// This "try-with-resources" block will automatically close
		// the Scanner when we're done using it (even if your program


        Integer[][] source = new Integer[10][10]; // [column][row]
        

		try (Scanner input = new Scanner(System.in)){
			// Next, read the number of test cases
			int testCases = Integer.parseInt(input.nextLine());
            

			
			// Now perform each test case. This for loop is the last part
			// common to all problems; the contents of this for loop will
			// change depending on what problem you're solving.
			for(int testcase = 0; testcase < testCases; testcase++) {
				
                int iterations = Integer.parseInt(input.nextLine());

                
                for (int matrixRow = 0; matrixRow < 10; matrixRow++) {
                    String row = input.nextLine();
                    // 0000000000
                    for (int charsRead = 0; charsRead < 10; charsRead++) {
                        source[charsRead][matrixRow] = Integer.parseInt(row.charAt(charsRead) + "");
                        //System.out.println("read " + matrixRow + "," + charsRead  + ": " + row.charAt(charsRead));
                    }
                   
                }

                //System.out.println("character at 5,3:" + matrix[5][3]);
                //System.out.println(Arrays.toString(matrix[3]));
                //System.out.println("Read source:");
                //print(source);
                /* 
                // Sample prints to exercise #adjacentCels 
                //////
                // Find adjacent for column 5:
                for (int i = 0; i < matrix.length; i++) {
                    System.out.println("adjacent to 5," + i + ":" +adjacentCells(matrix, 5, i));
                }
                
                // Find adjacent for row 5:
                for (int i = 0; i < matrix.length; i++) {
                    System.out.println("adjacent to " + i + ",5:" +adjacentCells(matrix, i, 5));
                }
                */

                // For each iteration, walk the matrix, finding adjacents and writing to the target
                // 
                /** 
                In each generation:
                    Any live cell adjacent to one or zero live cells dies (from loneliness).
                    Any live cell adjacent to two or three live cells lives.
                    Any live cell adjacent to four or more live cells dies (from overcrowding).
                    Any dead cell adjacent to exactly three live cells becomes alive (through reproduction).
                **/
                for (int iterationCounter = 0; iterationCounter < iterations; iterationCounter++) {               
                    Integer[][] target = new Integer[10][10]; // [column][row]
                    for (int i = 0; i < source.length; i++) {
                        for (int j = 0; j < source[i].length; j++) {
                            int adjacent = adjacentCells(source, i,j);

                            if (source[i][j] == 1) {
                                // source is alive
                                if (adjacent <= 1) {
                                    // dies from lonliness
                                    target[i][j] = 0;
                                } else if (adjacent == 3 || adjacent == 2) {
                                    // stays
                                    target[i][j] = 1;
                                } else if (adjacent >= 4) {
                                    // overcrowded
                                    target[i][j] = 0;
                                }
                            } else {
                                // source is dead, but can become alive
                                if (adjacent == 3) {
                                    target[i][j] = 1;
                                } else {
                                    target[i][j] = 0;
                                }
                            }
//                                throw new IllegalStateException("unknown state:" + i + "," + j + "=" + source[i][j] + " with adjacent = " + adjacent);
                        }
                        
                    }
                    source = target;
                    //System.out.println("::Post Iter " + iterationCounter);
                    //print(source);
                }
                // Print after all iterations
                //
                print(source);
            
                
                
			}
		}
	}

    public static void print (Integer[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[j][i]);
            }
            System.out.println();
        }
    }

    private static int adjacentCells(Integer[][] matrix, int column, int row) {

        int count = 0;

        // Adjacent is up to 8 cells 
        // where X is given by column, row
        // * * *
        // * x *
        // * * *
        // each adjacent must be checked for out of bounds!

        // 1: NW
        // 
        if (column - 1 >= MATRIX_MIN && row -1 >= MATRIX_MIN && matrix[column -1][row -1] == 1) {
            count++;
        }

        // 2: N
        // 
        if (row -1 >= MATRIX_MIN && matrix[column][row -1] == 1) {
            count++;
        }

        // 3. NE
        if (column + 1 <= MATRIX_MAX && row -1 >= MATRIX_MIN && matrix[column +1][row -1] == 1) { // TODISC: >= vs >, boundary conditions
            count++;
        }

        // 4. W
        if (column - 1 >= MATRIX_MIN && matrix[column - 1][row] == 1) {
            count++;
        }

        // 5. E
        if (column + 1 <= MATRIX_MAX && matrix[column + 1][row] == 1) {
            count++;
        }

        // 6. SW
        if (column - 1 >= MATRIX_MIN && row + 1 <= MATRIX_MAX && matrix[column -1][row + 1] == 1) {
            count++;
        }

        // 7. S
        if (row + 1 <= MATRIX_MAX && matrix[column][row + 1] == 1) {
            count++;
        }

        // 8. SE
        if (column + 1 <= MATRIX_MAX && row + 1 <= MATRIX_MAX && matrix[column+1][row + 1] == 1) {
            count++;
        }

        return count;
    }

}
