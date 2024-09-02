public class Main {
    public static void main(String[] args) {
        int age = 19;
//        if (age >= 18) {
//            System.out.println("Ты должен праздновать!");
//            if (age < 21){
//                System.out.println("Выпей сливочного пива!");
//            } else {
//                System.out.println("Иди куда хочешь и пей что хочешь!");
//            }
//        } else
//            if (age >7){
//                System.out.println("Иди в школу!");
//            } else {
//                System.out.println("Иди в детский сад!");
//            }
        if (age == 18){
            System.out.println("С окончанием школы!");
        } else if (age == 21){
            System.out.println("Теперь тебе можно пить алкоголь!");
        } else if (age == 7){
            System.out.println("Иди в школу!");
        } else {
            System.out.println("Пока сказать нечего!");
        }

        switch (age){
            case 18:
                System.out.println("Welcome to the club buddy!");
                break;
            case 7:
                System.out.println("Go to school");
                break;
            case 21:
                System.out.println("You can be drunk)");
                break;
            default:
                System.out.println("Nothing to say");
        }
    }
}