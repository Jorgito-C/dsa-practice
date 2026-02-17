class Solution {
    public boolean containsDuplicate(int[] nums){
        //create a HashSet to store elements from the array
        HashSet<Integer> seenNumbers = new HashSet<>();

        //iterate through each element in the array
        for(int num : nums){
            //Check if the element is already in the hashSet
            if (seenNumbers.contains(num)) {
                return true; //duplicate found
            }
            seenNumbers.add(num);
        }
        return false; //no duplicates found
    }
}