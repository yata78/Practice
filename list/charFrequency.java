package list;

import java.util.*;

class Solution {
    public static String[] charFrequency(String message) {
        Map<Character, Integer> frequencyMap = new TreeMap<>();
        for (char c : message.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        String[] result = new String[frequencyMap.size()];
        int i = 0;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            result[i++] = entry.getKey() + "=" + entry.getValue();
        }

        return result;
    }
}