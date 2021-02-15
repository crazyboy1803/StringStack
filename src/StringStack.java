import java.util.Scanner;
public class StringStack 
{
    String ar[];
    int top;
    StringStack()
    {
        ar=new String[5];
        top=-1;
    }
    void insert()
    {
         if(top==4)
        {
            System.out.println("Stack is full");
        }
        else
        {
            System.out.println("Enter data");
            Scanner sc2 = new Scanner(System.in);
            String data = sc2.nextLine();
            top = top +1 ;
            ar[top] = data;
            System.out.println("Data inserted....");
        }
    }
    void delete()
    {
        if(top == -1)
        {
            System.out.println("Stack is already empty");
        }
        else
        {
            System.out.println("Element deleted ="+ar[top]);
            top = top-1;
        }
    }
    void traverse()
    {
          if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            for(int i=top;i>=0;i--)
            {
                System.out.print(" "+ ar[i]);
            }
        }
    }
    void search()
    {
        if(top == -4)
        {
            System.out.println("List Empty");
        }
        else
        {
            System.out.println("Enter searching element");
            Scanner sc3 = new Scanner(System.in);
            String sea = sc3.nextLine();
            
            int count=0;
            for(int i=0;i<=top ;i++)
            {
                if(sea.equalsIgnoreCase(ar[i]))
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
    public static void main(String args[])
    {
        StringStack obj = new StringStack();
        while(true)
        {
            System.out.println("\npress 1 for insert");
            System.out.println("press 2 for delete");
            System.out.println("press 3 for traverse");
            System.out.println("press 4 for search");
            System.out.println("press 5 for exit\n");
            
            System.out.println("Enter ur choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    obj.insert();
                    break;
                case 2:
                    obj.delete();
                    break;
                case 3:
                    obj.traverse();
                    break;
                case 4:
                    obj.search();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
