import java.util.*;
public class Question58 {
    public String leftReverse(String str,int n){
        if(str == null || str.length() == 0){
            return str;
        }
        char[] chars = str.toCharArray();
        int start = 0;
        int end = 0;
        int length = str.length() - 1;
        Reverse(chars,start,n - 1);
        //System.out.println(str);
        Reverse(chars,n,length);
        Reverse(chars,0,length);
        return new String(chars);
    }
    public static void main(String[] args){
        String str = "abcdefg";
        Question58 q = new Question58();
        System.out.println(q.leftReverse(str,3));
    }
    public String Question58(String str){
        if(str == null || str.length() == 0){
            return str;
        }
        int length = str.length();
        char[] chars = str.toCharArray();
        int start = 0;
        int end = start + 1;
        Question58 q = new Question58();
        while(end < length){
            if(end == length - 1 || chars[end] == ' '){
                q.Reverse(chars,start,end - 1);
                start = end + 1;
            }
            end ++;
        }
        q.Reverse(chars,0,length - 1);
        return new String(chars);
    }
    public void Reverse(char[] chars,int start,int end){
        while(start < end){
            swap(chars,start,end);
            System.out.println(chars);
            start ++;
            end --;
        }
    }
    public void swap(char[] chars,int i ,int j){
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }
}
