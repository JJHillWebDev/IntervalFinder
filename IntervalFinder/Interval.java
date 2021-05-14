/**
	This class represents an interval in an array.
	@author Jeremy Hill
	@version 12.0.2
*/
public class Interval
{
	private int smallest;
	private int largest;

	public Interval(int small, int large)
	{
		smallest = small;
		largest = large;
	} 

	/** 
		Returns the smallest integer of the interval.
		@return The smallest integer of the interval. 
	*/
	public int getSmallest()
	{
		return smallest;
	} 

	/** 
		Returns the largest integer of the interval.
		@return The largest integer of the interval. 
	*/
	public int getLargest()
	{
		return largest;
	} 

	public String toString()
	{
		String str = "(" + smallest + ", " + largest + ")";
		return str;
	} 
} 