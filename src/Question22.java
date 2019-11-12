import java.util.*;
public class Question22 {
    private ListNode Question22(ListNode head,int k){
        if(head == null || k == 0){
            return null;
        }
        ListNode firstNode = head;
        ListNode secNode = head;
        for(int i = 0;i < k - 1;i ++){
            if(firstNode.next != null){
                firstNode = firstNode.next;
            }
            else{
                return null;
            }
        }
        while(firstNode.next != null){
            System.out.println("hello");
            firstNode = firstNode.next;
            secNode = secNode.next;
            System.out.println("firstNode = " + firstNode.data);
            System.out.println("secNode = " + secNode.data);
        }
        return secNode;
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
        int k = 1;
        Question22 q = new Question22();
        System.out.println(q.Question22(node_1,k));

    }
}
