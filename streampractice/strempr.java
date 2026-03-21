package streampractice;

import java.util.Arrays;
import java.util.List;

public class strempr {
    public static void main(String[] args){
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> name= list.stream().filter(x->x%2==0).toList();
        System.out.println(name);
        
        //.forEach(System.out::println);
    }
    
}
