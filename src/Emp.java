import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Emp {
    double age;
    double salary;
    private String Name;

    public Emp(double age, double salary, String Name){
        this.age = age;
        this.salary = salary;
        this.Name = Name;
    }
    public String toString()
    {
        return this.age + " " + this.salary + " " + this.Name;
    }

    static class SalaryComparator implements Comparator<Emp>
    {
        // Used for sorting in ascending order of
        // name
        public int compare(Emp a, Emp b)
        {
            return Double.compare(a.salary, b.salary);
        }
    }
    public static void main(String[] args) {
        ArrayList<Emp> ar = new ArrayList<>();
        ar.add(new Emp(21, 10000, "manvir"));
        ar.add(new Emp(31, 50000, "pavleen"));
        ar.add(new Emp(25, 25000, "prateek"));
        ar.add(new Emp(28, 17000, "riya"));
        System.out.println("Unsorted");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));


        Collections.sort(ar, new SalaryComparator());

        System.out.println("\nSorted by salary");
        for (int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));


    }
}


