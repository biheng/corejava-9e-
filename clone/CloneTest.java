package clone;

/**
 * This program demonstrates cloning.
 * @author youkpter
 * 2014年 09月 24日 星期三 23:37:28 CST
 */
public class CloneTest
{
    public static void main(String[] args)
    {
        try
        {
            Employee original = new Employee("John Q. Public", 50000);
            original.setHireDay(2000, 1, 1);
            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2002, 12, 31);
            System.out.println("original=" + original);
            System.out.println("copy=" + copy);
        }
        catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}
