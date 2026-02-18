import java.util.*;
public class Linkedlistimplent {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new LinkedList<>();
        List<Integer> list1 = new LinkedList<>();

        list.add(90);
        list.add(85);
        list.add(70);

        list1.add(110);
        list1.add(120);
        list1.add(130);
        list1.add(140);

        result.add(list);
        result.add(list1);

        System.out.println(result);

        System.out.println("By loop");

        // for(int i=0;i<result.size();i++)
        // {
        //     for(int j=0;j<result.size();j++)
        //     {
        //         System.out.println(result.get(i).get(j));
        //     }
        // }
       for (int i = 0; i < result.size(); i++) {
    
        for (int j = 0; j < result.get(i).size(); j++) {
        System.out.println(result.get(i).get(j));
    }
}
    }
}
