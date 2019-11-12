import java.util.*;
public class Question17 {
    public void Question17(int n){
        if(n < 1){
            System.out.println("error");
        }
        char[] number = new char[n];
        int length = number.length;
        for(int i = 0;i < length;i ++){
            number[i] = '0';
        }
        while(!increment(number)){
            printNumber(number);
        }

    }
    private boolean increment(char[] number){
        boolean overFlow = false;
        int takeOver = 0;
        int length = number.length;
        for(int i = length - 1;i >= 0;i --){
            System.out.println("number" + i + "=" + number[i]);
            int sum = number[i] - '0' + takeOver;
            if(i == length - 1){
                sum ++;
            }
            if(sum >= 10){
                if(i == 0){
                    overFlow = true;
                }
                else{
                    sum =sum - 10;
                    takeOver = 1;
                    number[i] = (char)('0' + sum);
                }
            }
            else{
                number[i] = (char)('0' + sum);
                break;
            }
        }
        return overFlow;
    }
    private void printNumber(char[] number){
        int length = number.length;
        boolean begin = true;
        for(int i = 0;i < length - 1;i ++){
            if(begin && number[i] != '0'){
                begin = false;
            }
            if(!begin){
                System.out.println(number[i]);
            }

        }
        System.out.println();
    }
    public static void main(String[] args){
        int n  = 4;
        Question17 q = new Question17();
        q.Question17(n);

    }


}
