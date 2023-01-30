
public class Main {


    public static void main(String[] args) {

        yearLeap(2021);
        appLinks(2015, 5);
        int deliveryDays = getDeliveryDays(2);
        if (deliveryDays < 0) {
            System.out.println("Доставка не осуществляется");
        } else {
            System.out.println( "Потребуется дней: " + deliveryDays);
        }
    }



    public static void yearLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {

            System.out.println(year + "год является високосным");

        } else {
            System.out.println(year + "год не является високосным");
        }
    }

    public static void appLinks(int year, int os) {
        System.out.println("Установите " + appVariant(year) + " приложения для " + osString(os) + " по ссылке");

    }

    public static String osString(int os) {
        if (os == 0) {
            return "ios";
        } else {
            return "Android";
        }
    }


    public static String appVariant(int year) {
        if (year > 2021) {
            return "полную";
        } else {
            return "облегченную";
        }
    }


    public static int getDeliveryDays(int distance) {
        if (distance < 20) {
            return 1;
        } else if (distance < 60) {
            return 2;
        } else if (distance > 100) {
            return 3;
        }
        return -1;
    }
}