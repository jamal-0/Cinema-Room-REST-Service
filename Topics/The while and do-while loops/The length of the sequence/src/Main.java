import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        int i = 0;
        do {
            value = scanner.nextInt();
            i++;
        } while (value != 0);
        System.out.println((i-1));
    }
}