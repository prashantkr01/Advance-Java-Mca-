package streamsort;
import java.util.Arrays;
import java.util.List;

public class stremsort {
    public static void main(String[] args){
    List<String> list=Arrays.asList("Ravi","Ankit","Zoya","Meena","Kunal");
        List<String> result=list.stream().sorted((a,b)->b.length()-a.length()).toList();
        System.out.println(result);
}
}
