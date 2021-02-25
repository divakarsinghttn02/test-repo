import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Charactercount {
    public static void Count_Char(String str){
        HashMap<Character,Integer> CharMap=new HashMap<>();
        char[] strArray=str.toCharArray();
        for(char c:strArray)
        {
            if (CharMap.containsKey(c))
            {
                CharMap.put(c,CharMap.get(c)+1);
            }
            else
            {
                CharMap.put(c,1);
            }
        }
        System.out.println("Character Count is as :");
        for(Map.Entry entry:CharMap.entrySet())
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        Count_Char(str);
    }
}
