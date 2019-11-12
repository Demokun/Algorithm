import java.util.*;
public class Question48 {
    public int Question48(String str){
        int max = 0;
        int cur = 0;
        int[] mark = new int[26];
        Arrays.fill(mark,-1);
        int length = str.length();
        for(int i = 0;i < length;i ++){
            int charIndex = str.charAt(i) - 'a';
            int markIndex = mark[charIndex];
            if(markIndex == -1 || i - markIndex> cur){
                cur ++;
            }
            else{
                max = cur;
                cur = i - markIndex;
            }
            mark[charIndex] = i;

        }
        max = max > cur ? max : cur;
        return max;
    }
    public static void main(String[] args){
        String x = "arabcacfr";
        Question48 q = new Question48();
        System.out.println(q.Question48(x));
    }
}
