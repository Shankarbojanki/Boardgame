import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern");
        int rows= scanner.nextInt();
        for (int i =1;i<=rows;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

        }
    }
}
