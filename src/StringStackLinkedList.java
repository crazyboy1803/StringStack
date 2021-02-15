import java.util.Scanner;
class Node
{
    String rollno;
    Node next;
}
public class StringStackLinkedList
{
    Node START;
    StringStackLinkedList()
    {
        START = null;
    }
    void addnode()
    {
        System.out.println("Enter Data");
        Scanner sc2 = new Scanner(System.in);
        String rn = sc2.nextLine();
        
        Node newnode = new Node();
        newnode.rollno = rn;
        newnode.next = null;
        
        if(START == null)
        {
            START = newnode;
        }
        else
        {
            Node current = START;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newnode;
        }
        System.out.println("Data Inserted.....");
    }
    void deletenode()
    {
        if(START == null)
        {
            System.out.println("List Empty");
        }
        else
        {
            System.out.println("Deleted : "+START.rollno);
            START = START.next;
        }
    }
    void deletenodelast()
    {
        if(START == null)
        {
            System.out.println("List Empty");
        }
        else
        {
            Node current = START;
            Node SecondLast = null;
            while(current.next != null)
            {
                SecondLast=current;
                current = current.next;
            }
            System.out.println("Deleted element : "+current.rollno);
            SecondLast.next = null;
        }
    }
    void traversenode()
    {
        if(START == null)
        {
            System.out.println("List Empty");
        }
        else
        {
            Node current;
            for(current = START;current != null ;current = current.next)
            {
                System.out.print(" " +current.rollno);
            }
        }
    }
    void searchnode()
    {
        if(START == null)
        {
            System.out.println("List Empty");
        }
        else
        {
            System.out.println("Enter searching element");
            Scanner sc3 = new Scanner(System.in);
            String sea = sc3.nextLine();
            
            Node current;
            int count=0;
            for(current=START;current != null ;current=current.next)
            {
                if(sea.equalsIgnoreCase(current.rollno))
                {
                    count++;
                    break;
                }
            }
            if(count>0)
            {
                System.out.println("Found");
            }
            else
            {
                System.out.println("Not Found");
            }
        }
    }
    public static void main(String arg[])
    {
        StringStackLinkedList obj = new StringStackLinkedList();
        while(true)
        {
            System.out.println("\npress 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for delete from last");
            System.out.println("press 4 for traverse");
            System.out.println("press 5 for search");
            System.out.println("press 6 for Exit");
            
            System.out.println("Enter ur choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            
            switch(ch)
            {
                case 1:
                    obj.addnode();
                    break;
                case 2:
                    obj.deletenode();
                    break;
                case 3:
                    obj.deletenodelast();
                    break;
                case 4:
                    obj.traversenode();
                    break;
                case 5:
                    obj.searchnode();
                    break;
                case 6:
                    System.exit(0);
                   break;
                default:
                    System.out.println("Wrong choice");
                    
            }
        }
    }
}