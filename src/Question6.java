import java.util.*;
public class Question6 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> ret = new ArrayList<>();
        if(listNode != null){
            ret.addAll(printListFromTailToHead(listNode.next));
            ret.add(listNode.data);
        }
        return ret;
    }
}
