class Solution {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        if (len1 != len2)
            return false;

        int len = len1;

        int flag = 0;

        char[] Array1 = s.toCharArray();
        char[] Array2 = t.toCharArray();

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (Array1[i] == Array2[j]) {
                    flag++;
                    Array2[j] = ' ';
                    break;
                }
            }
        }

        if (flag == len)
            return true;
        else
            return false;

    }
}