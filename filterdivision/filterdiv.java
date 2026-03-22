package filterdivision;

import java.util.Arrays;
import java.util.List;

public class filterdiv {
    public static void main(String[] args) {
        List<Integer> num=Arrays.asList(10,11,12,13,14,15,16,17);
        List<Integer> abc=num.stream().filter(x->x%3==0).toList();
        System.out.println(abc);

    }
}
