package mini2;

//import java.util.Scanner;

public class JustAnOrdinArrayDay
{
  /**
   * Private constructor disables instantiation.
   */
  private JustAnOrdinArrayDay() {}
  
  /**
   * Determines whether the sub-array beginning at position <code>start</code>
   * is a <em>palindrome</em>.
   * An array is a palindrome if the ordering of elements is the
   * same whether it is read left-to-right or right-to-left.  For example,
   * <ul>
   * <li>isPalindrome([1, 3, 7, 3, 1], 0) returns true
   * <li>isPalindrome([1, 3, 7, 3, 1], 1) returns false
   * <li>isPalindrome([5, 4, 1, 3, 3, 1], 2) returns true
   * <li>isPalindrome([1, 3, 7], 2) returns true
   * </ul>
   * If the given index <code>start</code> is out of range, the method returns true.
   * @param arr
   *   given array
   * @param start
   *   given starting position of subarray to check
   * @return
   *   true if arr[start] through arr[length - 1] is a palindrome
   */
  public static boolean isPalindrome(int[] arr, int start)
  {
    if (start > arr.length - 1) {
    	return true;
    }
    
    for (int i = start; i < arr.length; i++) {
    	int first = arr[i];
    	int last = arr[arr.length - i - 1 + start];
    	if (first != last) {
    		return false;
    	}
    }
    
    return true;
  }
  
  /**
   * Creates an array representing the count of how many values in a given data
   * set fall into each of a specified number of <em>bins</em>, 
   * where a bin is a sub-range of values within a given minimum and maximum.  
   * (Such an array is also known as a <em>histogram</em>.)
   * The size of each bin is always <code>(max - min) / numBins</code>, where 
   * <code>numBins</code> is a parameter representing the number of bins.
   * A number <em>x</em> goes into one of the bins as follows:
   * <ul>
   * <li>Bin 0: min &lt;=  <em>x</em>  &lt; min + binSize
   * <li>Bin 1: min + binSize &lt;=  <em>x</em>  &lt; min + 2 * binSize
   * <li>Bin 2: min + 2 * binSize &lt;=  <em>x</em>  &lt; min + 3 * binSize
   * <li>...
   * <li>Bin n - 1: min + (n - 1) * binSize &lt;=  <em>x</em>  &lt; max
   * </ul>
   * where n = <code>numBins</code>.  
   * The method returns an array <code>arr</code> of length <code>numBins</code> such
   * that <code>arr[i]</code> contains the <em>count</em> of values from the data set
   * that are in bin i. Thus, "putting a number into a bin" just means
   * incrementing the count at the appropriate bin index. 
   * <p>
   *    * <em>Note:</em> The bin index for a value <em>x</em> can always be computed as
   *  (<em>x</em> - min) / binSize, truncated down to the next lowest integer, so no
   *  complicated conditional statements are needed to determine which bin
   *  <em>x</em> should go into!
   *  <p>
   *  It can be assumed that max &gt; min and numBins &gt; 0.  Values in 
   * the data that are less than min, or greater than or equal to max, are ignored.
   * <p>
   * <em>Example: </em> if <code>nums</code> is the array
   * [18.0, 15.0, 8.0, 16.0, 14.0, 19.0], then for the call
   * <pre>sortIntoBins(nums, 4, 2.0, 24.0);</pre>
   * binSize is (24.0 - 2.0)/4 = 5.5, so the bins are
   * <ul>
   * <li>Bin 0: 2.0 &lt;= x &lt; 7.5
   * <li>Bin 1: 7.5 &lt;= x &lt; 13.0
   * <li>Bin 2: 13.0 &lt;= x &lt; 18.5
   * <li>Bin 3: 18.5 &lt; 24.0
   * </ul>
   * In this case the method returns the array [0, 1, 4, 1].
   * @param data
   *   the data set
   * @param numBins
   *   number of bins
   * @param min
   *   lower bound (inclusive) for numbers to be included in the bins
   * @param max
   *   upper bound (exclusive) for numbers to be included in the bins
   * @return
   *   array whose <em>i</em>th cell contains the number of values in bin <em>i</em>
   */
  public static int[] sortIntoBins(double[] data, int numBins, double min, double max)
  {
    
	
	  
	
    return null;
  }
  
  /**
   * Shifts the elements of the given array to the right by the given amount. 
   * Vacated cells are filled with zeros. 
   * <em>Example:</em> if <code>arr</code> is [10, 20, 30. 40, 50, 60],
   * then after <code>shiftRight(arr, 4)</code>, <code>arr</code> contains
   * [0, 0, 0, 0, 10, 20].  If the shift amount is greater than or equal to 
   * the size of the array, the array would just be filled by all zeros.
   * If <code>amount</code> is negative, then the result is equivalent to the call
   * <code>shiftLeft(-amount)</code>.
   * @param arr
   *   given array to be modified
   * @param amount
   *   amount of shift
   */ 
  public static void shiftRight(int[] arr, int amount)
  {
    //make two loops, one to move them over once, one to redo that loop for amount of times it needs to move over
	if (amount < 0) {
		shiftLeft(arr, -amount);
	}
	
	for (int i = 0; i < amount; i++) {
		for (int j = arr.length - 1; j > 0; j--) {
			arr[j] = arr[j - 1];
		}
		if (!(i > arr.length - 1)) {
			arr[i] = 0;
		}
	}
	  
  }
  
