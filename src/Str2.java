import java.util.*;
public class Str2 {
    private  int index = 0;
    public static  void main(String[] args){
        char[] str = new char[9];
        str[0] = '1';
        str[1] = '2';
        str[2] = '3';
        str[3] = '.';
        str[4] = '4';
        str[5] = '5';
        str[6] = 'e';
        str[7] = '+';
        str[8] = '6';
        Str2 s = new Str2();
        System.out.println(s.Str2(str));
    }
    public boolean  Str2(char[] str){
        if(str.length < 1){
            return false;
        }
        boolean numeric = scanInteger(str);
        if(index < str.length && str[index] == '.'){
            index ++;
            System.out.println(". = " + index);
            numeric = scanUnsignedInteger(str)|| numeric;
        }
        if(index < str.length && (str[index] == 'e' || str[index] == 'E')){
            index ++;
            numeric = numeric && scanInteger(str);
        }
        System.out.println("numeric = " + numeric);
        System.out.println("index = " +index);
        System.out.println("str.length = " + str.length);
        return numeric && index == str.length;
    }
    private boolean scanInteger(char[] str){
        if(index < str.length && (str[index] == '+' || str[index] == '-')){
            index ++;
            System.out.println("jjjj" + index);
        }
        System.out.println("alskdjf = " + index);
        return scanUnsignedInteger(str);
    }
    private boolean scanUnsignedInteger(char[] str){
        int start = index;
        while(index < str.length && str[index] >= '0' && str[index] <= '9'){
            index ++;
            System.out.println("unsigned = " + index);
        }
        return start < index;
    }
}
