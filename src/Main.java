import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

        for (int i= 1; i < 11; i++) {
            System.out.println(i);
        }


        System.out.println();
        for (int i= 10; i > 0; i--) {
            System.out.println(i);
        }


        System.out.println();
        for (int i=0; i < 18; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }


        System.out.println();
        for (int i=10; i > -11; i--) {
            System.out.println(i);
        }


        System.out.println();
        for (int i=1904; i <= 2096; i++) {
            if (i%4 == 0) {
                System.out.println(i + " год является високосным");
            }
        }


        System.out.println();
        for (int i= 7; i <= 98; i+=7) {
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println();
        for (int i=1; i <= 512; i+=i) {
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println();
        int deposit = 29_000;
        double sum = 0;
        for (int month=1; month <= 12; month++ ) {
            sum += deposit;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", month, sum);
        }


        System.out.println();
        sum = 0;
        double percent = 1 / 100D;
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        for (int month=1; month <= 12; month++ ) {
            sum += sum * percent;
            sum += deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна рублей " + numberFormat.format(sum));
        }


        System.out.println();
        for (int j=2, i=1; i < 11; i++ ) {
            System.out.println(j + "*" + i + "=" + j*i);
        }

    }
}