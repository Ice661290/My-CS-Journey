import java.util.*;    //import java.util.ArrayList;

public class W11_ass9 {
    
   public static void main(String[] args){
    ArrayList<String> name = new ArrayList<String>();

    System.out.println(name.size());

    name.add("Ant");
    name.add("Bird");
    name.add("Cat");
    name.add("Dog");
    name.add("Elephant");

    name.remove("Cat");

    System.out.println(name.size());

    for(String s: name)
       System.out.println(s);
  }
    
}


