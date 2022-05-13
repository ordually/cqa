import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 * PaulPlink.java
 */

public class PaulPlink {

    public static final int MATRIX_MAX = 9;
    public static final int MATRIX_MIN = 0;

    public static Integer[][] board;
    public static TreeMap<Long, String> paths;
	/**
	 * @param args
	 */

     /**
      *       x
            y   y
          z   z    z

          each flipper has a decision, left or right. in my matrix, 'left' is modeled by no increase in the x-axis,
          so my matrix will look like:

          x
          y y
          z z z

      * @param args
      */
	public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
            
			for(int testcase = 0; testcase < testCases; testcase++) {
                
                paths = new TreeMap<Long,String>();
                
                int height = Integer.parseInt(input.nextLine()); 
                // height is really height+1, since the last row is buckets functions the same 
                // as any other rowInteger[][] board = 
                board = new Integer[height+1][height+1];
                
                
                for (int i = 0; i <= height; i++) {
                    String[] row = input.nextLine().split(" ");
                    for (int j = 0; j < row.length; j++) {
                        board[i][j] = Integer.parseInt(row[j]);
                    }
                }

                System.out.println("read board:");
                print(board);

                traverse(0,0, new StringBuilder(), 0);

                long highestPoints = paths.lastKey();
                String highestPointPath = paths.get(highestPoints);


                System.out.println(highestPointPath + " = " + highestPoints);
                
			}
		}
	}

    /**
     * 
     * @param row
     * @param col
     * @param route 
     * @param points accumulated thus far to get to this cell
     * @return
     */
    public static void traverse(int row, int col, StringBuilder route, long pointsAccum) {


        pointsAccum += board[row][col];

        if (row +1 == board.length) {
            
            //System.out.println("End: " + route + ". " + pointsAccum);
            paths.put(pointsAccum, route.toString());

            return;
        }
        // Left
        traverse(row+1,col,new StringBuilder(route.toString() + "L"),pointsAccum);
        // Right
        traverse(row+1,col+1,new StringBuilder(route.toString() + "R"), pointsAccum);
    }


    public static void print (Integer[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] != null) {
                    System.out.print(matrix[i][j] + " ");
                }
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
