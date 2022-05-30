import java.util.Scanner;

public class lab_3 {
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
                    System.out.println("Введіть розмір масиву:");
                    int size1 = scan.nextInt();
                    int[] arr = new int[size1];

                    System.out.println("Заповніть масив розмірністю - " + size1 );
                    for (int i = 0; i < size1; i++) {
                        arr[i] = scan.nextInt();
                    }
                    System.out.println("Готовий масив: ");
                    for (int i = 0; i < size1; i++) {
                        System.out.printf(" %d",  arr[i]);
                    }
                    System.out.println(" \n");

                    double max1, max2, max3;
                    max1 = 0;
                    for (int i = 0; i < size1; i++) {
                        if (max1 < arr[i])
                            max1 = arr[i];
                    }
                    max2 = 0;
                    for (int i = 0; i < size1; i++) {
                        if (max2 < arr[i] && arr[i] < max1){max2 = arr[i];}
                    }
                    max3 = 0;
                    for (int i = 0; i < size1; i++) {
                        if (max3 < arr[i] && arr[i] < max1 && arr[i] < max2){
                            max3 = arr[i];}
                    }

                    double sum1 = max1 + max2 + max3;
                    System.out.printf("Сума трьох максимальних елементів: %.2f\n", sum1);
                    break;
                case 2: {
                    System.out.println("Введіть розмір масиву:");
                    int size2 = scan.nextInt();
                    int[] Arr = new int[size2];
                    int key = 0;
                    do {
                        System.out.println("Введіть як заповнюємо масив:");
                        System.out.println("З клавіатури - 1");
                        System.out.println("Рандомно - 2");
                        key = scan.nextInt();

                        switch (key) {
                            case (1): {
                                System.out.println("Заповніть масив розмірністю - " + size2);
                                for (int i = 0; i < size2; i++) {
                                    Arr[i] = scan.nextInt();
                                }
                                System.out.println("Готовий масив: ");
                                for (int i = 0; i < size2; i++) {
                                    System.out.printf(" %d",  Arr[i]);
                                }
                                System.out.println(" \n");
                                break;
                            }
                            case 2:
                                for (int i = 0; i < size2; i++) {
                                    Arr[i] = (int) Math.round((Math.random() * 150) - 100);
                                    System.out.printf(" %d",  Arr[i]);
                                }
                                break;
                            case 0: {
                                break;
                            }
                            default: {
                                System.out.println("Некоректні данні!");
                                break;
                            }
                        }
                    } while (key == 0 ) ;

                    double sum = 0;
                    for (int i = 0; i < size2; i++) {
                        if(Arr[i] < 0){
                            sum = sum + Math.abs(Arr[i]);}
                    }
                    System.out.printf("\n");
                    System.out.printf("Сума мінусових елементів в  модулі: %.2f\n", sum);

                    int ind = 0;
                    int n = 0;
                    double sum2 = 0;
                    for (int i = size2 - 1; i < size2; i--) {
                        if(Arr[i] < 0){
                            ind = i;
                            break;             }}
                    for (int i = 0; i < size2; i++) {
                        if(i < ind){
                            sum2 = sum2 + Arr[i];
                        }}
                    System.out.printf("Сума елементів до останнього мінусового: %.2f\n", sum2);


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
