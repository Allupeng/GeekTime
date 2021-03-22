package List;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReverseSingleListSolutionTest {
    ListNode one;
    ListNode three;
    ListNode two;
    @BeforeEach
    public void init(){
         three = new ListNode(1,null);
         two = new ListNode(1,three);
         one = new ListNode(1,two);
    }
    @Test
    public void Test01(){
        ReverseSingleListSolution list = new ReverseSingleListSolution();
        ListNode head = list.reverseList(one);
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
