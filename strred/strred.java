package strred;

import java.util.Arrays;
import java.util.List;

public class strred {
    public static void main(String[] args){
        // List<Integer> list=Arrays.asList(11,22,33,44,55,66,77,88);
        // int result=list.stream().reduce(0,(a,b)->b%2==0?a+b:a);
        // System.out.println(result);

        // List<Integer> list=Arrays.asList(18,42,7,91,33,25,60);
        // List<Integer> result=list.stream().sorted((a,b)->b-a).limit(3).toList();
        // System.out.println(result);

        // List<Integer> list=Arrays.asList(14,9,20,7,6,11,32,3);
        // List<Integer> result=list.stream().filter(x->x%2==0).sorted().toList();
        // System.out.println(result);

        // List<Integer> list=Arrays.asList(10,5,10,7,5,3,8,3);
        // List<Integer> result=list.stream().distinct().sorted().toList();
        // System.out.println(result);

        // List<Integer> list=Arrays.asList(55,12,88,34,99,21);
        // List<Integer> result=list.stream().sorted((a,b)->b-a).limit(2).sorted().limit(1).toList();
        // System.out.println(result);

        // List<String> list=Arrays.asList("Ravi","Ankit","Zoya","Meena","Kunal");
        // List<String> result=list.stream().sorted((a,b)->b.compareTo(a)).toList();
        // System.out.println(result);

        List<String> list=Arrays.asList("Ravi","Ankit","Zoya","Meena","Kunal");
        List<String> result=list.stream().sorted((a,b)->b.length()-a.length()).toList();
        System.out.println(result);
}      

}
