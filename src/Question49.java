import java.util.*;
public class Question49 {
    public int Question49(int index) {
        if (index <= 6) {
            return index;
        }
        if (index <= 0) {
            return 0;
        }
        int[] num = new int[index];
        int num_2 = 0;
        int num_3 = 0;
        int num_5 = 0;
        num[0] = 1;
        for (int i = 1; i < index; i++) {
            int tmp_2 = num[num_2] * 2;
            int tmp_3 = num[num_3] * 3;
            int tmp_5 = num[num_5] * 5;
            int tmpMin = tmp_2 < tmp_3 ? tmp_2 : tmp_3;
            num[i] = tmpMin < tmp_5 ? tmpMin : tmp_5;
            if (num[i] == tmp_2) {
                num_2++;
            }
            if (num[i] == tmp_3) {
                num_3++;
            }
            if (num[i] == tmp_5) {
                num_5++;
            }
        }
        for (int e:num
             ) {System.out.println(e);

        }
        return num[index - 1];
    }
    public static void main(String[] args){
        int input = 7;
        Question49 q = new Question49();
        System.out.println(q.Question49(input));

    }
}
