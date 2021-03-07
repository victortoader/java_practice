package longestSubstringWithoutRepeatingChars;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int n=s.length(), ans=0;
        Map<Character, Integer> map= new HashMap<>();
        for(int j=0, i=0; j<n; j++) {
            if(map.containsKey(s.charAt(j))) {
                System.out.println("Already exists: "+s.charAt(j));
                i=Math.max(map.get(s.charAt(j)), i);
            }
            ans=Math.max(ans, j-i+1);
            map.put(s.charAt(j), j+1);
            System.out.println("map is: "+map);
            System.out.println("ans is: "+ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("ababcd"));
    }
}
