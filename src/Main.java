public class Main {
    public static void determinesTheYear(int year) {
        if (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }

    public static void determinesTheVersionOfTheApplication(int clientOS, int clientDiviceYear) {
        if (clientOS == 0 && clientDiviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDiviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDiviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDiviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int calculatesDelivery(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2025;
        determinesTheYear(year);
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDiviceYear = 2016;
        determinesTheVersionOfTheApplication(clientOS, clientDiviceYear);
        System.out.println("Задача 3");
        int deliveryDistance = 25;
        int deliveryDays = calculatesDelivery(deliveryDistance);
        if (deliveryDays == 0) {
            System.out.println("Доставки нет.");
        } else System.out.println("Потребуется дней: " + deliveryDays);
    }
}