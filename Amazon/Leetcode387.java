public class Leetcode387 {
    //6Company #0 Days Challenge 
    //Leetcode 387 --> First Unique Character in a String

    public static int firstUniqChar(String s) {
        int freq[] = new int[26];
        char chars[] = s.toCharArray();
        for (char c : chars) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (freq[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
