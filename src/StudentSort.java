import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//Write a program to sort the Student objects based on Score ,
//        if the score are same then sort on First Name .
//        Class Student{ String Name; Double Score; Double Age
class Student
{
    String Name;
    Double Score;
    Double age;
    public Student(String Name,Double Score,double age)
    {
        this.Name=Name;
        this.Score=Score;
        this.age=age;
    }
    public static Comparator<Student> com1=new Comparator<Student>() {
        @Override
        public int compare(Student s1,Student s2) {
            if(s1.Score>s2.Score)
            {
            return 1;
            }
            else if(s1.Score<s2.Score)
            {
                return -1;
            }
            return s1.Name.compareTo(s2.Name);

        }
        };
}
public class StudentSort {
    public static void main(String[] args) {
        ArrayList<Student> li=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter for how many Students you want : ");
        int n=sc.nextInt();
        System.out.println("Enter the Data for Students : ");
        while(n>0)
        {
            System.out.println("Enter name");
            String n1=sc.next();
            System.out.println("Enter marks");
            Double n2= sc.nextDouble();
            System.out.println("Enter age");
            Double n3=sc.nextDouble();

            Student st=new Student(n1,n2,n3);
            li.add(st);
            n--;

        }
        for(Student st1:li)
        {
            System.out.println("Name : "+st1.Name+" Score is : "+st1.Score+" age is : "+st1.age);
        }
        Collections.sort(li,Student.com1);
        System.out.println("After Sorting");
        for(Student st1:li)
        {
            System.out.println("Name : "+st1.Name+" Score is : "+st1.Score+" age is : "+st1.age);
        }

    }
}
