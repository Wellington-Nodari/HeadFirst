package toDoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pressione o botão 1 para adicionar um item à lista, 2 para editar, ou 3 para mostrar a lista. Pressione qualquer outra tecla para sair:");

        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            if (input.equals("1")) {
                System.out.println("Digite o item a ser adicionado:");
                String item = scanner.nextLine();
                lista.add(item);
                System.out.println("Item adicionado à lista.");
            } else if (input.equals("2")) {
                System.out.println("Digite o índice do item a ser editado:");
                int index = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer
                if (index >= 0 && index < lista.size()) {
                    System.out.println("Digite o novo valor para o item:");
                    String novoItem = scanner.nextLine();
                    lista.set(index, novoItem);
                    System.out.println("Item editado.");
                } else {
                    System.out.println("Índice inválido.");
                }
            } else if (input.equals("3")) {
                if (lista.isEmpty()) {
                    System.out.println("A lista está vazia.");
                } else {
                    System.out.println("Itens na lista:");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(i + ": " + lista.get(i));
                    }
                }
            } else {
                break;
            }
            System.out.println("Pressione 1 para adicionar, 2 para editar, 3 para mostrar a lista ou qualquer outra tecla para sair:");
        }
    }
}