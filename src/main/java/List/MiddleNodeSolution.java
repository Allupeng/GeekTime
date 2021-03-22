package List;

/**
 * 求链表的中间结点
 */
public class MiddleNodeSolution {
    public ListNode middleNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null){
        slow = slow.next; //慢指针一次移动一个结点
        fast = fast.next.next;  //快指针一次移动两个结点
    }
    return slow;
    }
}
