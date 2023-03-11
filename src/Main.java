import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double [] numbers = {1.2, -3.2, 4.5, -6.8, 9.1, -4.1, 3.6, 5.8, 5.1, -6.3, 12.6, -34.3, 1.6, 20.5, -33.4 };
        double sum = 0.0;
        int call = 0;
        boolean proverka = false;
        for (double foreach : numbers ) {
            if (foreach < 0){
                proverka = true;

            } else if (foreach > 0 && proverka) {
                sum += foreach;
                call ++;
                System.out.println(foreach);
            }
        }
        System.out.println("Арифметическое число " + sum / call);


        int [] num = {-3,7,-4,8,2,1,6};
        boolean isSorted = false;
        int baf;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < num.length-1; i++) {
                if (num[i] > num[i + 1]){
                    isSorted = false;
                    baf = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = baf;

                }

            }
        }
        System.out.println(Arrays.toString(num));
    }
}
