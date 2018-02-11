package numberiterator.controller;

import numberiterator.service.ComparatorService;
import numberiterator.service.impl.ComparatorServiceImpl;

/**
 * Provides iterator than calls comparator service  
 * 
 * @author Tom Ward
 * @version 1.0
 * 
 */
public class DividesByController {

	/**
	 * Given the sequence size and pair of divisors, iterates through sequence and 
	 * prints result of whether dividend can be divided by both divisors.
	 * 
	 * @param sequenceSize
	 *            The sequence size
	 * @param divisor1
	 *            The first divisor
	 * @param divisor2
	 *            The second divisor
	 * 
	 */
	public static void iterateSequence(Integer sequenceSize, Integer divisor1, Integer divisor2) {

		ComparatorService comparatorService = new ComparatorServiceImpl();

		for (int dividend = 0; dividend <= sequenceSize; dividend++) {
			System.out.println("Dividend " + dividend + " returns: "
					+ comparatorService.checkDividesBy(dividend, divisor1, divisor2));
		}
	};

}
