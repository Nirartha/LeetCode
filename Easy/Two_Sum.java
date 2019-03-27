package Easy;

/*
 * 
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * @author Kuanyow Chen (Dennis)
 * 
 */
public class Two_Sum {
	
	public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            result[0] = i;
            int j = target - nums[i];
            
            if (nums.length > i + 1) {
                for (int k = i + 1; k < nums.length; k++) {
                    if (nums[k] == j) {
                        result[1] = k;
                        return result;
                    }
                }
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		
		/*
		 * Test Case
		 * Because nums[0] + nums[1] = 2 + 7 = 9,
		 * return [0, 1].
		 */
		
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		
		Two_Sum twosum = new Two_Sum();
		int[] result = twosum.twoSum(nums, target);
		
		for (int i: result) {
			System.out.println(i);
		}
		
	}
	
}
