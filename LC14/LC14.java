
public class LC14 {
    public static void main(String args[]) {
        String[] longestCommonPrefixTestA = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(longestCommonPrefixTestA));
        // Result should be "fl"

        String[] longestCommonPrefixTestB = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(longestCommonPrefixTestB));
        // Result should be ""
    }

    public static String longestCommonPrefix(String[] strs) {
        if ((strs == null) || (strs.length == 0)) { return "";}
        
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) { return "";}
            }
        }

        return prefix;
    }
}
