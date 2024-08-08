import java.util.Scanner;

public class ThalaForReason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int y = 2 * n;
        int sum = y + 14;
        int div = sum / 2;
        int ans = div - n;
        System.out.println("Your ans is:" + ans);
    }
    
}
