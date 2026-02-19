
import java.util.*;

public class queuepratice {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        String[] arr = {"Hello","World","Java"};

        for(String i : arr)
        {
            q.add(i);
        }

        System.out.println(q);

        System.out.println(q.peek());

        System.out.println(q.poll());

        //System.out.println(q);

        for(String i :q)
        {
            System.out.print(i+" ");
        }
    }
}
