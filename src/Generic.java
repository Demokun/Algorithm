import java.util.*;
public class Generic<T> {
    private T key;
    public Generic(T key){
        this.key = key;
    }
    public T getKey(){
        return key;
    }
    public T setKey(T newKey){
        this.key = newKey;
        return newKey;
    }
}
