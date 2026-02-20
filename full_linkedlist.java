import java.util.*;

public class full_linkedlist {
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter the number choice = ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    { 
                        System.out.print("Number to insert = ");
                        int num = sc.nextInt();
                        list.add(num);
                        break;
                    }
                case 2:
                    {
                        System.out.print("Number to insert in front = ");
                        int num = sc.nextInt();
                        list.addFirst(num);
                        break;
                    }
                case 3:
                    {
                        System.out.print("Number to insert in middle = ");
                        int num = sc.nextInt();
                        System.out.print("index to insert in number = ");
                        int index = sc.nextInt();
                        if (index >= 0 && index <= list.size()) 
                        {
                        list.add(index, num);
                        System.out.println("Inserted successfully!");
                        } 
                        else {
                                System.out.println("Invalid Index! You can only choose between 0 and " + list.size());
                             }
                        break;
                    }
                case 4:
                    {
                        System.out.println("Element in the LinkedList:");
                        for(int element : list)
                        {
                            System.out.print(element+"->");
                        }
                        System.out.println("NULL");
                        break;
                    }
                case 5:
                    {
                        System.out.println("remove the element in the front:");
                        int remove = list.removeFirst();
                        if(remove>0)
                        {
                            System.out.println("the element removing is successfully");
                        }
                        else{
                            System.out.println("the element is not found");
                        }
                        break;
                    }
                    case 6:
                    {
                        System.out.println("remove the element in the last:");
                        int remove = list.removeLast();
                        if(remove>0)
                        {
                            System.out.println("the element removing is successfully");
                        }
                        else{
                            System.out.println("the element is not found");
                        }
                        break;
                    }
                    case 7:
                    {
                        System.out.print("remove the element in the middle = ");
                        int remove = sc.nextInt();
                        int value = list.remove(remove);
                        if(value>0)
                        {
                            System.out.println("the element removing is successfully");
                        }
                        else{
                            System.out.println("the element is not found");
                        }
                        break;
                    }
                    case 8:
                        {
                          System.out.print("set the element in index = ");
                          int remove = sc.nextInt();
                          System.out.print("Element to set = ");
                          int num = sc.nextInt();
                          list.set(remove, num);
                        if(remove>0)
                            {
                            System.out.println("the element set is successfully");
                            }
                        else{
                            System.out.println("the element is not found");
                            }
                            break;
                        }
                    case 9:
                        {
                            System.out.print("enter the element to search = ");
                            int search = sc.nextInt();

                            if(list.contains(search))
                            {
                                System.out.println("Element is exists in index = "+list.indexOf(search));
                            }
                            else{
                                System.out.println("Element is not exists");
                            }
                            break;
                        }
                case 0:
                    {
                        System.out.println("Bye");
                        return;
                    }
                default:
                    System.out.println("Enter the correct choice");
            }
        }
    }
}
