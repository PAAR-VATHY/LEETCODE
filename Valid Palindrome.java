class Solution1 {
    public boolean isPalindrome(String s) {

        String pal = s.toLowerCase();
        pal = pal.replaceAll("[^a-zA-Z0-9]", "");
        int len = pal.length();
        char[] charArray = pal.toCharArray();
        int i = 0;
        int j = len - 1;
        while (i < j) {
            if (charArray[i] != charArray[j])
                return false;
            else {
                i++;
                j--;
            }
        }
        return true;

    }
}