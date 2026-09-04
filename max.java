import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 1 число: ");
        int a = scanner.nextInt();
        
        System.out.print("Введите 2 число: ");
        int b = scanner.nextInt();

        System.out.println("Введите 3 число: ");
        int c = scanner.nextInt();

        System.out.println("Введите 4 число: ");
        int d = scanner.nextInt();

        int max = (a > b) ? a : b;
        max = (max > c) ? max : c;
        max = (max > d) ? max : d;
        System.out.println(" maximum : " + max);
    }
}