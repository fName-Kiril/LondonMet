import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                int n = scanner.nextInt();

                int sum = 1;

        for (int i = 1; i <= n; i++) {
            sum *= i;
        }

        System.out.println(sum);
    }
}
