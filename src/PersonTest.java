import java.util.*;
public class PersonTest {
    public static void main(String[] args){
        Student stu = new Student("tom");
        stu.getDes();
        Person p = stu;
        p.getDes();
        System.out.println("" + stu);
        System.out.println(stu.toString());
        System.out.println(p.toString());
        int[] a = new int[100];
        System.out.println(a.length); // output:100
        ArrayList<Person> people = new ArrayList<>(1);
        System.out.println(people.size());// output:0
        people.add(p);
        Person x = new Student("jack");
        people.add(x);
        System.out.println(people.size());
        Person w = new Student("marry");
        people.add(0,w);
        System.out.println(people.get(0));
        //ArrayList<int> m  = new ArrayList<>(); error
        ArrayList<Integer> m = new ArrayList<>();

     }
}
