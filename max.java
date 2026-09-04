import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 1 число: ");
        int a = scanner.nextInt();
        
        System.out.print("Введите 2 число: ");
        int b = scanner.nextInt();
        
        int max = (a > b) ? a : b;
        System.out.println(" maximum : " + max);
    }
}