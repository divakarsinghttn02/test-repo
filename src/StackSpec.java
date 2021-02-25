import java.util.Scanner;
import java.util.Stack;

public class StackSpec extends Stack<Integer> {
    Stack<Integer> min = new Stack<>();


    void push(int x)
    {
        if (isEmpty() == true) {
            super.push(x);
            min.push(x);
        }
        else {
            super.push(x);
            int y = min.pop();
            min.push(y);
            if (x < y)
                min.push(x);
            else
                min.push(y);
        }
    }


    public Integer pop()
    {
        int x = super.pop();
        min.pop();
        return x;
    }


    int getMin()
    {
        int x = min.pop();
        min.push(x);
        return x;
    }


    public static void main(String[] args)
    {
        StackSpec s = new StackSpec();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element you want to enter :");
        int n=sc.nextInt();
        System.out.println("Enter the values :");
        while(n>0)
        {
            int a=sc.nextInt();
            s.push(a);
            n--;
        }
        System.out.println("The minimum value is : "+s.getMin());
    }

}
