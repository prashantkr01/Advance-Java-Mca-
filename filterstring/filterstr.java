package filterstring;

import java.util.Arrays;
import java.util.List;

public class filterstr {
    public static void main(String[] args){
        List<String> val=Arrays.asList("Java","Anup","C++","Apolo","Apple","Banana");
        List<String> grd=val.stream().filter(x->x.charAt(0)=='A').toList();
        System.out.println(grd);

    }
}
