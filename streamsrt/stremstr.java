package streamsrt;

import java.util.List;
import java.util.Arrays;

public class stremstr {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(18,42,7,91,33,25,60);
        List<Integer> result=list.stream().sorted((a,b)->b-a).limit(3).toList();
        System.out.println(result);
    }
    
}
