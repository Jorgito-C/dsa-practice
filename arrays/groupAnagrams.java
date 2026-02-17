package arrays;

import java.util.*;

public class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> ans = new ArrayList<>(); //array list for answer

            HashMap<String, List<String>> map = new HashMap<>(); //creating new hashmap

            for (int i = 0; i< strs.length; i++){
                String base = strs[i]; // creats a string with the current letter added

                char[] arr = base.toCharArray(); //puts letter into char array so it is a character
                Arrays.sort(arr); //sorts the array

                String sorted = new String(arr); //puts sortd array into new string sorted

                if(!map.containsKey(sorted)){ //checks if map contains
                    map.put(sorted, new ArrayList<>());
                }
                map.get(sorted).add(base);
            }
            return new ArrayList<>(map.values());
    }
}
