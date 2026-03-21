package filternum;

import java.util.Arrays;
import java.util.List;

public class filternum {
    public static void main(String[]args){
        List<Integer> nums=Arrays.asList(30,40,50,60,90,102,106);
        List<Integer> grade=nums.stream().filter(x->x>50).toList();
        System.out.println(grade);
        
        //forEach(System.out::println);
    }
}
