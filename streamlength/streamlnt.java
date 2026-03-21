package streamlength;

import java.util.Arrays;
import java.util.List;

public class streamlnt {
    public static void main(String[] args) {
        List<String> val=Arrays.asList("Prashant","Sachin","Ravi","Vaibhaw","Raju","Rohan","Java");
        List<String> grade=val.stream().filter(x->x.length()>5).toList();
        System.out.println(grade);
    }
}
