import java.util.Random;

/**
 * Visualizes a random input stream of integers between 1 and 10.
 * @author sdedison
 *
 */

public class LoopFun {

	public static void main(String[] args) {
		Random rand = new Random();
		for (int i = 0; i < 100; i++) {
			int theNum = rand.nextInt(11) + 1;
			if (theNum == 1) {
				System.out.println("*---------");
			} else if (theNum == 2) {
				System.out.println("**--------");	
			} else if (theNum == 3) {
				System.out.println("***-------");
			} else if (theNum == 4) {
				System.out.println("****------");
			} else if (theNum == 5) {
				System.out.println("*****-----");
			} else if (theNum == 6) {
				System.out.println("******----");
			} else if (theNum == 7) {
				System.out.println("*******---");
			} else if (theNum == 8) {
				System.out.println("********--");
			} else if (theNum == 9) {
				System.out.println("*********-");
			} else if (theNum == 10) {
				System.out.println("**********");
			} else if (theNum == 11) {
				System.out.println("*********** Eleven!");
			}
		}
	}
}
