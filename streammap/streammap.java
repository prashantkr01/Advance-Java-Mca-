package streammap;

import java.util.Arrays;
import java.util.List;

public class streammap {
    public static void main(String[] args){
        List<Integer> marks=Arrays.asList(23,40,45,78,29,33,59,75,99);
        List<Integer> result=marks.stream().filter(x->x<40).map(x->x+5).toList();
        System.out.println(result);
    }
}
