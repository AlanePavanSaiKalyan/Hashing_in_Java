import java.util.Scanner;

public class CountOfNumberInArray {
    //Example for number hashing
    public static int max(int[] a){
        int max = a[0];
        for(int i =1;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The size Of the array:");
        int size = scanner.nextInt();
        int []a= new int[size];
        System.out.println("Enter the numbers in the array:");
        for(int i=0;i<size;i++){
            a[i] = scanner.nextInt();
        }
        int []hash = new int[max(a)+1];
        for(int i = 0;i<a.length;i++){
            hash[a[i]]++;
        }
        System.out.println("Enter the count of numbers u want to fetch");
        int count = scanner.nextInt();
        while(count--!=0){
            System.out.println("Number:");
            int n = scanner.nextInt();
            System.out.println(hash[n]);
        }

    }
}
