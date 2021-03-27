package com.saltedfish.algorithms;

import com.saltedfish.baseclass.ListNode;

/**
 * @author SaltedFish
 * @date 2021/3/27
 */
public class LeetCode0082 {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) {
                return null;
            }

            ListNode dummy = new ListNode(0, head);
            ListNode cur = dummy;

            while (cur.next != null && cur.next.next != null) {
                if (cur.next.val == cur.next.next.val) {
                    int x = cur.next.val;
                    while (cur.next != null && cur.next.val == x) {
                        cur.next = cur.next.next;
                    }
                } else {
                    cur = cur.next;
                }
            }

            return dummy.next;
        }
    }
}
