package automation.dictionaryTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Dictionary {
    private static Set<String> dictionary = new HashSet<String>(Arrays.asList("work", "king", "row", "now", "wow"));
    private static Set<String> result = new HashSet<String>();

    public static boolean isEnglishWord(String word) {
        return dictionary.contains(word);
    }

    public static void subString(char str[], int n) {
        // Pick starting point
        for (int len = 1; len <= n; len++) {
            // Pick ending point
            for (int i = 0; i <= n - len; i++) {
                StringBuilder res = new StringBuilder();
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    res.append(str[k]);
                }
                if (isEnglishWord(res.toString()))
                    result.add(res.toString());
            }
        }
    }

    public static void permute(String str, int l, int r) {
        if (l == r)
            subString(str.toCharArray(), str.length());
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String str = "working";
        permute(str, 0, str.length() - 1);
        System.out.println(result);
    }
}
