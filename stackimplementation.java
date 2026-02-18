
import java.util.*;

public class stackimplementation {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        String[] arr = {"mom","dad","uncle","aunty"};
        for(String i : arr)
        {
            st.push(i);
        }
        System.out.println(st);
        // int position = st.search("aunty");
        // System.out.println(st.peek());
        // String pop = st.pop();
        // System.out.println(st.pop());
        // System.out.println(position);
    }
}
