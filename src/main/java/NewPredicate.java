import java.util.ArrayList;
import java.util.List;

public class NewPredicate {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        for (int i=0; i<1000; i++){
            array.add((int) (Math.random()*1000 + 100));
        }
        Predicate predicate = (i) -> i%7 == 0; // через лямбда-выражения переопределили test
        List<Integer> newArray = filter(array, predicate);
        for (int i : newArray){
            System.out.println(i);
        }
    }

    public static List<Integer> filter(List<Integer> list, Predicate predicate){
        List<Integer> result = new ArrayList<>();
        for (int i : list){
            if (predicate.test(i)){
                result.add(i);
            }
        }
        return result;
    }
}

@FunctionalInterface
interface Predicate{

    boolean test(int count);
}
