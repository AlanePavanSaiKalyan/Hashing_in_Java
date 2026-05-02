import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UsingMap {
    //unlike array map only stores the elements that are in the given input..
    //this saves the memory
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int size  = scanner.nextInt();
        int []a = new int[size];
        System.out.println("Enter Entries: ");
        for(int i = 0;i<size;i++){
            a[i] = scanner.nextInt();
        }
        Map<Integer,Integer> hashes = new HashMap<>();//stores the elements in the sorted order
        for(int i = 0;i<size;i++){
            hashes.put(a[i],hashes.getOrDefault(a[i],0)+1); //only required emlements gets stored
        }

        System.out.println("How many elements count u want : ");
        int count = scanner.nextInt();
        while (count--!=0){
            System.out.println("Enter the number: ");
            int num = scanner.nextInt();
            System.out.println(hashes.get(num));
        }

    }
}
