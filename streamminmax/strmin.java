package streamminmax;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class strmin {
    public static void main(String[] args) {
        // List<Integer> list=Arrays.asList(25,12,6,67,89,43);
        // Optional<Integer> result=list.stream().min((a,b)->a-b);
        // result.ifPresent(System.out::println);

        List<Integer> list=Arrays.asList(10,20,5,40,15);
        Optional<Integer> result=list.stream().max((a,b)->a-b);
        result.ifPresent(System.out::println);

        
    }
}
