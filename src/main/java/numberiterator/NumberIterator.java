package numberiterator;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

import numberiterator.controller.DividesByController;

/**
 * Command line client to determine if dividend can be divided by supplied divisors  
 * 
 * @author Tom Ward
 * @version 1.0
 * 
 */
public class NumberIterator {
	public static void main(String[] args) {

		boolean carryOn = true;
		Scanner scanner = new Scanner(System.in);
		
		while (carryOn){
			
			String sequenceSizeChar = null;
			Integer sequenceSize = 0;
			
			boolean sequenceSizeIsValid = false;
			while (!sequenceSizeIsValid){
				System.out.print("Enter sequence size: ");
				sequenceSizeChar = scanner.nextLine();
				if (!StringUtils.isNumeric(sequenceSizeChar))
					System.out.println("Sequence size must be numeric, and greater than or equal to zero");
				else
					sequenceSizeIsValid = true;
			}
			
			sequenceSize = Integer.parseInt(sequenceSizeChar);
			
			DividesByController.iterateSequence(sequenceSize, 3, 5);
		
			System.out.print("(q)uit ?: ");
			String operator = scanner.nextLine();
	
            if ("q".equals(operator)) {
                System.out.println("Bye!");
                break;
            }
		}
		scanner.close();

	}

}