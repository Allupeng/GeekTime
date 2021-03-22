package List;

/**
 * 删除链表的倒数第n个结点[19]
 */
public class RemoveNthFromEndSolution {
    //这里需要处理一下，cur返回的是待删除结点的前一个结点。
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode result = new ListNode(0,head);
    ListNode k = head;
    ListNode cur = result; //k链表先走 n个距离
    for (int i = 0; i < n; i++){
        k = k.next;
    }
    while (k != null){//当k链表走到底部，说明已经到了n-k了
        k = k.next;
        cur = cur.next;
    }
    cur.next = cur.next.next;//删除n结点
    return result.next;
    }
}
