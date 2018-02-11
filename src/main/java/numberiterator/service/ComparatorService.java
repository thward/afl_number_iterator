package numberiterator.service;

/**
 * Specifies a method for determining whether dividend can be divided by supplied divisors  
 * 
 * @author Tom Ward
 * @version 1.0
 * 
 */
public interface ComparatorService {
	
	/**
	 * Given the dividend returns whether it can be divided by pair of divisors 
	 * 
	 * @param dividend
	 *            The dividend
	 * @param divisor1
	 *            The first divisor
   	 * @param divisor2
	 *            The second divisor
	 * @return String 
	 * 			the number and “FOO” only when the integer is divisible by divisor 1<br>
	 *			the number and “BAR” only when the integer is divisible by divisor 2<br>
	 *			the number and “BAZ” when the dividend is divisible by divisor 1 and when the dividend is divisible by divisor 2
	 */
	public String checkDividesBy(Integer dividend, Integer divisor1, Integer divisor2);
	

}
