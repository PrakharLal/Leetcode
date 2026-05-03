// Title: Add Two Numbers
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/add-two-numbers/

        while (l1 != null || l2 != null || carry != 0) {
            
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }

        return dummy.next;
    }
}
