import java.util.*;
public abstract class Person {
    private String name;
    public abstract void getDes();
    public String getName(){
        return name;
    }
    public Person(String name){
        this.name = name;
    }
    public String toString(){
        return getClass().getName()
                + "[name=" + name + "]";
    }
}

