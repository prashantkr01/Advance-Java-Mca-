package streamclass;
import java.util.*;

// class Student{
//         private int sid;
//         String name;
//         int marks;
//         Student(int sid , String name, int marks){
//             super();
//             this.sid=sid;
//             this.name=name;
//             this.marks=marks;
//         }
//     }

public class streamcls {
  public static void main(String[] args){
//     ArrayList<Student> list=new ArrayList<Student>();
//     list.add(new Student(1,"Arun",60));
//     list.add(new Student(2,"Ram",45));
//     list.add(new Student(3,"Shyam",75));
//     list.add(new Student(4,"Mohan",90));
//     list.stream().filter(student-> student.getMarks()>60);
//     System.out.println(list);



    // List<Integer> marks =Arrays.asList(10,45,35,75,80,91,67,76);
    // ArrayList<Integer> list=new ArrayList<Integer>();
    // list.addAll(marks);
    // System.out.println(list);
    // List<Integer> grace=list.stream().filter(x->x<40).map(mark->mark+5).toList();
    // System.out.println(grace);

    // List<String> name =Arrays.asList("sachin","amit","rahul");
    // ArrayList<String> list=new ArrayList<String>();
    // list.addAll(name);
    // System.out.println(list);
    // List<String> grace=list.stream().map(x->x.toUpperCase()).toList();
    // System.out.println(grace);

    // List<Integer> num =Arrays.asList(1,2,3,4,5);
    // ArrayList<Integer> list=new ArrayList<Integer>();
    // list.addAll(num);
    // System.out.println(list);
    // List<Integer> grace=list.stream().map(x->x*x).toList();
    // System.out.println(grace);

    // List<String> name =Arrays.asList("Java","Python","C");
    // ArrayList<String> list=new ArrayList<String>();
    // list.addAll(name);
    // System.out.println(list);
    // List<Character> grace=list.stream().map(x->x.charAt(0)).toList();
    // System.out.println(grace);

    // List<Integer> num =Arrays.asList(10,20,30,40,50);
    // ArrayList<Integer> list=new ArrayList<Integer>();
    // list.addAll(num);
    // System.out.println(list);
    // List<String> grace=list.stream().map(x->x.toString()).toList();
    // System.out.println("Convert in String-"+ grace);

    // List<String> name =Arrays.asList("A","B","C");
    // ArrayList<String> list=new ArrayList<String>();
    // list.addAll(name);
    // System.out.println(list);
    // List<String> grace=list.stream().map(x->"Item"+x).toList();
    // System.out.println(grace);

    // List<String> name =Arrays.asList("Java","Stream","Api");
    // ArrayList<String> list=new ArrayList<String>();
    // list.addAll(name);
    // System.out.println(list);
    // List<Integer> grace=list.stream().map(x->x.length()).toList();
    // System.out.println(grace);


    // List<Integer> name =Arrays.asList(5,10,15);
    // ArrayList<Integer> list=new ArrayList<Integer>();
    // list.addAll(name);
    // System.out.println(list);
    // List<Integer> grace=list.stream().map(x->x*2).toList();
    // System.out.println(grace);


    
    //Q no -9
    // List<String> name =Arrays.asList("1","2","3","4");
    // ArrayList<String> list=new ArrayList<String>();
    // list.addAll(name);
    // System.out.println(list);
    // List<Integer> grace=list.stream().map(Integer::valueOf).toList();
    // System.out.println(grace);

    
    //Q no=10
    // List<String> name =Arrays.asList(" Java ","  Python ","  C++ ");
    // ArrayList<String> list=new ArrayList<String>();
    // list.addAll(name);
    // System.out.println(list);
    // List<String> grace=list.stream().map(x->x.trim()).toList();
    // System.out.println(grace);
    //.replaceAll("[^A-Z,a-z,0-9]","")

  //  //Q no -11
  //   List<Double> name =Arrays.asList(0.0,20.0,30.0);
  //   ArrayList<Double> list=new ArrayList<Double>();
  //   list.addAll(name);
  //   System.out.println(list);
  //   List<Double> grace=list.stream().map(x->x*1.8+32).toList();
  //   System.out.println(grace);

  //Q no -12
  // List<String> name =Arrays.asList("Java","Code");
  // ArrayList<String> list=new ArrayList<String>();
  // list.addAll(name);
  // System.out.println(list);
  // List<Character> grace=list.stream().map(x->x.charAt(x.length()-1)).toList();
  // System.out.println(grace);

  // //Q no -13
  //   List<String> name =Arrays.asList("Java","Python");
  //   ArrayList<String> list=new ArrayList<String>();
  //   list.addAll(name);
  //   System.out.println(list);
  //   List<Integer> grace=list.stream().map(x->x.hashCode()).toList();
  //   System.out.println(grace);

  // //Q no -14
  //   List<String> name =Arrays.asList("Java","API");
  //   ArrayList<String> list=new ArrayList<String>();
  //   list.addAll(name);
  //   System.out.println(list);
  //   List<Integer> grace=list.stream().map(x->x.length()).toList();
  //   System.out.println(grace);

  // Q no -15
    List<Integer> name =Arrays.asList(1,2,3,4);
    ArrayList<Integer> list=new ArrayList<Integer>();
    list.addAll(name);
    System.out.println(list);
    List<Integer> grace=list.stream().map(x->x%2==0?1:0).toList();
    System.out.println(grace);



}
}
