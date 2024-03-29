package mapperscan.Tree;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Stack;

public class NumberTurnClass {
    public static void main(String[] args) {
//        int i = -123;
//        System.out.println(NumberTurnClass.trunNumber(i, i));
//        int [] arr = new int[]{1,8,6,2,5,4,8,3,7};
//        System.out.println(NumberTurnClass.getMax(arr));
        NumberTurnClass numberTurnClass = new NumberTurnClass();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        numberTurnClass.rotate(nums, 3);
      int i=  Integer.bitCount(5);
      String  str=  Integer.toBinaryString(5);
        Integer.highestOneBit(5);

       long longtimestamp = LocalDateTime.now().toInstant(ZoneOffset.ofHours(8)).toEpochMilli();
       long longTime2mouthLater=LocalDateTime.now().plusMonths(2).toInstant(ZoneOffset.ofHours(8)).toEpochMilli();
        System.out.println(longtimestamp);
      System.out.println(longTime2mouthLater);
    }

    public int reverseBits(int n) {
        if (n == 0) {
            return 0;
        }
        String str = String.valueOf(n);
        char[] ch = str.toCharArray();
        int len = ch.length;
        int temp = 0;
        for (int i = 0; i < len; i++) {
            int j = i;
            if (ch[j] == 1) {
                int temp1 = 1;
                while (j >= 1) {
                    temp1 = 2 * temp1;
                    j--;
                }
                temp = temp + temp1;
            }
        }
        return temp;
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (k % n == 0) {
            return;
        }
        k = k % n;
        int[] temps = new int[n];
        for (int i = 0; i < n; i++) {
            int j = (k + i) % n;
            temps[j] = nums[i];
        }
        System.arraycopy(temps, 0, nums, 0, n - 1);
        nums = temps;
    }

    public static boolean trunNumber(int num, int num1) {
        int pre = 0;
        while (num != 0) {
            int digist = num % 10;
            num = num / 10;
            pre = pre * 10 + digist;
        }
        if (pre == num1) {
            if (num1 > 0) {
                return true;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int getMax(int[] arr) {
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = (j - i) * Math.min(arr[i], arr[j]);
                maxLen = Math.max(maxLen, tmp);
                if (tmp == 56) {
                    System.out.println(i + "" + j);
                }
            }
        }
        return maxLen;
    }


    class Solution {
        public boolean isPalindrome(int x) {
            // 特殊情况：
            // 如上所述，当 x < 0 时，x 不是回文数。
            // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
            // 则其第一位数字也应该是 0
            // 只有 0 满足这一属性
            if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }

            int revertedNumber = 0;
            while (x > revertedNumber) {
                revertedNumber = revertedNumber * 10 + x % 10;
                x /= 10;
            }

            // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
            // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
            // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
            return x == revertedNumber || x == revertedNumber / 10;
        }
    }


}
