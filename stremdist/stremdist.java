package stremdist;
import java.util.Arrays;
import java.util.List;

public class stremdist {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(10,5,10,7,5,3,8,3);
        List<Integer> result=list.stream().distinct().sorted().toList();
        System.out.println(result);
    }
}
