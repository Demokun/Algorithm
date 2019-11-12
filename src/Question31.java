import java.util.*;
public class Question31 {
    public void Question31(){}
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA == null || popA == null){
            return false;
        }
        int size = pushA.length;
        boolean res = false;
        Stack stack = new Stack();
        int push_Index = 0;
        int pop_Index = 0;
        stack.push(pushA[0]);
        while(push_Index < size){
            while(!stack.empty()){
                if((int)stack.peek() == popA[pop_Index]) {
                    stack.pop();
                    pop_Index++;
                }
                else{
                    break;
                }
            }
            push_Index ++;
            if(push_Index < size) {
                stack.push(pushA[push_Index]);
            }
        }
        if(stack.empty()){
            res = true;
        }
        return res;
    }
    public static void main(String[] args){
        int[] push = {1,2,3,4,5};
        int[] pop = {4,5,3,2,1};
        Question31 q = new Question31();
        System.out.println(q.IsPopOrder(push,pop));
    }
}
