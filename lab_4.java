import java.util.Scanner;

import Utils.MScanner;

public class lab_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Виберіть завдання: ");
            System.out.println("Завдання - 1");
            System.out.println("Завдання - 2");
            System.out.println("Завершити програму - 0");

            choice = scan.nextInt();
            switch (choice) {
                case (1):
                    System.out.println("Знаходження кількості входжень максимального та мінімального елементів;");

                    System.out.print("Задайте висоту матриці: ");
                    byte Height = MScanner.in.nextByte();
                    while (Height < 1) {
                        System.out.println("Введена висота матриці < 1, задайте інше значення;");
                        System.out.print("Задайте висоту матриці: ");
                        Height = MScanner.in.nextByte();
                    }

                    System.out.print("Задайте довжину матриці: ");
                    byte Length = MScanner.in.nextByte();
                    while (Length < 1) {
                        System.out.println("Введена довжина матриці < 1, задайте інше значення;");
                        System.out.print("Задайте довжину матриці: ");
                        Length = MScanner.in.nextByte();
                    }

                    int Array[][] = new int[Height][Length];
                    for (byte i = 0; i < Height; ++i) {
                        for (byte j = 0; j < Length; ++j) {
                            System.out.print("Задайте [" + i + "," + j + "] елемент матриці: ");
                            Array[i][j] = MScanner.in.nextInt();
                        }
                    }


                    int Max, Min;
                    Max = Min = Array[0][0];
                    byte MaxCount = 0;
                    byte MinCount = 0;

                    for (byte i = 0; i < Height; ++i) {
                        for (byte j = 0; j < Length; ++j) {
                            if (Array[i][j] > Max) {
                                Max = Array[i][j];
                                MaxCount = 1;
                            } else if (Array[i][j] < Min) {
                                Min = Array[i][j];
                                MinCount = 1;
                            } else {
                                if (Array[i][j] == Max) {
                                    ++MaxCount;
                                }
                                if (Array[i][j] == Min) {
                                    ++MinCount;
                                }
                            }

                            System.out.printf("%5d", Array[i][j]);
                        }
                        System.out.println();
                    }

                    System.out.println("Максимальний елемент матриці: " + Max);
                    System.out.println("Кількість входжень максимального елемента: " + MaxCount);
                    System.out.println("Мінімальний елемент матриці: " + Min);
                    System.out.println("Кількість входжень мінімального елемента: " + MinCount);

                case 2: {

                    System.out.println("Перевірка симетричності матриці відносно головної діагоналі;");

                    System.out.print("Задайте розмір квадратної матриці: ");
                    byte Size = MScanner.in.nextByte();
                    while (Size < 2) {
                        System.out.println("Введений розмір матриці < 2, задайте інше значення;");
                        System.out.print("Задайте розмір квадратної матриці: ");
                        Size = MScanner.in.nextByte();
                    }

                    //int Array1[][] = {{1, 5, 7, 8}, {2, 6, 4, 3}, {3, 4, 7, 2}, {8, 7, 5, 9}}; //	Size = 4;
                    int Array1[][] = new int[Size][Size];
                    for(byte i = 0; i < Size; ++i) {
                        for(byte j = 0; j < Size; ++j) {
                            Array1[i][j] = (int) (Math.random() * 200 - 100);
                            System.out.printf("%5d", Array1[i][j]);
                        }
                        System.out.println();
                    }



                    for(byte i = 0; i < Size >> 1; ++i) {
                        for(byte j = (byte)(Size - 1); j > i; --j) {
                            if (Array1[i][j] != Array1[Size - i - 1][Size - 1 - j]) {
                                System.out.println("Задана матриця НЕ є симетричною відносно головної діагоналі;");
                                return;
                            }
                        }
                    }
                    System.out.println("Задана матриця є симетричною відносно головної діагоналі;");
                    break;
                }
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

