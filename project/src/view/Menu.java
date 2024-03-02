package view;

import dao.TaskStorage;
import dao.UserStorage;
import model.Task;
import model.User;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    UserStorage userStorage = new UserStorage();

    User user_class = new User();
    Task task = new Task();

    public Menu(){

    }

    //method for creating menu
    public void menu(){

        userStorage.getUserData();
        user_class.pull(userStorage.return_users());
        user_class.print();


        int option;

        System.out.println("\nInforme o nome do usuario: ");
        String user = scanner.nextLine();
        user_class.create(user);
        while (true){
            System.out.println("\n\n===== Menu de Tarefas =====");
            System.out.println("1. Criar Tarefa");
            System.out.println("2. Apagar Tarefa");
            System.out.println("3. Pesquisar Tarefa");
            System.out.println("4. Mostrar Tarefas");
            System.out.println("===========================");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.print("Informe a prioridade: ");
                    String priority = scanner.nextLine();

                    System.out.print("Informe o conteúdo: ");
                    String content = scanner.nextLine();

                    task.create(user,priority,content);
                    break;
                case  2:
                    System.out.print("Informe o conteúdo: ");
                    String content_two = scanner.nextLine();
                    task.delete(content_two);
                    break;
                case 3:
                    System.out.print("Informe o conteúdo: ");
                    String content_three = scanner.nextLine();
                    task.search(content_three);
                    break;
                case 4:
                    task.print();
                    break;
                default:
                    System.out.println("Esta opcao não é valida!");
            }
            System.out.println("Deseja sair? [S/N]");
            String option_one = scanner.nextLine();
            if(option_one.equals("N") || option_one.equals("n")){}else{
                break;
            }
        }
        userStorage.storeUserData(user_class.getUsernameList());
    }
}
