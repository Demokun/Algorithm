import java.util.*;
public class Question18 {
    private ListNode Question18(ListNode head,ListNode delNode){
        if(head == null || delNode ==null){
            return null;
        }
        if(delNode.next == null){
            if(head == delNode){
                head = null;
            }
            else {
                ListNode del = new ListNode();
                del = head;
                while (del.next != delNode) {
                    del = head.next;
                }
                del.next = null;
            }
        }
        else{
                ListNode del = delNode.next;
                delNode.data = del.data;
                delNode.next = del.next;
        }
        return head;
    }
    public static void main(String[] args){
        Question18 q = new Question18();
        ListNode node_1 = new ListNode();
        node_1.data = 1;
        ListNode node_2 = new ListNode();
        node_1.next = node_2;
        node_2.data = 2;
        ListNode node_3 = new ListNode();
        node_2.next = node_3;
        node_3.data = 3;
        ListNode res = q.Question18(node_1,node_2);
        System.out.println("node_1=" + res.data +"node_3=" + res.next.data);
    }
}
