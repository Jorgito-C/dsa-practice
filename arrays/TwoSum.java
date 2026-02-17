class Solution{
    public int[] twoSum(int[] nums, int target) {
        //Create a HashMap to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();

        //iterate thorugh the array
        for (int i = 0; i < nums.length; i++) {
            //Calculate the complement of the currnent number Ex; target is 9. current number is 2, so complement would be 7
            int complement = target - nums[i];

            //check if the complement is already in the map
            if (map.containsKey(complement)) {
                //if complement is there, return the indices of the complement and the current number
                return new int[] {map.get(complement), i};
            }

            // if not there, add the current number and its index to the map. [key is number, value is index]
            map.put(nums[i], i);
        }
        return new int[] {}; //return empty array if no solution is found
    }
}