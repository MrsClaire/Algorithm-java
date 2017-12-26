package java_practise;
import java.util.ArrayList;
//https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035?tpId=13&tqId=11156&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
//输入一个链表，从尾到头打印链表每个节点的值。
class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
    this.val = val;
    }
}
public class Test_04 {
    public static void  main(String args[]) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(5);
        listNode.next.next.next = new ListNode(0);
        Test_04 s = new Test_04();
        s.printListFromTailToHead(listNode);

    }
    //正向输出
 /*   public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
        return null;
    }*/
 //反向输出
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        if (listNode != null)
        {
            this.printListFromTailToHead(listNode.next);
            System.out.println(listNode.val);
        }
        return null;
    }
}
