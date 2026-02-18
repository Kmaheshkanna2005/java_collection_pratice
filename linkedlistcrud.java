import java.util.*;
public class linkedlistcrud {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Engine");
        list.add("Passenger_Car");
        list.add("Caboose");

        //System.out.print(list);
        list.add(2,"Dining_car");

        for(String arr : list)
        {
            System.out.println(arr+" ");
        }

        // System.out.println(" ");
        int index = list.indexOf("Passenger_Car");
        //System.out.println("Index = "+index);
        list.set(index,"Luxury_Coach");

        //System.out.println(" ");
        //System.out.println("front = "+list.getFirst());
        //System.out.println("Last = "+list.getLast());
        //list.remove("Caboose");
        // list.removeLast();
        // list.removeFirst();
       for (String car : list) {
            System.out.print("[" + car + "] -> ");
        }
        System.out.println("END");
    }
}
