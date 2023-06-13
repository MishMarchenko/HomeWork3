import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Dmitry!");
        System.out.println("What homework item do you want to check?");
        System.out.println("Choose 1,2,3,4");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i){
            case 1:
                System.out.println(unicode());
                break;
            case 2:
                System.out.println("tbd2");
                break;
            case 3:
                System.out.println(cubNumber());
                break;
            case 4:
                System.out.println("tbd4");
                break;
            default:
                System.out.println("There was no such task)))");

        }

           }
           public static String unicode(){
        char q = '\u2230';
        char w = '\u2222';
        char e = '\u2205';
        String str = q + " " + w + " " + e;
        return str;
    }
    public static int cubNumber(){
        System.out.println("Enter the number you want to cube");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        return (int) Math.pow(a, 3);
// 2й способ: return a * a * a;
    }
}