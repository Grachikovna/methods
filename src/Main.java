import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //task 1
        int year = 2024;
        if (checkLeapYear(year)) {
            System.out.println("Год высокосный");
        } else {
            System.out.println("Год невысокосный");

        }
        //task 2
        phoneVersion(0, 2024);
        phoneVersion(1, 2015);

        //task 3
        int distanceDelivery = 45;
        int deliveryDays = calculateDeliveryDays(distanceDelivery);
        if (deliveryDays >= 0) {
            System.out.println("Доставка займет " + deliveryDays + " дня ");
        } else {
            System.out.println("Доставки нет ");
        }
    }


    static boolean checkLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

    }
    //task 2

    static void phoneVersion(int ios, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (ios == 0) {
            if (deviceYear < currentYear) {
                System.out.println("Устоновите облегченную версию приложения для ios ");
            } else {
                System.out.println("Скачайте версию для ios");
            }
        } else if (ios == 1) {
            if (deviceYear < currentYear) {
                System.out.println("Скачайте облегченную версию android ");
            } else {
                System.out.println("Скачайте версию для android");

            }
        } else {
            System.out.println("Устройство не поддерживается");
        }
    }

    static int calculateDeliveryDays(int distanceDelivery) {
        if (distanceDelivery <= 20) {
            return 1;
        } else if (distanceDelivery <= 60) {
            return 2;
        } else if (distanceDelivery <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}



