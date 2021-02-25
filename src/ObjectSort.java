import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Employee
{
    String Name;
    int Salary;
    public Employee()
    {

    }
    public Employee(String Name,int Salary)
    {
        this.Name=Name;
        this.Salary=Salary;
    }
    public static Comparator<Employee> comp=new Comparator<Employee>() {
        @Override
        public int compare(Employee e1, Employee e2) {
            int s1= e1.Salary;
            int s2= e2.Salary;
            return s1-s2;
        }
    };

}
public class ObjectSort {
    public static void main(String[] args) {
        ArrayList<Employee> list=new ArrayList<>();
        list.add(new Employee("Amir",14000));
        list.add(new Employee("Ayush",8000));
        list.add(new Employee("Divakar",15000));
        list.add(new Employee("Khursheed",10000));

        for(Employee emp:list)
        {
            System.out.println("Name of Employee is : "+emp.Name+" and salary is :  "+emp.Salary);
        }
        Collections.sort(list,Employee.comp);
        System.out.println("Sorted list of Employee is");
        for(Employee emp:list)
        {
            System.out.println("Name of Employee is : "+emp.Name+" and salary is :  "+emp.Salary);
        }
    }
}
