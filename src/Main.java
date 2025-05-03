public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задача 2.");
        byte clientOS2 = 1;
        short clientDeviceYear = 2014;
        if (clientOS2 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println("Задача 3.");
        short year = 2025;
        if (year <= 1584) {
            System.out.println(year + " год: григорианский календарь ещё не введён.");
        } else if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        System.out.println("Задача 4.");
        byte deliveryDistance = 95;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        } else {
            byte deliveryDays = 1;
            if (deliveryDistance > 20) {
                deliveryDays++;
            }
            if (deliveryDistance > 60) {
                deliveryDays++;
            }
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        System.out.println("Задача 5.");
        byte monthNumber = 4;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Сейчас зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень.");
                break;
            default:
                System.out.println("Такого месяца нет.");
        }
    }
}