package Streamsorting;

import java.util.List;
import java.util.Arrays;
public class strsort {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(55,12,88,34,99,21);
        List<Integer> result=list.stream().sorted((a,b)->b-a).limit(2).sorted().limit(1).toList();
        System.out.println(result);
    }
}
