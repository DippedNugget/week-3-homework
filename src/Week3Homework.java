import java.util.Scanner;

public class Week3Homework {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Question 1
		 */
		System.out.println("Question 1a");
		System.out.println(' ');
		
		int ages[] = {3, 9, 23, 64, 2, 8, 28, 93};
		int i = ages.length;
		int subtraction = (ages[i - 1] - (ages[i - i]));
		System.out.println("Difference between the last age and first age is: " + subtraction);
		
		System.out.println(' ');
		System.out.println("Question 1b");
		System.out.println(' ');
		
		int proofAges[] = {3, 9, 23, 64, 2, 8, 28, 93, 37};
		int p = proofAges.length;
		int proofSubtraction = (proofAges[p - 1] - (proofAges[p - p]));
		System.out.println("Difference between the last age and first age is: " + proofSubtraction);
		
		
		System.out.println(' ');
		System.out.println("Question 1c");
		System.out.println(' ');
		
		//using float because it matches a calculator answer (both int and double drop the numerics after the decimal point
		float sumOfArray = 0;
		for (int s = 0; s < proofAges.length; s++) {
			sumOfArray += proofAges[s];
		}
		
		float average = sumOfArray / p;
		
		System.out.println("Average of age is: " + average);
		
		/*
		 * Question 2
		 */
		
		//Create an array of String called names that contains the following values: �Sam�, �Tommy�, �Tim�, �Sally�, �Buck�, �Bob�.
		
		String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		System.out.println(' ');
		System.out.println("Question 2a");
		System.out.println(' ');
		
		//use a loop to iterate through the array and calculate the average number of letters per name
		float sum = 0;
		for (int n = 0; n < names.length; n++) {
			sum += names[n].length();
		} 
		float averageLetter = sum / names.length;
			System.out.println("The average number of letters per name is: " + averageLetter);
			System.out.println(names.length);
		System.out.println(' ');
		System.out.println("Question 2b");
		System.out.println(' ');

		for (String name : names) {
			System.out.print(name + ' ');
		}
		System.out.println(' ');
	
		/*
		* Question 3
		*/
		System.out.println(' ');
		System.out.println("Question 3");
		System.out.println(' ');
		
		// How do you access the last element of any array
			// as you see below it is one space back from the total length of the array
		System.out.println(names[names.length - 1]);


		/*
		 * Question 4
		 */

		System.out.println(' ');
		System.out.println("Question 4");
		System.out.println(' ');

		// How do you access the first element of any array
			// the first element in an array sits at position zero
		System.out.println(names[0]);	

		/*
		 * Question 5
		 */

		System.out.println(' ');
		System.out.println("Question 5");
		System.out.println(' ');
 
		int[] namesLength = new int[names.length];
		for (int a = 0; a < names.length; a++) {
			namesLength[a] = names[a].length(); 
		} System.out.println("No Test to Run");
		
		/*
		 * Question 6
		 */	

		System.out.println(' ');
		System.out.println("Question 6");
		System.out.println(' ');

		int elementsInNamesLength = 0;
		for (int b = 0; b < namesLength.length; b++) {
			elementsInNamesLength += namesLength[b];
		} 
		//was not sure if the question was asking for the sum of the characters in the array or just the sum of the elements
		System.out.println("The Sum of all the characters in the elements is: " + elementsInNamesLength);
		System.out.println("The Sum of the number of elements is: " + namesLength.length);
		
		/*
		 * Question 7 Test
		 */
		System.out.println(' ');
		System.out.println("Question 7");
		System.out.println(' ');

		System.out.println(Hello("Hello", 3));

		/*
		 * Question 8 test
		 */

		System.out.println(' ');
		System.out.println("Question 8");
		System.out.println(' ');

		System.out.println(createFullName("Adam", "Fite"));

		/*
		 * Question 9 test
		 */

		System.out.println(' ');
		System.out.println("Question 9");
		System.out.println(' ');

		System.out.println(isGreater(proofAges));

		/*
		 * Question 10 test
		 */

		double questionAges[] = {3, 9, 23, 64, 2, 8, 28, 93, 37}; //sample array to test method

		System.out.println(' ');
		System.out.println("Question 10");
		System.out.println(' ');

		System.out.println(calculateAverage(questionAges));

		/*
		 * Question 11 test
		 */

		System.out.println(' ');
		System.out.println("Question 11");
		System.out.println(' ');

		 double agesTwo[] = {2, 10, 37, 8}; //another sample array

		 System.out.println(doubleDouble(questionAges, agesTwo));

		 /*
		  * Question 12 test
		  */

		System.out.println(' ');
		System.out.println("Question 12");
		System.out.println(' ');

		boolean isHotOutside = true;
		double moneyInPocket = 9.75;
		
		System.out.println(willBuyMilk(isHotOutside, moneyInPocket));

		/*
		 * Question 13 test
		 */

		System.out.println(' ');
		System.out.println("Question 13");
		System.out.println(' ');

		String missyElliot = "ti esrever dna ti pilf ,nwod gnaht ym tup I ti krow em teL ?ti htrow ti sI";
		missyElliot = rev(missyElliot);
		System.out.println("Come on: " + missyElliot);

		System.out.println(' ');
		System.out.println("Week 3 Homework End");
		System.out.println(' ');
	}
	
		/*
		 * Question 7 Method
		 */
		
		private static String Hello(String word, int n) {
		String Hello = "";
		for (int i = 0; i < n; i++) {
			Hello += word;
		}
		return Hello;
		}
		
		/*
		 *Question 8 Method
		 */

		private static String createFullName(String x, String y) {
			String fullName = x + ' ' + y;
			return fullName;

		}

		/*
		 *Question 9 Method
		 */

		private static boolean isGreater(int[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
			if (sum > 100) {
				return true;
			}
		}
				return false;
		}

		/*
		 *Question 10 Method
		 */

		private static double calculateAverage(double[] numbers) {
			double averageSum = 0;
			for (double number : numbers) {
				averageSum += number;
			}
			return averageSum / numbers.length;		
		}

		/*
		 *Question 11 Method
		 */

		private static boolean doubleDouble(double[] ones, double[] twos) {
			double sumOne = 0;
			double sumTwo = 0;
			double averageOne = sumOne / ones.length;
			double averageTwo = sumTwo / twos.length;
			for (double one : ones){
				sumOne += one;
			}
			for (double two : twos){
				sumTwo += two;
			}
			if (averageOne > averageTwo) {
				return true;
			}
				return false;
			}

		/*
		 *Question 12 Method
		 */

		private static boolean willBuyMilk(boolean x2, double y2) {
			if (x2 == true && y2 > 10.5) {
				return true;
			}
				return false;
			}

		/*
		 *Question 13 Method
		 */

		// reverse it by missy elliot - create a method that when you pass a string to it it will return the string in inverse (such as Hello to olleH)

		private static String rev(String missyElliot) {
			return new StringBuilder(missyElliot).reverse().toString();
		}

		

}

