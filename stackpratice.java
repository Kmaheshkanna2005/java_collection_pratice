
import java.util.Stack;

public class stackpratice {
    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<>();

        String[] arr = {"Hello","World","Java"};

        for(String i :arr)
        {
            stack.push(i);
        }

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
