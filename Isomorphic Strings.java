
class Solution {
    public boolean isIsomorphic(String s, String t) {

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        int len1 = arr1.length;
        int len2 = arr2.length;

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < len1; i++) {
            if (map.containsKey(arr1[i])) {
                if (!map.get(arr1[i]).equals(arr2[i])) {
                    return false;

                }
            } else {
                if (map.containsValue(arr2[i]))
                    return false;
            }
            map.put(arr1[i], arr2[i]);

        }

        return true;

    }
}