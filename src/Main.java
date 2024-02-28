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
        for (int i=1904; i < 2097; i++) {
            if (i%4 == 0) {
                System.out.println(i + " год является високосным");
            }
        }


        System.out.println();
        for (int i= 7; i < 105; i+=7) {
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println();
        for (int i=1; i < 1024; i+=i) {
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println();
        for (int i=29000, m=1; m < 13; i+=29000, m++ ) {
            System.out.println("Месяц " + m + ", сумма накоплений равна " + i + " рублей");
        }


        System.out.println();
        for (int i=29000, m=1; m < 13; i+=29000, m++ ) {
            i += (i/100);
            System.out.println("Месяц " + m + ", сумма накоплений равна " + i + " рублей");
        }


        System.out.println();
        for (int j=2, i=1; i < 11; i++ ) {
            System.out.println(j + "*" + i + "=" + j*i);
        }
    }
}