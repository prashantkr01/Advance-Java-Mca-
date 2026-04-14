package strmap;

import java.util.ArrayList;
import java.util.Arrays;    
import java.util.List;

public class strmap {
    public static void main(String[] args) {
    List<Integer> num =Arrays.asList(1,2,3,4,5);
    ArrayList<Integer> list=new ArrayList<Integer>();
    list.addAll(num);
    System.out.println(list);
    List<Integer> grace=list.stream().map(x->x*x).toList();
    System.out.println(grace);
    }
}
