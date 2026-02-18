import java.util.*;
public class ArrListimplement {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); 
        list.add("Eat");
        list.add("Code");
        list.add("Sleep");
        list.add("ride");
        list.set(1,"deep work");

        if(list.contains("Sleep"))
        {
            System.out.println("True");
        }
        list.remove(0);
        list.remove("Sleep");
        System.out.println(list);
        for(String arr : list)
        {
            System.out.println(arr);
        }
    }
}
