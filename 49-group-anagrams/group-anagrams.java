import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] a = strs[i].toCharArray();
            Arrays.sort(a);
            String ss = new String(a);

            if (!map.containsKey(ss)) {
                map.put(ss, new ArrayList<>());
            }
            map.get(ss).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}