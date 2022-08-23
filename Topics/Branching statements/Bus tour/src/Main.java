import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busH = scanner.nextInt();
        int numB= scanner.nextInt();
        int bridge = 0;
        boolean stop = false;
        while (scanner.hasNextInt() && (!stop)) {
            bridge++;
            if (busH >= scanner.nextInt()){
                System.out.println("Will crash on bridge "+ bridge);
                stop= true;
            }
        }
        if (stop == false){
            System.out.println("Will not crash");
        }
    }
}