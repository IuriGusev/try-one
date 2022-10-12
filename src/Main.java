public class Main {
    public static void IsLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    private static void PrintClientMessage(int i1, int i) {
        if (i1 == 0 && i < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        if (i1 == 1 && i < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void printCalculateDeliveryDays(int deliveryDistance) {
        int intervalDistance = 40;
        int startDistance = 20;
        int deliveryDays = 1;
        if (deliveryDistance <= startDistance) {
            deliveryDays = 1;
        } else {
            deliveryDays = deliveryDays + ((deliveryDistance - startDistance) / intervalDistance) + 1;
        }
        System.out.println("Потребуется дней " + deliveryDays);
    }


    public static void main(String[] args) {

        //Task 1

        IsLeap(2020);

        //Task 2
        PrintClientMessage(1, 2014);

        //Task 3
        printCalculateDeliveryDays(155);
    }
}


