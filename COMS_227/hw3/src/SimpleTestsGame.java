import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import api.Descriptor;
import api.Direction;
import api.MoveResult;
import hw3.Powers;
import hw3.ShiftUtil;
import ui.ConsoleUI;

public class SimpleTestsGame
{
  public static void main(String[] args)
  {

    // The ShiftUtil is only used in the doMove method,
    // so we can test the other methods even if ShiftUtil
    // isn't working yet
    
	Random rand = new Random();
	  
    ShiftUtil util = new ShiftUtil();
    Powers g = new Powers(4, util, rand);
    
    
//    // try out some basic methods to get and set values
//    
//    System.out.println(g.getSize());
//    System.out.println();
//    
//    g.setValue(2, 3, 42);  // sets a value at row 2, column 3
//    System.out.println(g.getTileValue(2, 3)); // expected 42   
//    
//    g.setValue(1, 2, 4);  // sets a value at row 1, column 2
//    System.out.println(g.getTileValue(1, 2)); // expected 4   
//    
//    // copy a test array into the game grid
//    int[][] test = 
//      {
//        {2, 2, 0, 2},
//        {0, 4, 4, 0},
//        {0, 4, 0, 0},
//        {0, 8, 0, 2}
//      };
//    
//    for (int row = 0; row < test.length; row += 1)
//    {
//      for (int col = 0; col < test[0].length; col += 1)
//      {
//        g.setValue(row, col, test[row][col]);
//      }
//    }
//    
//    
//    // try out getRowOrColumn
//    int[] actual = g.getRowOrColumn(0, Direction.LEFT);
//    int[] expected = new int[] {2, 2, 0, 2};
//    System.out.println("Result:   " + Arrays.toString(actual));
//    System.out.println("Expected: " + Arrays.toString(expected));
//    System.out.println();
//    
//    actual = g.getRowOrColumn(2, Direction.RIGHT);
//    expected = new int[] {0, 0, 4, 0};
//    System.out.println("Result:   " + Arrays.toString(actual));
//    System.out.println("Expected: " + Arrays.toString(expected));
//    System.out.println();
//    
//    actual = g.getRowOrColumn(1, Direction.UP);
//    expected = new int[] {2, 4, 4, 8};
//    System.out.println("Result:   " + Arrays.toString(actual));
//    System.out.println("Expected: " + Arrays.toString(expected));
//    System.out.println();
//
//    actual = g.getRowOrColumn(1, Direction.DOWN);
//    expected = new int[] {8, 4, 4, 2};
//    System.out.println("Result:   " + Arrays.toString(actual));
//    System.out.println("Expected: " + Arrays.toString(expected));
//    System.out.println();
//
//    // try out setRowOrColumn
//    g = new Powers(5, util);
//    int[] arr = {1, 2, 3, 4, 5};
//    g.setRowOrColumn(arr, 3, Direction.LEFT);
//    System.out.println("Result: ");
//    ConsoleUI.printGrid(g);  // verify 
//    int[][] expected2d =  {
//      {0, 0, 0, 0, 0},
//      {0, 0, 0, 0, 0},
//      {0, 0, 0, 0, 0},
//      {1, 2, 3, 4, 5},
//      {0, 0, 0, 0, 0},
//    };
//    System.out.println("Expected: ");
//    ConsoleUI.print2dArray(expected2d);
//    
//    g = new Powers(5, util);
//    int[] arr4 = {1, 2, 3, 4, 5};
//    g.setRowOrColumn(arr4, 1, Direction.RIGHT);
//    System.out.println("Result: ");
//    ConsoleUI.printGrid(g);  // verify 
//    int[][] expected2d4 =  {
//      {0, 0, 0, 0, 0},
//      {5, 4, 3, 2, 1},
//      {0, 0, 0, 0, 0},
//      {0, 0, 0, 0, 0},
//      {0, 0, 0, 0, 0},
//    };
//    System.out.println("Expected: ");
//    ConsoleUI.print2dArray(expected2d4);
//    
//    g = new Powers(5, util);
//    int[] arr2 = {1, 2, 3, 4, 5};
//    g.setRowOrColumn(arr2, 2, Direction.DOWN);
//    System.out.println("Result: ");
//    ConsoleUI.printGrid(g);  // verify 
//    int[][] expected2d2 =  {
//      {0, 0, 5, 0, 0},
//      {0, 0, 4, 0, 0},
//      {0, 0, 3, 0, 0},
//      {0, 0, 2, 0, 0},
//      {0, 0, 1, 0, 0},
//    };
//    System.out.println("Expected: ");
//    ConsoleUI.print2dArray(expected2d2);
//    
//    g = new Powers(5, util);
//    int[] arr3 = {1, 2, 3, 4, 5};
//    g.setRowOrColumn(arr3, 3, Direction.UP);
//    System.out.println("Result: ");
//    ConsoleUI.printGrid(g);  // verify 
//    int[][] expected2d3 =  {
//      {0, 0, 0, 1, 0},
//      {0, 0, 0, 2, 0},
//      {0, 0, 0, 3, 0},
//      {0, 0, 0, 4, 0},
//      {0, 0, 0, 5, 0},
//    };
//    System.out.println("Expected: ");
//    ConsoleUI.print2dArray(expected2d3);
    
    // try out doMove
    // Remember ShiftUtil needs to be working for this!
    // Updates to grid are not actually dependent on the 
    // list of Shift objects returned from shifAll - they are
    // only needed to construct the MoveResult.
    
    g = new Powers(4, util);
    int[][] test2 = 
      {
        {8, 8, 0, 8},
        {0, 4, 4, 0},
        {0, 32, 0, 0},
        {0, 16, 0, 8}
      };
    for (int row = 0; row < test2.length; row += 1)
    {
      for (int col = 0; col < test2[0].length; col += 1)
      {
        g.setValue(row, col, test2[row][col]);
      }
    }
    
//    MoveResult result2 = g.doMove(Direction.DOWN);
//    int[][] expectedAfterMove2 = 
//      {
//    	  {0, 8, 0, 0},
//          {0, 4, 0, 0},
//          {0, 32, 0, 0},
//          {8, 16, 4, 16}
//      };
//    
//    System.out.println("Result: ");
//    ConsoleUI.printGrid(g);  // verify 
//    System.out.println("Expected: ");
//    System.out.println("(Result may contain an extra 2 or 4 from generateTile): ");
//    ConsoleUI.print2dArray(expectedAfterMove2);
//    
//    MoveResult result2 = g.doMove(Direction.UP);
//    int[][] expectedAfterMove2 = 
//      {
//    	  {8, 8, 4, 16},
//          {0, 4, 0, 0},
//          {0, 32, 0, 0},
//          {0, 16, 0, 0}
//      };
//    
//    System.out.println("Result: ");
//    ConsoleUI.printGrid(g);  // verify 
//    System.out.println("Expected: ");
//    System.out.println("(Result may contain an extra 2 or 4 from generateTile): ");
//    ConsoleUI.print2dArray(expectedAfterMove2);
//    
//    MoveResult result = g.doMove(Direction.LEFT);
//    int[][] expectedAfterMove = 
//      {
//        {16, 8, 0, 0},
//        {8, 0, 0, 0},
//        {32, 0, 0, 0},
//        {16, 8, 0, 0}
//      };
//    
//    System.out.println("Result: ");
//    ConsoleUI.printGrid(g);  // verify 
//    System.out.println("Expected: ");
//    System.out.println("(Result may contain an extra 2 or 4 from generateTile): ");
//    ConsoleUI.print2dArray(expectedAfterMove);  
    
    MoveResult result = g.doMove(Direction.RIGHT);
    int[][] expectedAfterMove = 
      {
        {0, 0, 8, 16},
        {0, 0, 0, 8},
        {0, 0, 0, 32},
        {0, 0, 16, 8}
      };
    
    System.out.println("Result: ");
    ConsoleUI.printGrid(g);  // verify 
    System.out.println("Expected: ");
    System.out.println("(Result may contain an extra 2 or 4 from generateTile): ");
    ConsoleUI.print2dArray(expectedAfterMove);

    // What about the MoveResult object?
    if (result != null)
    {
      System.out.println("MoveResult object: ");
      ArrayList<Descriptor> descriptors = result.getMoves();
      for (Descriptor d : descriptors)
      {
        System.out.println(d);
      }
      System.out.println("New tile: " + result.getNewTile());
      System.out.println();
      System.out.println("Expected MoveResult contents (in any order):");
      System.out.println("(New tile position is random):");
      
      System.out.println("Merge 0 and 2 to 0 (row 0 RIGHT)");
      System.out.println("Move 3 to 1 (row 0 RIGHT)");
      System.out.println("Merge 1 and 2 to 0 (row 1 RIGHT)");
      System.out.println("Move 2 to 0 (row 2 RIGHT)");
      System.out.println("Move 2 to 1 (row 3 RIGHT)");
      System.out.println("New tile: Position (2, 1) value 2");

    }
  }
}
