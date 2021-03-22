package List;

/**
 * 合并两个有序链表
 * LeetCode21
 */
public class MergeTwoListsSolution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) return l2;//如果l1为空 返回l2
    if (l2 == null) return l1;//如果l2为空 返回l1
    ListNode head = new ListNode(); //创造一个头结点
    ListNode index = head;
    while (l1 != null && l2 != null){
        if (l1.val <= l2.val){
            index.next = l1;
            l1 = l1.next;
        }else {
            index.next = l2;
            l2 = l2.next;
        }
        index = index.next;
    }
    if (l1 != null){ index.next = l1; }//l1没有遍历完，直接将l1链接到index结点后
    if (l2 != null){ index.next = l2; }//l2没有遍历完，直接将l2链接到index结点后
    return head.next;
    }
}
