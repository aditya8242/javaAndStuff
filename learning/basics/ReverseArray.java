import java.util.*;

class ReverseArray{
	public static void main(String[] args)
	{
		int[] nums = {1,2,3,4,5};
		
		for(int i = nums.length - 1; i >= 0; i--)
		{
			System.out.println(nums[i]);
		}
	}
}
