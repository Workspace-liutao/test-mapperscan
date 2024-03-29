package mapperscan.Tree;

import org.springframework.util.StringUtils;

public class CommonStringClass {
    public static void main(String[] args) {
        String[] strs = new String[]{"abcd", "abc", "ab"};
        String str1 = "def";
        String str3 = null;
        String str2 = new String("def");
        System.out.println("str1=" + System.identityHashCode(str1) + "str2=" + System.identityHashCode(str2));
        System.out.println("str3=" + System.identityHashCode(str3));
        String str = strs[0];
        for (int i = 0; i < strs.length; i++) {
            str = getCommonString(str, strs[i]);
            if (str == "") {
                break;
            }
        }
        System.out.println(str);
    }

    public static String getCommonString(String str1, String str2) {
        int m = str1.length() - 1;
        int n = str2.length() - 1;
        int j = Math.min(m, n);
        int left = 0;
        while (left <= j) {
            if (left <= j && str1.charAt(left) == str2.charAt(left)) {
                left++;
            } else {
                break;
            }
        }
        System.out.println(left);
        return str1.substring(0, left);
    }
}
