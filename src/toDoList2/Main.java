package toDoList2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main (String [] args) {
        List userTasks = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        String x = "Welcome to your ToDo List App \n------------------------------------- \nPlease Select the Following Commands:\n-------------------------------------\n1. To Access your List\n2. To Add to your List\n3. To Edit your List\nAny key to Exit\n-------------------------------------\n:>_";
        String y = "-------------------------------------\n1. To Access your List\n2. To Add to your List\n3. To Edit your List\nAny key to Exit\n-------------------------------------\n:>_";


        System.out.println("Welcome to your ToDo List App");
        System.out.println("-------------------------------------");
        System.out.println("Please Select the Following Commands:");
        System.out.println("-------------------------------------");
        System.out.println("1. To Access your List");
        System.out.println("2. To Add to your List");
        System.out.println("3. To Edit your List");
        System.out.println("4. To Show the Menu");
        System.out.println("Any key to Exit");
        System.out.println("-------------------------------------");
        System.out.print(":>_");

        label:
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            switch (input) {
                case "2":
                    System.out.println("Digite o item a ser adicionado:");
                    String item = scanner.nextLine();
                    userTasks.add(item);
                    System.out.println("Item adicionado à lista.");System.out.print(y);
                    break;
                case "3":
                    System.out.println("Digite o índice do item a ser editado:");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    if (index >= 0 && index < userTasks.size()) {
                        System.out.println("Digite o novo valor para o item:");
                        String novoItem = scanner.nextLine();
                        userTasks.set(index, novoItem);
                        System.out.println("Item editado.");System.out.print(y);
                    } else {
                        System.out.println("Índice inválido.");System.out.print(y);
                    }
                    break;
                case "1":
                    if (userTasks.isEmpty()) {
                        System.out.println("A lista está vazia.");
                        System.out.print(y);
                    } else {
                        System.out.println("Itens na lista:");
                        for (int i = 0; i < userTasks.size(); i++) {
                            System.out.println(i + ": " + userTasks.get(i));

                        } System.out.print(y);
                    }
                    break;
                case "4":
                    System.out.println(x);
                    System.out.print(y);
                    break;
                default:
                    break label;
            }
        }
    }
    }
