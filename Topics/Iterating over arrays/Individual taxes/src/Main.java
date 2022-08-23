import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double [] arrayIncome = new double[N];
        double [] arrayTaxPerc = new double[N];
        double [] arrayTax = new double[N];
        for (int i = 0; i < N; i++){
            arrayIncome[i] = scanner.nextDouble();
        }
//        System.out.println(Arrays.toString(arrayIncome));

        for (int k = 0; k<N ; k++){
            arrayTaxPerc[k] = scanner.nextDouble();
        }
//        System.out.println(Arrays.toString(arrayTaxPerc));

        double  largest = arrayTax[0], index = 0;
        for (int j = 0; j<N; j++) {
            arrayTax[j] = (arrayTaxPerc[j] * arrayIncome[j]) / 100;
            if (arrayTax[j] > largest) {
                largest = arrayTax[j];
                index = j;
            }
        }
        int indexF = (int) index;
//        System.out.println(Arrays.toString(arrayTax));
        System.out.println(indexF+1);
    }
}