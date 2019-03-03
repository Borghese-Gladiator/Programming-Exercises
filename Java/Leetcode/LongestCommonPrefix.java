class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || (strs.length == 0)) {
        return "";
        }
        String pre = strs[0];
        for (int i = 0; i < pre.length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (i < strs[j].length() && strs[0].charAt(i) == strs[j].charAt(i)) {
                    continue;
                }
                else {
                    pre = strs[0].substring(0, i);
                    break;
                }
            }
        }
        return pre;
    }
}