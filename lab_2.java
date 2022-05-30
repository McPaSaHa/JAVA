

import java.util.Scanner;
import java.util.Arrays;

public class lab_2 {

    static void Task3() {
        float result = 0.0f;
        for(byte i = 2; i < 8; ++i) {
            float res = 1;
            for(byte j = 1; j < i; ++j) {
                res *= i / (float)j;
            }
            result += res;
        }
        System.out.printf("Результат обчислень: %.3f", result);
        System.out.printf("\n");
    }

    static void Task4() {
        float f = 0.0f;
        float x = 0.0f;
        float b = (float)Math.PI / 2;
        float dx = (float)Math.PI / 30;

        for (x = (float)(Math.PI / 2) * -1; x <= Math.PI / 2; x += Math.PI / 30) {
            f = (float)(Math.sin(x) / x);
            System.out.printf("x = %.3f", x );
            System.out.printf("     f(x) = %.3f", f);
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Виберіть завдання: ");
            System.out.println("Завдання - 1");
            System.out.println("Завдання - 2");
            System.out.println("Завдання - 3");
            System.out.println("Завдання - 4");
            System.out.println("Завершити програму - 0");

            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            switch (choice) {
                case (1):
                    try{
                        System.out.println("Завдання - 1");
                        System.out.println("Введіть x:");
                        double x = scan.nextDouble();
                        System.out.println("Введіть y:");
                        double y = scan.nextDouble();

                        double n = Math.pow(2.71, -x-2) + 1 / Math.pow(x, 2) + 4;
                        double a = (1+y) * ((x + y / Math.pow(x, 2) + 4) / n);

                        if (x==0 || y==0) {
                            throw new Exception("Некоректно введені данні!");
                        }  if(n < 0) {
                            throw new Exception("Знаменник <= 0!");
                        }  if(n > 0) {
                            System.out.printf("Результат: %.2f\n", a);
                        }
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                        break;

                        case 2:
                            double sum = 0;

                            /* for (int i = 20; i <= 30; i++) {
                                if (i % 2 != 0) {
                                    sum = sum + Math.pow(i, 2);
                                }
                            } */

                            /* int j = 20;
                            while(j <= 30) {
                                if (j % 2 != 0) {
                                    sum = sum + Math.pow(j, 2);
                                }
                                j++;
                            } */

                            int j = 20;
                            do {
                                if (j % 2 != 0) {
                                    sum = sum + Math.pow(j, 2);
                                }
                                j++;
                            }
                            while(j <= 30);

                            System.out.printf("Сума квадратів всіх непарних чисел у діапазоні [20;30]: %.2f\n", sum);

                            break;
                        case 3: {
                            try {

                                Task3();
                                break;
                            } catch (Exception ex) {
                                in.skip(".*");
                                System.out.println("Некоректно введені дані! Введіть ще раз.");
                                continue;
                            }
                        }
                        case 4:
                            System.out.println("Результат обчислення функції: ");
                            Task4();

                            break;
                        case 0: {
                            break;
                        }
                        default: {
                            System.out.println("Некоректні данні!");
                            break;
                        }
                    }
            }
            while (choice != 0) ;
        }
    }


