import java.util.*;

class Solution {
    public int romanToInt(String s) {

        HashMap<Character, Integer> Map = new HashMap<>();

        Map.put('I', 1);
        Map.put('V', 5);
        Map.put('X', 10);
        Map.put('L', 50);
        Map.put('C', 100);
        Map.put('D', 500);
        Map.put('M', 1000);

        char[] arr = s.toCharArray();
        int len = arr.length;

        int sum = 0;
        int temp = 0;

        for (int i = len - 1; i >= 0; i--) {
            int val = Map.get(arr[i]);

            if (temp > val) {
                sum = sum - val;
            } else
                sum += val;
            temp = val;
        }

        return sum;

    }
}