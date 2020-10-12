class Solution {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        int unMatched = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                unMatched++;
            }
        }
        if (unMatched == 2) {
            return true;
        }
        return false;
    }
}
