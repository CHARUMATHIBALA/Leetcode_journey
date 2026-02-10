class Solution {
    public char findTheDifference(String s, String t) {
        char res = 0;

        for (char c : s.toCharArray()) {
            res = (char)(res ^ c);
        }

        for (char c : t.toCharArray()) {
            res = (char)(res ^ c);
        }

        return res;
    }
}
