import java.util.*;
public class Question5 {
    public String replaceSpace(StringBuffer str){
        if(str == null || str.length() == 0){
            return str.toString();
        }
        int length = str.length();
        //统计空格数目
        for(int i = 0;i < length;i ++){
            if(str.charAt(i) == ' '){
                str.append("  ");
            }
        }
        int start = length - 1;
        int end = str.length() - 1;
        while(start >= 0){
            if(str.charAt(start) == ' '){
                str.setCharAt(end,'0');
                end --;
                str.setCharAt(end,'2');
                end --;
                str.setCharAt(end,'%');
                end --;
            }
            else{
                char tmp = str.charAt(start);
                str.setCharAt(end,tmp);
                end --;
            }
            start --;
        }
        return str.toString();
    }
    public static void main(String[] args){
        StringBuffer str = new StringBuffer("hello world");
        Question5  q = new Question5();
        System.out.println(q.replaceSpace(str));
    }
}
