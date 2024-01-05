public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("task1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //task2
        System.out.println("task2");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //task3
        System.out.println("task3");

        for (int i = 0; i <= 17; i++) {
            if ((i % 2) == 0) {
                System.out.println(i);

            }
        }

        //task4
        System.out.println("task4");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //task5
        System.out.println("task5");

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i+" год является високосным.");
        }

        //task6
        System.out.println("task6");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i+" ");
        }

        //task7
        System.out.println("task7");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i+" ");
        }

        //task8
        System.out.println("task8");

        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц "+i+", сумма накоплений равна "+total+" рублей");
        }

        //task9
        System.out.println("task9");
        int salarySecond = 29000;
        int totalSecond = 0;
        for (int i = 1; i <= 12; i++) {
            totalSecond = totalSecond + totalSecond/100;
            totalSecond = totalSecond + salarySecond;
            System.out.println("Месяц "+i+", сумма накоплений равна "+totalSecond+" рублей");
        }

        //task10
        System.out.println("task10");

        for (int i = 1; i <= 10; i++) {
            System.out.println("2*"+i+"="+2*i);
        }
    }
}