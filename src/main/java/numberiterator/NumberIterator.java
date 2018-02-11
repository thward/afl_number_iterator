package numberiterator;

import java.util.Scanner;

import numberiterator.controller.DividesByController;

/**
 * Calls iterator controller to determine if dividend can be divided by supplied divisors  
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
						
			System.out.print("Enter sequence size: ");
			Integer sequenceSize = Integer.parseInt(scanner.nextLine());
			
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