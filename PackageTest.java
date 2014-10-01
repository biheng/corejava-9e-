import com.youkpter.www.*;
//the Employee class is defined in that package

import static java.lang.System.*;

/**
 * This program demonstrates the use of packages.
 * @author youkpter
 */
public class PackageTest
{
    public static void main(String[] args)
    {
        //because of the impor statement, we don't have to use
        //com.youpter.www.Employee here
        Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);

        harry.raiseSalary(5);

        //because of the static import statement, we don't have to use
        //System.out here
        out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
    }
}
