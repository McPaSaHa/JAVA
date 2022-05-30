import java.util.Scanner;

public class lab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("Виберіть завдання: ");
            System.out.println("Завдання - 1");
            System.out.println("Завдання - 2");
            System.out.println("Завдання - 3");
            System.out.println("Завдання - 4");
            System.out.println("Завершити програму - 0");
            choice = scan.nextInt();
            switch (choice) {
                case (1):
                    System.out.println("Завдання - 1");
                    System.out.println("Введіть f:");
                    double f = scan.nextDouble();
                    System.out.println("Введіть r:");
                    double r = scan.nextDouble();

                    if(f != -5 && f != 0 && f != 5 ){ System.out.printf("Введені некоректні дані!\n");}
                    if(r == 0 || f == 0) { System.out.printf("Введено нулі!\n");}
                    if (f == 5) {
                            double y2 = (3 * f) + (2 * r);
                            System.out.printf("Результат: %.2f\n", y2);
                            }
                    if(f == 0 && r != 0) {

                                double y2 = Math.sqrt(3 * f) + (2 * r);
                                System.out.printf("Результат: %.2f\n", y2);
                    }
                    if (f == -5){
                        double y3 = (f * r) - 9;
                        System.out.printf("Результат: %.2f\n", y3);
                    }


                    /*

                    if (f == 5) {
                            double y2 = (3 * f) + (2 * r);
                            System.out.printf("Результат: %.2f\n", y2);
                            }
                         else {
                            System.out.println("Введені некоректні дані!");
                        }


                    else if(f == 0) {
                        if (2 * f - 4 != 0) {
                            double y2 = Math.sqrt(8 * r) / (2 * f) - 4;
                            System.out.printf("Результат: %.2f\n", y2);
                        } else {
                            System.out.println("Введені некоректні дані!");
                        }
                    }
                    else if (f == -5){
                        double y3 = (f * r) - 9;
                        System.out.printf("Результат: %.2f\n", y3);
                    }*/

                    break;
                case (2):
                    try{
                    System.out.println("Завдання - 2");
                    System.out.println("Введіть три точки:");
                    System.out.println("Введіть x1:");
                    double x1 = scan.nextDouble();
                    System.out.println("Введіть y1:");
                    double y1 = scan.nextDouble();
                    System.out.println("Введіть x2:");
                    double x2 = scan.nextDouble();
                    System.out.println("Введіть y2:");
                    double y2 = scan.nextDouble();
                    System.out.println("Введіть x3:");
                    double x3 = scan.nextDouble();
                    System.out.println("Введіть y3:");
                    double y3 = scan.nextDouble();

                        if(x1==0 && x2==0 && x3==0 && y1==0 && y2==0 && y3==0){throw new Exception("Точки дорівнюють нулю!");}
                     else if((x2-x1)/x3-x1 == (y2-y1)/(y3-y1)){
                        throw new Exception("Точки лежать на одній прямій");
                    }else if(x1 == x2 || x2 == x3 && y1 == y2 || y2 == y3){throw new Exception("Точки лежать на одній прямій");}
                    else { throw new Exception("Точки не лежать на одній прямій");}
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

                    break;
                case (3):
                    System.out.println("Завдання - 3");
                    int hour;
                    System.out.println("Введіть порядковий номер гонини в добі:");
                    hour = scan.nextInt();
                    switch (hour) {
                        case (1): {
                            System.out.println("Перша година");
                            break;
                        }
                        case (2): {
                            System.out.println("Друга година");
                            break;
                        }
                        case (3): {
                            System.out.println("Третя година");
                            break;
                        }
                        case (4): {
                            System.out.println("Четверта година");
                            break;
                        }
                        case (5): {
                            System.out.println("П'ята година");
                            break;
                        }
                        case (6): {
                            System.out.println("Шоста година");
                            break;
                        }
                        case (7): {
                            System.out.println("Сьома година");
                            break;
                        }
                        case (8): {
                            System.out.println("Восьма година");
                            break;
                        }
                        case (9): {
                            System.out.println("Девята година");
                            break;
                        }
                        case (10): {
                            System.out.println("Десята година");
                            break;
                        }
                        case (11): {
                            System.out.println("Одинадцята година");
                            break;
                        }
                        case (12): {
                            System.out.println("Дванадцята година");
                            break;
                        }
                        case (13): {
                            System.out.println("Тринадцята година");
                            break;
                        }
                        case (14): {
                            System.out.println("Чотирнадцята година");
                            break;
                        }
                        case (15): {
                            System.out.println("П'ятнадцята година");
                            break;
                        }
                        case (16): {
                            System.out.println("Шістнадцята година");
                            break;
                        }
                        case (17): {
                            System.out.println("Сіммнадцята година");
                            break;
                        }
                        case (18): {
                            System.out.println("Вісімнадцята година");
                            break;
                        }
                        case (19): {
                            System.out.println("Девятнадцята година");
                            break;
                        }
                        case (20): {
                            System.out.println("Двадцята година");
                            break;
                        }
                        case (21): {
                            System.out.println("Двадцять перша година");
                            break;
                        }
                        case (22): {
                            System.out.println("Двадцять друга година");
                            break;
                        }
                        case (23): {
                            System.out.println("Двадцять третя година");
                            break;
                        }
                        case (24): {
                            System.out.println("Двадцять четверта година");
                            break;
                        }
                        default:{
                            System.out.println("Порядковий номер гонини в добі не співпадає!");
                            break;
                        }
                    }
                    break;

                case (4): {
                    System.out.println("Завдання - 4");
                    try
                    {
                    System.out.println("Введіть x:");
                    double x = scan.nextDouble();
                    System.out.println("Введіть y:");
                    double y = scan.nextDouble();
                    System.out.println("Введіть z:");
                    double z = scan.nextDouble();
                        double n = Math.sqrt(3 * x / (z - 2 * y));
                            double t = n - (y * z) + Math.sin(Math.pow(x, 2));
                        if (n > 0) {
                            System.out.printf("Результат: %.2f\n", t);
                        } else if(x == 0 && y == 0 && z == 0){
                            throw new Exception("Значення дорівнює нулю!");
                        }
                        else {
                            throw new Exception("З заданих значень корень не добувається!");
                        }
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    System.out.println("Завдання завершено!");


                    break;
                }
                case 0:{
                    break;
                }
                default:{
                    System.out.println("Некоректні данні!");
                    break;
                }
            }
        } while(choice != 0);
    }
}
