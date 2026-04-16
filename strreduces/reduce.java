package strreduces;

import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class reduce {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6);
        int result=list.stream().reduce(0,(a,b)->a+b);
        int avg=result/list.size();
        System.out.println(avg);
    }
}
