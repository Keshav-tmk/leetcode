class Solution {

    public void help(int i, String digits, String s, List<String> ans, Map<Character, String> map) {
        if (i == digits.length()) {
            ans.add(s);
            return;
        }
        for (char ch : map.get(digits.charAt(i)).toCharArray()) {
            help(i + 1, digits, s + ch, ans, map);

        }

    }

    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = new HashMap<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        List<String> ans = new ArrayList<>();
        help(0, digits, "", ans, map);
        return ans;

    }
}