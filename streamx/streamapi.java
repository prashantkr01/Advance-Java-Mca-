package streamx;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class streamapi {
    public static void main(String[] args){

     List <Integer> numbers = Arrays.asList(10,15,20,25,30,11,17,16);
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.addAll(numbers);
		System.out.println(list);
		list.stream().filter(x->x%2==0).forEach((x)->System.out.println(x));



    }
}
