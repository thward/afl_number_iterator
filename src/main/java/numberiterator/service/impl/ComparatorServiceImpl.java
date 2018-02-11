package numberiterator.service.impl;

import numberiterator.service.ComparatorService;

/**
 * An implementation for ComparatorService 
 * 
 * @author Tom Ward
 * @version 1.0
 * 
 */
public class ComparatorServiceImpl implements ComparatorService {

	public static final String BLANK = "";
	public static final String SEPARATOR = " ";
	public static final String FOO = "FOO";
	public static final String BAR = "BAR";
	public static final String BAZ = "BAZ";

	public String checkDividesBy(Integer dividend, Integer divisor1, Integer divisor2) {
		
		if (dividend < 0){
			throw new IllegalArgumentException("Dividend must be greater than or equal to zero"); 
		}
		
		if ((divisor1 < 1)||(divisor2 < 1)){
			throw new IllegalArgumentException("Divisors must be greater than one"); 
		}
		

		if ((dividend % divisor1 == 0) && (dividend % divisor2 == 0)) {
			return dividend.toString() + SEPARATOR + BAZ;
		} else if (dividend % divisor1 == 0) {
			return dividend.toString() + SEPARATOR + FOO;
		} else if (dividend % divisor2 == 0) {
			return dividend.toString() + SEPARATOR + BAR;
		}
		return BLANK;
	}

}
