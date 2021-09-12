package com.saltedfish.algorithms;

/**
 * @author SaltedFish
 * @date 2021/9/12
 */

/**
 * 给你一个下标从 0 开始的字符串 word 和一个字符 ch 。找出 ch 第一次出现的下标 i ，
 * 反转 word 中从下标 0 开始、直到下标 i 结束（含下标 i ）的那段字符。如果 word 中不存在字符 ch ，则无需进行任何操作。
 *
 * 例如，如果 word = "abcdefd" 且 ch = "d" ，那么你应该 反转 从下标 0 开始、直到下标 3 结束（含下标 3 ）。结果字符串将会是 "dcbaefd" 。
 * 返回 结果字符串 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：word = "abcdefd", ch = "d"
 * 输出："dcbaefd"
 * 解释："d" 第一次出现在下标 3 。
 * 反转从下标 0 到下标 3（含下标 3）的这段字符，结果字符串是 "dcbaefd" 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-prefix-of-word
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode5867 {
    class Solution {
        public String reversePrefix(String word, char ch) {
            int index = word.indexOf(ch);
            StringBuilder res = new StringBuilder();
            res.append(word.substring(0,index + 1));
            res.reverse();
            res.append(word.substring(index + 1));
            return res.toString();
        }
    }

    public static void main(String[] args) {
        LeetCode5867.Solution solution = new LeetCode5867().new Solution();
        System.out.println(solution.reversePrefix("abcdefd", 'd'));
    }
}
