import java.util.Scanner;

public class CountCharactersInaString {
    //Character Hashing example
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The String:");
        String str = scanner.nextLine();
        int[] a  = new int[256]; //26 if only capital or small letters are there in the given string
        for(int i=0;i<str.length();i++){
            a[str.charAt(i)]++; //str.charAt(i)-'a' or str.charAt(i)-'A'
        }
        System.out.println("How many characters u want to fetch");
        int count = scanner.nextInt();
        while (count--!=0){
            System.out.println("Enter Character:");
            char ch = scanner.next().charAt(0);
            System.out.println(ch+": "+a[ch]); // a[ch-'a'] or a[ch-'A']
        }
    }
}
