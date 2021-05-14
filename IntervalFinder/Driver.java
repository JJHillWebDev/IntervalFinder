import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
/**A demonstration of the class IntervalFinder.

   @author Charles Hoot
   @version 4.0
 */
public class Driver
{
	public static void main(String args[])
	{
		Random generator = new Random();

		final int N = 15;

		// Generate a random array of integers
		Integer sortedData[] = new Integer[N];
		List<Integer> targets = null;
		// for(int i = 0; i < N; i++)
		// {
		// 	Integer value = generator.nextInt(10);
		// 	sortedData[i] = value;

		// 	// Guarantee is larger than the last value
		// 	if (i > 0 && sortedData[i] < sortedData[i-1])
		// 		sortedData[i] += sortedData[i-1];
		// } // end for

		// sortedData[0] = 6;
		// sortedData[1] = 9;
		// sortedData[2] = 17;
		// sortedData[3] = 26;
		// sortedData[4] = 34;
		// sortedData[5] = 37;
		// sortedData[6] = 45;
		// sortedData[7] = 47;
		// sortedData[8] = 51;
		// sortedData[9] = 57;
		// sortedData[10] = 65;
		// sortedData[11] = 72;
		// sortedData[12] = 76;
		// sortedData[13] = 81;
		// sortedData[14] = 84;

		sortedData[0] = 6;
		sortedData[1] = 6;
		sortedData[2] = 10;
		sortedData[3] = 16;
		sortedData[4] = 19;
		sortedData[5] = 21;
		sortedData[6] = 24;
		sortedData[7] = 30;
		sortedData[8] = 35;
		sortedData[9] = 39;
		sortedData[10] = 39;
		sortedData[11] = 48;
		sortedData[12] = 52;
		sortedData[13] = 60;
		sortedData[14] = 64;

		System.out.println("The sorted data is:");  
		for (int i = 0; i < N; i++)
			System.out.print(sortedData[i] + "  ");
		System.out.println();

		targets = getTargetValues();

		boolean done = (targets.size() == 0);            
		while (!done)
		{
			Interval result = IntervalFinder.findInterval(sortedData, targets);
			System.out.println("The pair of indices that bound the interval " + 
					"containing the given values is " + result);
			System.out.println();
			targets = getTargetValues();
			done = (targets.size() == 0);
		} // end while

		System.out.println("Goodbye!");
	} // end main

	/** Initializes the list of ints by reading them from the keyboard.
		@return  A list of integers. */
	public static List<Integer> getTargetValues()
	{
		List<Integer> result = new ArrayList<>();
		System.out.println("Enter the list of integer values (all on one line), " +
				"or just press enter if you are done.");
		Scanner fromKeyboard = new Scanner(System.in);
		String values = fromKeyboard.nextLine();

		Scanner dataValues = new Scanner(values);

		while (dataValues.hasNextInt())
		{
			int data = dataValues.nextInt();
			result.add(new Integer(data));            
		} // end while

		return result;
	} // end getTargetValues
} // end Driver

/*
The sorted data is:
2  6  6  6  9  10  14  21  26  27  33  40  46  46  52  
Enter the list of integer values (all on one line), or just press enter if you are done.
2 52
The pair of indices that bound the interval containing the given values is (0, 14)

Enter the list of integer values (all on one line), or just press enter if you are done.
7 42 20
The pair of indices that bound the interval containing the given values is (3, 12)

Enter the list of integer values (all on one line), or just press enter if you are done.

Goodbye!

 */
