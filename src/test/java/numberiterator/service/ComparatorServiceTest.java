package numberiterator.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import numberiterator.service.impl.ComparatorServiceImpl;

public class ComparatorServiceTest {


	ComparatorService comparatorService;

	@Before
	public void setUp() throws Exception {

		comparatorService = new ComparatorServiceImpl();
	}

	// Exception is thrown when dividend less than zero
	@Test(expected = Exception.class) 
	public void testDividendMinusOne() {

		Assert.assertEquals(ComparatorServiceImpl.BLANK, comparatorService.checkDividesBy(-1, 3, 5));
	}
	
	// Exception is thrown when first divisor less than one
	@Test(expected = Exception.class) 
	public void testFirstDivisorLessThanOne() {

		Assert.assertEquals(ComparatorServiceImpl.BLANK, comparatorService.checkDividesBy(1, 0, 5));
	}
	
	
	// Exception is thrown when second divisor less than one
	@Test(expected = Exception.class) 
	public void testSecondDivisorLessThanOne() {

		Assert.assertEquals(ComparatorServiceImpl.BLANK, comparatorService.checkDividesBy(1, 3, 0));
	}

	
	
	@Test
	public void testDividendOne() {

		Assert.assertEquals(ComparatorServiceImpl.BLANK, comparatorService.checkDividesBy(1, 3, 5));
	}

	@Test
	public void testDividendThree() {

		Assert.assertEquals("3" + ComparatorServiceImpl.SEPARATOR + ComparatorServiceImpl.FOO, comparatorService.checkDividesBy(3, 3, 5));
	}
	
	@Test
	public void testDividendFive() {

		Assert.assertEquals("5" + ComparatorServiceImpl.SEPARATOR + ComparatorServiceImpl.BAR, comparatorService.checkDividesBy(5, 3, 5));
	}

	@Test
	public void testDividendNine() {

		Assert.assertEquals("9" + ComparatorServiceImpl.SEPARATOR + ComparatorServiceImpl.FOO, comparatorService.checkDividesBy(9, 3, 5));
	}
	
	@Test
	public void testDividendEleven() {

		Assert.assertEquals(ComparatorServiceImpl.BLANK, comparatorService.checkDividesBy(11, 3, 5));
	}

	@Test
	public void testDividendTen() {

		Assert.assertEquals("10" + ComparatorServiceImpl.SEPARATOR + ComparatorServiceImpl.BAR, comparatorService.checkDividesBy(10, 3, 5));
	}

	@Test
	public void testDividendTwelve() {

		Assert.assertEquals("12" + ComparatorServiceImpl.SEPARATOR + ComparatorServiceImpl.FOO, comparatorService.checkDividesBy(12, 3, 5));
	}

	@Test
	public void testDividendFifteen() {

		Assert.assertEquals("15" + ComparatorServiceImpl.SEPARATOR + ComparatorServiceImpl.BAZ, comparatorService.checkDividesBy(15, 3, 5));
	}

}
