package List;

/**
 * 反转单链表
 * GeekTime
 * LeetCode [206]反转链表
 * 例如: 1->2->3->null
 * 反转后 3->2->1->null
 */
public class ReverseSingleListSolution {
    /**
     * 迭代法
     * @param head
     * @return ListNode
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = null;
        ListNode current = head;
        while (current != null) {
        ListNode next = current.next;
        current.next = pre;
        pre = current;
        current = next;
        }
        return pre;
    }
    /**
     * 迭代法
     * @param head
     * @return ListNode
     */
    public ListNode reverseListByRecursion(ListNode head) {
    return reverse(null,head);
    }

    public ListNode reverse(ListNode pre,ListNode cur){
        if (cur == null) return null;
        ListNode next = cur.next;
        cur.next = pre;
        return reverse(cur,next);
    }
}
