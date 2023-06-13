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
                calculator();
                break;
            default:
                System.out.println("There was no such task)))");
        }
    }
    public static String unicode(){
        System.out.println("Let me show you some symbols");
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
    public static void calculator(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Calculator!");
        System.out.println("I'm simple, so I can only do simple operations!");
        System.out.println("So let start!");
        System.out.println();
        System.out.println("Add first number");
        int a = scanner.nextInt();
        System.out.println("Add second number");
        int b = scanner.nextInt();
        System.out.println("Add calculation operator(+,-,*,/)");
        char op = scanner.next().charAt(0);

        if (op == '+'){
            System.out.println(sum(a, b));
        } else if (op == '-') {
            System.out.println(minus(a, b));
        } else if (op == '*') {
            System.out.println(mult(a, b));
        } else if (op == '/') {
            System.out.println(divide(a, b));
        }else {
            System.out.println("Sorry! I don't know this operator");
        }
    }
    public static int sum(int a, int b){
        return a + b;
    }
    public static int minus(int a, int b){
        return a - b;
    }
    public static int mult(int a, int b){
        return a * b;
    }
    public static double divide(double a, double b){
        return a / b;
    }
}