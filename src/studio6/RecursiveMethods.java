package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		if (n==0) {
			return 0;
		}
		else {
			return geometricSum(n-1)+1/Math.pow(2,n);
		}
			// FIXME compute the geometric sum for the first n terms recursively
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		int a = q;
		
		if (p%q==0) {
			return q;
		}
		else {
			q = p%q;
			p = a;
			return gcd(p, q);
		}
//			for (int i=q;i>0;i++)
//			{
//				if (q%i==0 && (p%q)%i==0) {
//					result = i;
//				}
//			}
//			return gcd(q);
		}
		
			// FIXME compute the gcd of p and q using recursion
//			return 0;
		
	
	public static int[] toReversedHelper(int[] array, int index, int[] result) {
		index = array.length / 2;
		int lastIndex = array.length - 1;
		int mirrorIndex = lastIndex - index;
		int[] result = new int[array.length];
		result[index] = array[mirrorIndex];
		result[mirrorIndex] = array[index];
		result = toReversedHelper(array, index);
		
		// FIXME create a helper method that can recursively reverse the given array
		return result;
	
}
	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int[] result = new int[array.length];
		if (array.length == 0) {
			return result;
		}
		else {
			return toReversedHelper(array, array.length/2, result);
		}
			// FIXME create a helper method that can recursively reverse the given array
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	}

}
