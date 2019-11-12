import java.util.*;
public class Question30 {
    public void Question30(){}
    Stack<Integer> s_data = new Stack<>();
    Stack<Integer> s_min = new Stack<>();
    public void push(int node) {
        System.out.println(node);
        s_data.push(node);
        if(s_min.size() == 0 ||node < s_min.peek()){
            s_min.push(node);
        }
        else{
            s_min.push(s_min.peek());
        }
    }

    public void pop() {
        s_data.pop();
        s_min.pop();

    }

    public int top() {
        return s_data.peek();
    }

    public int min() {
        return s_min.peek();
    }
    public static void main(String[] args){
        Question30 q = new Question30();
        q.push(30);
        for (Integer i:q.s_data
             ) {System.out.println(i);

        }
    }
}
