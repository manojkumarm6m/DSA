package sorting;

import java.util.*;

public class Experiment {


    private static List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> map = new HashMap<>();
        for (String s: strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String z = new String(chars);
            if (!map.containsKey(z)){
                map.put(z, new ArrayList<>());
            }
            map.get(z).add(s);
        }
        return new ArrayList<>(map.values());
    }



    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