  /**
   * Shifts the elements of the given array to the left by the given amount. 
   * Vacated cells are filled with zeros. 
   * <em>Example:</em> if <code>arr</code> is [10, 20, 30. 40, 50, 60],
   * then after <code>shiftLeft(arr, 4)</code>, <code>arr</code> contains
   * [50, 60, 0, 0, 0, 0].  If the shift amount is greater than or equal to 
   * the size of the array, the array would just be filled by all zeros.
   * If <code>amount</code> is negative, then the result is equivalent to the call
   * <code>shiftRight(-amount)</code>.
   * @param arr
   *   given array to be modified
   * @param amount
   *   amount of shift
   */
  public static void shiftLeft(int[] arr, int amount)
  {
	if (amount < 0) {
		shiftRight(arr, -amount);
	}
	
	int[] copy = new int[arr.length];
	
	for (int i = 0; i < arr.length; i++) {
		copy[i] = arr[i];
	}
		
	for (int i = 0; i < amount; i++) {
		for (int j = 0; j < arr.length - 1; j++) {
			arr[j] = copy[j + 1];
		}
		
		for (int j = 0; j < arr.length; j++) {
			copy[j] = arr[j];
		}
		if (!(i > arr.length - 1)) {
				arr[arr.length - 1 - i] = 0;
		}
	} 
	
  }
  
  /**
   * Cycles the elements of the given array by the given amount, rotating towards the
   * right if amount is positive and left if amount is negative. Values moved
   * off the end of the array are wrapped around. The given array is modified by 
   * this operation. <em>Example:</em> if <code>arr</code> is 
   * [10, 20, 30, 40, 50, 60],
   * then after <code>cycle(arr, 4)</code>, <code>arr</code> contains
   * [30, 40, 50, 60, 10, 20]. Note that the same result would be obtained
   * from <code>cycle(arr, 16)</code> or <code>cycle(arr, -2)</code>
   * @param arr
   *   given array to be modified
   * @param amount
   *   amount of rotation
   */
  public static void cycle(int[] arr, int amount)
  {
	int[] copy = new int[arr.length];
	
	//TODO does'nt work stupid
	
	for (int i = 0; i < amount + 2; i ++) {
		for (int k = 0; k < arr.length; k++) {
			copy[k] = arr[k];
		}
		for (int j = 0; j < arr.length; j++) {
    		arr[j] = copy[Math.floorMod(j + 1, arr.length)];
    	}
	}
  }
  
  /**
   * Returns a new array with duplicate elements removed.  The relative ordering
   * of the first occurrence of each element is unchanged.  The given array
   * is not modified.  The method is case sensitive.
   * <p>
   * <em>Example: </em>Given the array ["Eel", "Aardvark", "Eel", "Dog", "Eel", "Aardvark", "Helicopter", "Dog"], 
   * returns the array ["Eel", "Aardvark", "Dog", "Helicopter"]. 
   * @param arr
   *   given array
   * @return
   *   new array with duplicates removed
   */
  public static String[] removeMultiples(String[] arr)
  {
    String[] list = new String[arr.length];
    
    list[0] = arr[0];
    String first;
    
    for (int i = 0; i < arr.length; i++) {
    	first = arr[0];
    	
    	for (int k = 0; k < arr.length; k++) {
    		if (!first.equals(arr[k])) {
    			list[k] = arr[k];
    		}
    	}
    	
    	for (int j = 0; j < list.length; j++) {
    		arr[j] = list[j];
    	}
    }
    
    return list;
  }
  
  
  /**
   * Given an array, returns a new array consisting of the longest run of
   * consecutive nondecreasing values in the given array.  If there are multiple runs
   * of the same maximal length, the first such run is returned.
   * <em>Example:</em> Given the array
   * [5, 3, 3, 7, 10, 9, 11, 13, 10, 14, 16, 17], the method returns
   * the array [3, 3, 7, 10]
   * @param arr
   *   given array
   * @return
   *   array containing longest nondecreasing run in the given array
   */
  public static int[] longestAscending(int[] arr)
  {
	int count = 1; //how long the run is
	int spot = 0; //where the run starts
	int max = 0; //first and largest run
    for (int i = 0; i < arr.length - 1; i++) {
    	int first = arr[i];
    	int next = arr[i + 1];
    	
    	if (next >= first) {
    		count += 1; //adds to the count for the largest run
    		if (count == 2) {
    			spot = i; //saves the spot for the new run, replacing the old one
    			max = Math.max(max, spot); //sets max to old spot for longest run FIX, SET TO RIGHT MOST ONE!!! //TODO
    		}
    	} else {
    		count = 1; //sets the run count to zero if it restarts
    	}
    }
    
    int[] result = new int[count]; 
    
    for (int i = 0; i < count; i++) {
    	result[i] = arr[max + i];
    }
    
    return result;
  }
  
  
  /**
   * Makes a palindrome from a given array by appending the smallest possible number
   * of elements.  For example,
   * <ul>
   * <li>makeIntoPalindrome([1, 3, 7]) returns [1, 3, 7, 3, 1]
   * <li>makeIntoPalindrome([5, 4, 1, 3, 3, 1]) returns [5, 4, 1, 3, 3, 1, 4, 5]
   * <li>makeIntoPalindrome([1, 3, 3, 1]) returns [1, 3, 3, 1]
   * </ul>
   * @param arr
   *   an array
   * @return
   *   a new array that is a palindrome obtained by appending the fewest
   *   number of elements onto <code>arr</code>
   */
  public static int[] makeIntoPalindrome(int[] arr)
  {
    if (isPalindrome(arr, 0)) {
    	return arr;
    }
	
	//TODO
    
    return null;
  }
}
