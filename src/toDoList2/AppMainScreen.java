//package toDoList2;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class AppMainScreen extends MyList{
//
//    private String input;
//
//    String printToTerminal() {
//        System.out.println(input);
//        scannerToOptions();
//        switch (input) {
//            case "1" -> System.out.println(createList());
//            case "2" -> System.out.println("This is case 2");
//            case "3" -> System.out.println("This is case 3");
//            default -> input = null;
//        }
//        return printToTerminal();
//    }
//
//    String scannerToOptions() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your option: ");
//        input = scanner.nextLine();
//
//        return input;
//    }
//}
