import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class FloatingList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Float> list=new ArrayList<>();
        Float sum=0.0f;
        int n=5;
        System.out.println("Enter the Floating point number in List");
        for (int i = 0; i <n; i++) {
            float d;
            d=sc.nextFloat();
            list.add(d);

        }
        ListIterator<Float>
                iterator = list.listIterator();
        while (iterator.hasNext())
        {
            sum+= iterator.next();
        }


        System.out.println("Sum of arraylist is : "+sum);
    }

}
