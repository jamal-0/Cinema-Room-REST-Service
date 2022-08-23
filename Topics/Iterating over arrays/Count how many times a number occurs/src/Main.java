import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int [] array = new int[size];
        int count = 0;

        for (int i=0; i< size; i++){
            array[i]= scanner.nextInt();
        }

        int n = scanner.nextInt();

        for (int j = 0; j<size; j++){
            if (array[j] == n) {
                count ++;
            }
        }
        System.out.println(count);
    }

}