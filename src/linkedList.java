/*
LL:从尾到头打印链表
P58
 */
import java.util.LinkedList;
import java.util.Stack;
import java.util.Iterator;

public class linkedList {
    private LinkedList LL(LinkedList ll){
        LinkedList<String> result = new LinkedList();
        Stack<String> s = new Stack();
        Iterator<String> iter_ll = ll.iterator();
        while(iter_ll.hasNext()){
            String num = iter_ll.next();
            s.push(num);
            System.out.println(num);
        }
        Iterator<String> iter_s = s.iterator();
        Iterator<String> iter_res = result.iterator();
        while(iter_s.hasNext()){
            String res = s.pop();
            result.add(res);
            System.out.println(res);
        }
        return result;
    }
    public static void main(String[] args){
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("one");
        ll.add("two");
        ll.add("three");
        linkedList linklist = new linkedList();
        LinkedList<String> result = linklist.LL(ll);
        for(String element : result){
            System.out.println(element);
        }
    }


}
