package streamfil;
import java.util.Arrays;
import java.util.List;

public class streamfil {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(14,9,20,7,6,11,32,3);
        List<Integer> result=list.stream().filter(x->x%2==0).sorted().toList();
        System.out.println(result);
    }
}
