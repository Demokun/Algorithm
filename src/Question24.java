import java.util.*;
public class Question24 {
    private ListNode Question24(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode preNode = head;
        ListNode pNode = head.next;
        ListNode postNode = pNode;
        while(pNode.next != null){
            System.out.println("hello");
            postNode = pNode.next;
            pNode.next = preNode;
            preNode = pNode;
            pNode = postNode;
        }
        pNode.next = preNode;
        head = pNode;
        while(pNode.next != null){
            System.out.println("hi");
            System.out.println("pNode = " + pNode.data);
            pNode = pNode.next;
        }
        pNode.next = null;
        return head;
    }
    public static void main(String[] args){
        ListNode node_1 = new ListNode();
        ListNode node_2 = new ListNode();
        ListNode node_3 = new ListNode();
        node_1.data = 1;
        node_1.next = node_2;
        node_2.data = 2;
        node_2.next = node_3;
        node_3.data = 3;
        Question24 q = new Question24();
        System.out.println(q.Question24(node_1));
    }
}
