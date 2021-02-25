import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class UnicCharaters {
    public static void Count_unique_char(String str){
        String temp = "";

        for (int i = 0; i < str.length(); i++){
            char current = str.charAt(i);
            if (temp.indexOf(current) < 0){
                temp = temp + current;
            } else {
                temp = temp.replace(String.valueOf(current), "");
            }
        }

        System.out.println("Number of Unique Character in :"+str+" is : "+temp.length());

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        Count_unique_char(str);

    }

}

