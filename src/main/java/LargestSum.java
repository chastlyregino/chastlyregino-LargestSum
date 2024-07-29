
import java.util.*;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        Integer[] numsArray = nums.toArray(new Integer[0]);
        int arrayLength = numsArray.length;
        Arrays.sort(numsArray);
        
        return numsArray[arrayLength - 1] + numsArray[arrayLength - 2];
    }
}