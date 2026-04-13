package strjava;

import java.util.ArrayList;
import java.util.Arrays;    
import java.util.List;

public class questr {
    public static void main(String[] args) {
    List<String> name =Arrays.asList("Java","Python","C");
    ArrayList<String> list=new ArrayList<String>();
    list.addAll(name);
    System.out.println(list);
    List<Character> grace=list.stream().map(x->x.charAt(0)).toList();
    System.out.println(grace);
}
