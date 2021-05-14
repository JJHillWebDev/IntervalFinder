import java.util.List;

/**
	This class finds the indices that bound the interval.
	@author Jeremy Hill
	@version 12.0.2
*/
public class IntervalFinder 
{
    public static Interval findInterval(Integer[] sortedData, List<Integer> values) 
    {
        //getting the max and min value in values
        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;

        for(Integer i : values)
        {
            if(max < i)
            {
                max = i;
            }
            if(min > i)
            {
                min = i;
            }
        }

        Integer smallest = 0;
        Integer largest = 14;

        while(smallest < sortedData.length && sortedData[smallest] <= min)
        {
            smallest++;
        }
        smallest = smallest - 1;

        while(largest > 0 && sortedData[largest] >= max)
        {
            largest--;
        }
        largest = largest + 1;

       return new Interval(smallest, largest);
    }
}



