import java.util.*;
public class GenericTest {
    public void showKeyValue(Generic<? extends Number> obj){
        //public void showKeyValue(Generic<?> obj)
        System.out.println(obj.getKey());
    }
    public static void main(String[] args){
        Generic<Number> genericNum = new Generic<>(123);
        Generic<Integer> genericInteger = new Generic<>(456);
        GenericTest gt = new GenericTest();
        gt.showKeyValue(genericInteger);
        gt.showKeyValue((genericNum));

    }
}
