import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbrs = new ArrayList<>();
        Collections.addAll(numbrs, 1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Collections.sort(numbrs);
        numbrs.removeIf(i -> i <= 0);
        numbrs.removeIf(i -> i % 2 != 0);
        System.out.println(numbrs);
    }
}