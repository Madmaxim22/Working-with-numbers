import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamMain {

    public static void main(String[] args) {
        List<Integer> numbrs = new ArrayList<>();
        Collections.addAll(numbrs, 1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        numbrs.stream().filter(x -> x > 0 && x % 2 == 0).sorted().forEach(System.out::println);
    }
}
