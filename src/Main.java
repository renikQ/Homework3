public class Main {
    public static void main(String[] args) {

        // задача № 1
        int clientOS = 0;
        if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");

        }  else if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        // задача №2
        int clientDeviceYear = 2014;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        // задача №3
        int year = 2021;
        boolean leapYear = year % 4 == 0;
        boolean leapYear1 = year % 400 == 0;
        if (year == 100 || year == 200 || year == 300) {
            System.out.println(year + " год не является високосным");
        } else if (year < 400 && leapYear){
            System.out.println(year + " год является високосным");
        } else if (year >= 400 && leapYear && leapYear1) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // задача №4
        int deliveryDistance = 95;
        int days1 = 1;
        int days2 = 2;
        int days3 = 3;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + days1);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + days2);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + days3);
        }

        // задача №5
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Принадлежит к сезону зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Принадлежит к сезону весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Принадлежит к сезону лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Принадлежит к сезону осень.");
                break;
            default:
        }

        // задача №6
        int age = 19;
        double salary = 58_000;
        double age23plus = salary * 3;
        double age23minus = salary * 2;
        double salary50plus = salary * 1.2;
        double salary80plus = salary * 1.5;
        if (age >= 23) {
            if (salary >= 80000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (age23plus + salary80plus)  + " рублей");
            }else if (salary >= 50000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (age23plus + salary50plus) + " рублей");
            } else System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + age23plus + " рублей");
        }else if (age < 23) {
            if (salary >= 80000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (age23minus + salary80plus)  + " рублей");
            }else if (salary >= 50000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (age23minus + salary50plus) + " рублей");
            } else System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + age23minus + " рублей");
        }

        // задача №7
        int age7 = 25;
        int salary7 = 60_000;
        int wantedSum = 330_000;
        double baseRate = wantedSum * 0.10;
        double maxMonthPayment = salary7 * 0.50;
        double monthPayment = (baseRate / 12) + (wantedSum / 12);
        double baseRate23 = wantedSum * 0.11;
        double monthPayment23 = (baseRate23 / 12) + (wantedSum / 12);
        double baseRate30 = wantedSum * 0.105;
        double monthPayment30 = (baseRate30 / 12) + (wantedSum / 12);
        if (maxMonthPayment >= monthPayment23 && age7 <= 23) {
            System.out.println("Максимальный платеж при ЗП " + salary7 + " равен " + maxMonthPayment + " рублей. Платеж по кредиту " + monthPayment23 + " рублей. Одобрено");
        } else if (maxMonthPayment >= monthPayment30 && age7 <= 30) {
            System.out.println("Максимальный платеж при ЗП " + salary7 + " равен " + maxMonthPayment + " рублей. Платеж по кредиту " + monthPayment30 + " рублей. Одобрено");
        } else if (maxMonthPayment >= monthPayment && age7 > 30) {
            System.out.println("Максимальный платеж при ЗП " + salary7 + " равен " + maxMonthPayment + " рублей. Платеж по кредиту " + monthPayment + " рублей. Одобрено");
        } else if (maxMonthPayment <= monthPayment23 && age7 <= 23) {
            System.out.println("Максимальный платеж при ЗП " + salary7 + " равен " + maxMonthPayment + " рублей. Платеж по кредиту " + monthPayment23 + " рублей. Отказано");
        } else if (maxMonthPayment <= monthPayment30 && age7 <= 30) {
            System.out.println("Максимальный платеж при ЗП " + salary7 + " равен " + maxMonthPayment + " рублей. Платеж по кредиту " + monthPayment30 + " рублей. Отказано");
        } else if (maxMonthPayment <= monthPayment && age7 > 30) {
            System.out.println("Максимальный платеж при ЗП " + salary7 + " равен " + maxMonthPayment + " рублей. Платеж по кредиту " + monthPayment + " рублей. Отказано");
        }
    }
}