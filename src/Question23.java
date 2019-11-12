import java.util.*;
public class Question23 {
    private ListNode Question23(ListNode pHead){
        if(pHead == null || pHead.next == null){
            return null;
        }
        ListNode slowNode = pHead.next;
        ListNode quickNode = slowNode.next;
        ListNode meetingNode = null;
        while(slowNode.next != null && quickNode.next != null){
            if(quickNode == slowNode){
                break;
            }
            slowNode = slowNode.next;
            quickNode = quickNode.next;
            if(quickNode != null){
                quickNode = quickNode.next;
            }
        }
        if(quickNode == slowNode){
            meetingNode = quickNode;
            System.out.println(meetingNode.data);
        }
        else{
            return null;
        }

        ListNode countNode = meetingNode.next;
        int n = 1;
        while(countNode != meetingNode){
            n++;
            countNode = countNode.next;
            System.out.println("n = " + n);
        }

        quickNode = pHead;
        slowNode = pHead;
        for(int i = 0;i < n;i ++){
            quickNode = quickNode.next;
            System.out.println("quickNode = " + quickNode.data);
        }

        while(quickNode != slowNode){
            quickNode = quickNode.next;
            slowNode = slowNode.next;
        }
        return slowNode;
    }
    public static void main(String[] args){
        ListNode node_1 = new ListNode();
        ListNode node_2 = new ListNode();
        ListNode node_3 = new ListNode();
        ListNode node_4 = new ListNode();
        ListNode node_5 = new ListNode();
        ListNode node_6 = new ListNode();
        node_1.data = 1;
        node_1.next = node_2;
        node_2.data = 2;
        node_2.next = node_3;
        node_3.data = 3;
        node_3.next = node_4;
        node_4.data = 4;
        node_4.next = node_5;
        node_5.data = 5;
        node_5.next = node_6;
        node_6.data = 6;
        node_6.next = node_3;
        Question23 q = new Question23();
        System.out.println(q.Question23(node_1));
    }
}
