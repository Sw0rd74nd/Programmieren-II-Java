import java.util.AbstractList;
import java.util.Arrays;

public class MeineArrayList<T> extends AbstractList<T> {

    private T[] test;

    public MeineArrayList(){

    }

    @Override
    public int size() {
        return test.length;
    }

    @Override
    public boolean add(T t) {
        T[] temp = (T[]) new Object[test.length + 1];
        System.arraycopy(test, 0, temp, 0, test.length);
        temp[test.length] = t;
        test = temp;
        return true;
    }

    public T get(int index){
        return test[index];
    }

    public void print(){
        Arrays.stream(test).forEach(System.out::println);
    }

}
