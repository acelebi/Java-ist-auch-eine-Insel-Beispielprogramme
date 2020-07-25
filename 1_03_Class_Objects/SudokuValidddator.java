public class SudokuValidddator {
  public static boolean isValidSudoku( int[][] puzzle ) {
    for ( int sum = 0, prod = 1, row = 0; row < 9; sum = 0, prod = 1, row++ ) {
      for ( int col = 0; col < 9;
            sum += puzzle[row][col], prod *= puzzle[row][col], col++ ) {}
      if ( sum != 45 || prod != 362880 )
        return false;
    }

    for ( int sum = 0, prod = 1, col = 0; col < 9; sum = 0, prod = 1, col++ ) {
      for ( int row = 0; row < 9;
            sum += puzzle[row][col], prod *= puzzle[row][col], row++ )  {}
      if ( sum != 45 || prod != 362880 )
        return false;
    }

    return true;
  }
  
  public static void main( String[] args ) {
    int[][] puzzle = { {7,3,1,8,5,2,6,9,4},
                       {2,5,4,9,7,6,8,3,1},
                       {9,6,8,3,4,1,5,2,7},
                       {8,4,5,1,2,7,3,6,9},
                       {6,1,2,4,9,3,7,8,5},
                       {3,9,7,5,6,8,4,1,2},
                       {1,7,6,2,8,4,9,5,3},
                       {4,2,9,6,3,5,1,7,8},
                       {5,8,3,7,1,9,2,4,6}};
    System.out.println( isValidSudoku(puzzle) );   // true

    puzzle[0][0] = 8;
    System.out.println( isValidSudoku(puzzle) );   // false
  }
}