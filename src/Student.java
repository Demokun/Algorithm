import java.util.*;
public class Student extends Person {
    private int stuId;
    public  Student(String name){
        super(name);
        stuId = 100;
    }
    public void getDes(){
        System.out.println("name = " + super.getName() + " stuId = " + stuId );
    }
    public void test(){
        System.out.println("yes");
    }
    public String toString(){
        return super.toString()
                + "[stuId=" + stuId + "]";
    }
}
