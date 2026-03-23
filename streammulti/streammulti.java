package streammulti;

import java.util.Arrays;
import java.util.List;

public class streammulti {
    public static void main(String[] args){
        List<Integer> list=Arrays.asList(10,14,16,17,19);
        List<Integer> abc=list.stream().filter(x->x%5==0).toList();
        System.out.println(abc);
    }
}
