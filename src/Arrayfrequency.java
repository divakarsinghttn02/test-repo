
import java.util.*;
import java.util.stream.Collectors;
class Data implements Comparable<Data>
{
    int value, count, index;

    public Data(int value, int count, int index) {
        this.value = value;
        this.count = count;
        this.index = index;
    }

    public int compareTo(Data obj)
    {

        if (this.count != obj.count) {
            return obj.count - this.count;
        }


        return this.index - obj.index;
    }
}
public class Arrayfrequency {
    // Custom sort by element's frequency and index
    public static void customSort(int[] arr)
    {
        if (arr == null || arr.length < 2) {
            return;
        }


        Map<Integer, Data> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.putIfAbsent(arr[i], new Data(arr[i], 0, i));
            hm.get(arr[i]).count++;
        }


        List<Data> values = hm.values().stream()
                .sorted()
                .collect(Collectors.toList());

        int k = 0;
        for (Data data: values) {
            for (int j = 0; j < data.count; j++) {
                arr[k++] = data.value;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of element :");
        int n= sc.nextInt();
        System.out.println("Enter the elements in array: ");
        arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();

        }
        System.out.println("Array Before sort");
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();

        customSort(arr);
        System.out.println("Array after sort");
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
