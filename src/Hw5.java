import java.util.Scanner;

public class Hw5 {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");
        Scanner inputNum = new Scanner(System.in);
        System.out.println("Input number of your UI:");
        System.out.println("1 - IOS");
        System.out.println("2 - Android");
        int clientIOS = inputNum.nextInt();

        switch (clientIOS) {
            case 1:
                System.out.println("Install this lite version of the application for IOS using this link!");
                break;
            case 2:
                System.out.println("Install this lite version of the application for Android using this link!");
                break;
            default:
                System.out.println("Nothing to say :(");
        }
        System.out.println();

        //Task 2
        System.out.println("Task 2");
        Scanner inputYear = new Scanner(System.in);
        System.out.println("Input the year of your phone's creation:");
        int creationYear = inputYear.nextInt();
        Scanner inputIOS = new Scanner(System.in);
        System.out.println("Input number of your UI:");
        System.out.println("1 - IOS");
        System.out.println("2 - Android");
        int clientIOS2 = inputIOS.nextInt();

        boolean liteVersion = creationYear < 2015;

        if (liteVersion) {
            switch (clientIOS2) {
                case 1:
                    System.out.println("Install this lite version of the application for IOS using this link!");
                    break;
                case 2:
                    System.out.println("Install this lite version of the application for Android using this link!");
                    break;
                default:
                    System.out.println("Nothing to say!");
            }
        } else {
            switch (clientIOS2) {
                case 1:
                    System.out.println("Install that version of the application for IOS using this link!");
                    break;
                case 2:
                    System.out.println("Install that version of the application for Android using this link!");
                    break;
                default:
                    System.out.println("Nothing to say!");
            }

        }
        System.out.println();

        //Task 3
        System.out.println("Task 3");
        Scanner inputYear1 = new Scanner(System.in);
        System.out.println("Input the year");
        int thisYear = inputYear1.nextInt();

        boolean firstCheck = thisYear > 1584;
        boolean secondCheck = thisYear % 4 == 0 && thisYear % 100 != 0;
        boolean thirdCheck = thisYear % 400 == 0;

        if (firstCheck && (secondCheck || thirdCheck)) {
            System.out.println(thisYear + " год является високосным!");
        } else
            System.out.println(thisYear + " год не является високосным!");

        System.out.println();

        //Task 4
        System.out.println("Task 4");
        Scanner distance = new Scanner(System.in);
        System.out.println("Input the distance:");
        int deliveryDistance = distance.nextInt();

        boolean firstCircle = deliveryDistance <= 20;
        boolean secondCircle = deliveryDistance > 20 && deliveryDistance <= 60;
        boolean thirdCircle = deliveryDistance > 60 && deliveryDistance <= 100;
        boolean fourthCircle = deliveryDistance > 100;

        if (firstCircle) {
            System.out.println("Потребуется дней: 1");
        } else if (secondCircle) {
            System.out.println("Потребуется дней: 2");
        } else if (thirdCircle) {
            System.out.println("Потребуется дней: 3");
        } else if (fourthCircle) {
            System.out.println("Доставки нет!");
        } else
            System.out.println("Error!");

        System.out.println();

        //Task 5
        System.out.println("Task 5");
        Scanner monthNum = new Scanner(System.in);
        System.out.println("Input the month:");
        int monthNumber = monthNum.nextInt();

        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето! :)");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень!");
                break;
            default:
                System.out.println("Error!");
        }
    }
}
