import java.util.*;
public class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<String> st = new PriorityQueue<>(Collections.reverseOrder());

        String[] arr = {"Mahesh","kanna","ABx"};

        for(String i:arr)
        {
            st.add(i);
        }

        System.out.println(st);
    }
}
