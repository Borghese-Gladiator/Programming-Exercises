class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> numeralMapping = new HashMap<>();
        numeralMapping.put('I', 1);
        numeralMapping.put('V', 5);
        numeralMapping.put('X', 10);
        numeralMapping.put('L', 50);
        numeralMapping.put('C', 100);
        numeralMapping.put('D', 500);
        numeralMapping.put('M', 1000);
    
        int result = 0;
        result += numeralMapping.get(s.charAt(0));
        
        for (int i = 1; i < s.length(); i++) {
            int prev = numeralMapping.get(s.charAt(i - 1));
            int curr = numeralMapping.get(s.charAt(i));
            
            if (prev < curr) {
                result += curr - 2 * prev;
            } else {
                result += curr;
            }
        }
        
        return result;
    }
}